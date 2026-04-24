package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GymManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Gym Manager ---");
            System.out.println("1. Insert Member");
            System.out.println("2. Show Premium Members");
            System.out.println("3. Update Months");
            System.out.println("4. Delete Expired Members");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertMember(scanner);
                    break;
                case 2:
                    showPremiumMembers();
                    break;
                case 3:
                    updateMonths(scanner);
                    break;
                case 4:
                    deleteExpiredMembers();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS members ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "type VARCHAR(50) NOT NULL, "
                + "months INT NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating members table: " + e.getMessage());
        }
    }

    private static void insertMember(Scanner scanner) {
        String sql = "INSERT INTO members(id, name, type, months) VALUES (?, ?, ?, ?)";

        System.out.print("Enter member id: ");
        int id = readInt(scanner);
        System.out.print("Enter member name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter membership type (Premium/Basic): ");
        String type = scanner.nextLine().trim();
        System.out.print("Enter months: ");
        int months = readInt(scanner);

        if (name.isEmpty() || type.isEmpty()) {
            System.out.println("Name and type are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type);
            ps.setInt(4, months);
            ps.executeUpdate();
            System.out.println("Member inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting member: " + e.getMessage());
        }
    }

    private static void showPremiumMembers() {
        String sql = "SELECT id, name, type, months FROM members WHERE type = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Premium");
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | "
                            + rs.getString("type") + " | " + rs.getInt("months"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No premium members found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading members: " + e.getMessage());
        }
    }

    private static void updateMonths(Scanner scanner) {
        String sql = "UPDATE members SET months = ? WHERE id = ?";

        System.out.print("Enter member id: ");
        int id = readInt(scanner);
        System.out.print("Enter new months: ");
        int months = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, months);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Months updated." : "Member not found.");
        } catch (SQLException e) {
            System.out.println("Error updating months: " + e.getMessage());
        }
    }

    private static void deleteExpiredMembers() {
        String sql = "DELETE FROM members WHERE months <= 0";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            int deleted = ps.executeUpdate();
            System.out.println("Deleted " + deleted + " expired member(s).");
        } catch (SQLException e) {
            System.out.println("Error deleting expired members: " + e.getMessage());
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
