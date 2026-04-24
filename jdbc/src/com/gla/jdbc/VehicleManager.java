package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class VehicleManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Vehicle Manager ---");
            System.out.println("1. Insert Vehicle");
            System.out.println("2. Show Pending Vehicles");
            System.out.println("3. Update Status to Completed");
            System.out.println("4. Delete Vehicle Record");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertVehicle(scanner);
                    break;
                case 2:
                    showPendingVehicles();
                    break;
                case 3:
                    updateToCompleted(scanner);
                    break;
                case 4:
                    deleteVehicle(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS vehicles ("
                + "regNo VARCHAR(30) PRIMARY KEY, "
                + "owner VARCHAR(100) NOT NULL, "
                + "status VARCHAR(30) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating vehicles table: " + e.getMessage());
        }
    }

    private static void insertVehicle(Scanner scanner) {
        String sql = "INSERT INTO vehicles(regNo, owner, status) VALUES (?, ?, ?)";

        System.out.print("Enter registration number: ");
        String regNo = scanner.nextLine().trim();
        System.out.print("Enter owner name: ");
        String owner = scanner.nextLine().trim();
        System.out.print("Enter status (Pending/Completed): ");
        String status = scanner.nextLine().trim();

        if (regNo.isEmpty() || owner.isEmpty() || status.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, regNo);
            ps.setString(2, owner);
            ps.setString(3, status);
            ps.executeUpdate();
            System.out.println("Vehicle inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting vehicle: " + e.getMessage());
        }
    }

    private static void showPendingVehicles() {
        String sql = "SELECT regNo, owner, status FROM vehicles WHERE status = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Pending");
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getString("regNo") + " | " + rs.getString("owner") + " | " + rs.getString("status"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No pending vehicles.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading vehicles: " + e.getMessage());
        }
    }

    private static void updateToCompleted(Scanner scanner) {
        String sql = "UPDATE vehicles SET status = ? WHERE regNo = ?";

        System.out.print("Enter registration number: ");
        String regNo = scanner.nextLine().trim();

        if (regNo.isEmpty()) {
            System.out.println("Registration number cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Completed");
            ps.setString(2, regNo);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Status updated to Completed." : "Vehicle not found.");
        } catch (SQLException e) {
            System.out.println("Error updating vehicle: " + e.getMessage());
        }
    }

    private static void deleteVehicle(Scanner scanner) {
        String sql = "DELETE FROM vehicles WHERE regNo = ?";

        System.out.print("Enter registration number: ");
        String regNo = scanner.nextLine().trim();

        if (regNo.isEmpty()) {
            System.out.println("Registration number cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, regNo);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Vehicle deleted." : "Vehicle not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting vehicle: " + e.getMessage());
        }
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid integer: ");
            }
        }
    }
}
