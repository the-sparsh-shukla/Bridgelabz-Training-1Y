package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Customer Manager ---");
            System.out.println("1. Insert Customer");
            System.out.println("2. Search Customer by Name (LIKE)");
            System.out.println("3. Update Phone");
            System.out.println("4. Delete Customer");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertCustomer(scanner);
                    break;
                case 2:
                    searchCustomer(scanner);
                    break;
                case 3:
                    updatePhone(scanner);
                    break;
                case 4:
                    deleteCustomer(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS customers ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "phone VARCHAR(20) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating customers table: " + e.getMessage());
        }
    }

    private static void insertCustomer(Scanner scanner) {
        String sql = "INSERT INTO customers(id, name, phone) VALUES (?, ?, ?)";

        System.out.print("Enter customer id: ");
        int id = readInt(scanner);
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Name and phone are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, phone);
            ps.executeUpdate();
            System.out.println("Customer inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting customer: " + e.getMessage());
        }
    }

    private static void searchCustomer(Scanner scanner) {
        String sql = "SELECT id, name, phone FROM customers WHERE name LIKE ?";

        System.out.print("Enter name keyword: ");
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
                System.out.println("Matching customers:");
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("phone"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No matching customer found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error searching customers: " + e.getMessage());
        }
    }

    private static void updatePhone(Scanner scanner) {
        String sql = "UPDATE customers SET phone = ? WHERE id = ?";

        System.out.print("Enter customer id: ");
        int id = readInt(scanner);
        System.out.print("Enter new phone: ");
        String phone = scanner.nextLine().trim();

        if (phone.isEmpty()) {
            System.out.println("Phone cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, phone);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("Phone updated successfully.");
            } else {
                System.out.println("Customer not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating customer: " + e.getMessage());
        }
    }

    private static void deleteCustomer(Scanner scanner) {
        String sql = "DELETE FROM customers WHERE id = ?";

        System.out.print("Enter customer id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            if (deleted > 0) {
                System.out.println("Customer deleted successfully.");
            } else {
                System.out.println("Customer not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting customer: " + e.getMessage());
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
