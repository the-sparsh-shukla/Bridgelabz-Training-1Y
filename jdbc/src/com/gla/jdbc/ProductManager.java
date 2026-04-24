package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Product Manager ---");
            System.out.println("1. Insert 3 Products");
            System.out.println("2. Show Low Stock (qty < 10)");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Discontinued Products");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertThreeProducts(scanner);
                    break;
                case 2:
                    showLowStock();
                    break;
                case 3:
                    updateQuantity(scanner);
                    break;
                case 4:
                    deleteDiscontinued();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS product ("
                + "pid INT PRIMARY KEY, "
                + "pname VARCHAR(100) NOT NULL, "
                + "qty INT NOT NULL, "
                + "discontinued BOOLEAN DEFAULT FALSE)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating product table: " + e.getMessage());
        }
    }

    private static void insertThreeProducts(Scanner scanner) {
        String sql = "INSERT INTO product(pid, pname, qty, discontinued) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }

            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter details for product " + i + ":");
                System.out.print("PID: ");
                int pid = readInt(scanner);
                System.out.print("Product name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Quantity: ");
                int qty = readInt(scanner);
                System.out.print("Is discontinued? (yes/no): ");
                String discontinuedInput = scanner.nextLine().trim();
                boolean discontinued = discontinuedInput.equalsIgnoreCase("yes");

                if (name.isEmpty()) {
                    System.out.println("Product name cannot be empty. Skipping this entry.");
                    continue;
                }

                ps.setInt(1, pid);
                ps.setString(2, name);
                ps.setInt(3, qty);
                ps.setBoolean(4, discontinued);
                ps.executeUpdate();
            }

            System.out.println("Insert operation completed.");
        } catch (SQLException e) {
            System.out.println("Error inserting products: " + e.getMessage());
        }
    }

    private static void showLowStock() {
        String sql = "SELECT pid, pname, qty FROM product WHERE qty < 10";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println("Low stock products:");
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("pid") + " | " + rs.getString("pname") + " | " + rs.getInt("qty"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No low stock products.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading products: " + e.getMessage());
        }
    }

    private static void updateQuantity(Scanner scanner) {
        String sql = "UPDATE product SET qty = ? WHERE pid = ?";

        System.out.print("Enter product id: ");
        int pid = readInt(scanner);
        System.out.print("Enter new quantity: ");
        int qty = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, qty);
            ps.setInt(2, pid);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("Product updated successfully.");
            } else {
                System.out.println("Product not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating product: " + e.getMessage());
        }
    }

    private static void deleteDiscontinued() {
        String sql = "DELETE FROM product WHERE discontinued = TRUE";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            int deleted = ps.executeUpdate();
            System.out.println("Deleted " + deleted + " discontinued product(s).");
        } catch (SQLException e) {
            System.out.println("Error deleting products: " + e.getMessage());
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
