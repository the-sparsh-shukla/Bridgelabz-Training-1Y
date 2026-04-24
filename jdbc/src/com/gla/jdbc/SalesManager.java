package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SalesManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Sales Manager ---");
            System.out.println("1. Insert Sale");
            System.out.println("2. Show Sales with Quantity > 1");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Sale Entry");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertSale(scanner);
                    break;
                case 2:
                    showBulkSales();
                    break;
                case 3:
                    updateQuantity(scanner);
                    break;
                case 4:
                    deleteSale(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS sales ("
                + "id INT PRIMARY KEY, "
                + "bookName VARCHAR(120) NOT NULL, "
                + "quantity INT NOT NULL, "
                + "price DOUBLE NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating sales table: " + e.getMessage());
        }
    }

    private static void insertSale(Scanner scanner) {
        String sql = "INSERT INTO sales(id, bookName, quantity, price) VALUES (?, ?, ?, ?)";

        System.out.print("Enter sale id: ");
        int id = readInt(scanner);
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine().trim();
        System.out.print("Enter quantity: ");
        int quantity = readInt(scanner);
        System.out.print("Enter price: ");
        double price = readDouble(scanner);

        if (bookName.isEmpty()) {
            System.out.println("Book name cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, bookName);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);
            ps.executeUpdate();
            System.out.println("Sale inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting sale: " + e.getMessage());
        }
    }

    private static void showBulkSales() {
        String sql = "SELECT id, bookName, quantity, price FROM sales WHERE quantity > 1";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("bookName") + " | "
                            + rs.getInt("quantity") + " | " + rs.getDouble("price"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No matching sales found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading sales: " + e.getMessage());
        }
    }

    private static void updateQuantity(Scanner scanner) {
        String sql = "UPDATE sales SET quantity = ? WHERE id = ?";

        System.out.print("Enter sale id: ");
        int id = readInt(scanner);
        System.out.print("Enter new quantity: ");
        int quantity = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, quantity);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Sale quantity updated." : "Sale entry not found.");
        } catch (SQLException e) {
            System.out.println("Error updating quantity: " + e.getMessage());
        }
    }

    private static void deleteSale(Scanner scanner) {
        String sql = "DELETE FROM sales WHERE id = ?";

        System.out.print("Enter sale id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Sale entry deleted." : "Sale entry not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting sale: " + e.getMessage());
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

    private static double readDouble(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
