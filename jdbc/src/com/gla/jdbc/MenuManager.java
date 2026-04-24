package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Restaurant Menu Manager ---");
            System.out.println("1. Insert Menu Item");
            System.out.println("2. Show Items with Price < 200");
            System.out.println("3. Update Price");
            System.out.println("4. Delete Item");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertItem(scanner);
                    break;
                case 2:
                    showAffordableItems();
                    break;
                case 3:
                    updatePrice(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS menu ("
                + "id INT PRIMARY KEY, "
                + "itemName VARCHAR(100) NOT NULL, "
                + "price DOUBLE NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating menu table: " + e.getMessage());
        }
    }

    private static void insertItem(Scanner scanner) {
        String sql = "INSERT INTO menu(id, itemName, price) VALUES (?, ?, ?)";

        System.out.print("Enter item id: ");
        int id = readInt(scanner);
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine().trim();
        System.out.print("Enter price: ");
        double price = readDouble(scanner);

        if (itemName.isEmpty()) {
            System.out.println("Item name cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, itemName);
            ps.setDouble(3, price);
            ps.executeUpdate();
            System.out.println("Menu item inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting menu item: " + e.getMessage());
        }
    }

    private static void showAffordableItems() {
        String sql = "SELECT id, itemName, price FROM menu WHERE price < 200";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("itemName") + " | " + rs.getDouble("price"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No items below 200.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading menu: " + e.getMessage());
        }
    }

    private static void updatePrice(Scanner scanner) {
        String sql = "UPDATE menu SET price = ? WHERE id = ?";

        System.out.print("Enter item id: ");
        int id = readInt(scanner);
        System.out.print("Enter new price: ");
        double price = readDouble(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setDouble(1, price);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Price updated." : "Item not found.");
        } catch (SQLException e) {
            System.out.println("Error updating item price: " + e.getMessage());
        }
    }

    private static void deleteItem(Scanner scanner) {
        String sql = "DELETE FROM menu WHERE id = ?";

        System.out.print("Enter item id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Item deleted." : "Item not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting item: " + e.getMessage());
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
