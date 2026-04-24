package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Hospital Manager ---");
            System.out.println("1. Insert Patient");
            System.out.println("2. Search by Disease");
            System.out.println("3. Update Disease");
            System.out.println("4. Delete Patient Record");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertPatient(scanner);
                    break;
                case 2:
                    searchByDisease(scanner);
                    break;
                case 3:
                    updateDisease(scanner);
                    break;
                case 4:
                    deletePatient(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS patients ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "disease VARCHAR(100) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating patients table: " + e.getMessage());
        }
    }

    private static void insertPatient(Scanner scanner) {
        String sql = "INSERT INTO patients(id, name, disease) VALUES (?, ?, ?)";

        System.out.print("Enter patient id: ");
        int id = readInt(scanner);
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter disease: ");
        String disease = scanner.nextLine().trim();

        if (name.isEmpty() || disease.isEmpty()) {
            System.out.println("Name and disease are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, disease);
            ps.executeUpdate();
            System.out.println("Patient inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting patient: " + e.getMessage());
        }
    }

    private static void searchByDisease(Scanner scanner) {
        String sql = "SELECT id, name, disease FROM patients WHERE disease LIKE ?";

        System.out.print("Enter disease keyword: ");
        String keyword = scanner.nextLine().trim();

        if (keyword.isEmpty()) {
            System.out.println("Keyword cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("disease"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No records found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error searching patient records: " + e.getMessage());
        }
    }

    private static void updateDisease(Scanner scanner) {
        String sql = "UPDATE patients SET disease = ? WHERE id = ?";

        System.out.print("Enter patient id: ");
        int id = readInt(scanner);
        System.out.print("Enter new disease: ");
        String disease = scanner.nextLine().trim();

        if (disease.isEmpty()) {
            System.out.println("Disease cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, disease);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Disease updated." : "Patient not found.");
        } catch (SQLException e) {
            System.out.println("Error updating disease: " + e.getMessage());
        }
    }

    private static void deletePatient(Scanner scanner) {
        String sql = "DELETE FROM patients WHERE id = ?";

        System.out.print("Enter patient id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Patient deleted." : "Patient not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting patient: " + e.getMessage());
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
