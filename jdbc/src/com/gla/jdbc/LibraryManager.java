package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Library Manager ---");
            System.out.println("1. Insert Book");
            System.out.println("2. Show Available Books");
            System.out.println("3. Update Status to Issued");
            System.out.println("4. Delete Lost Books");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertBook(scanner);
                    break;
                case 2:
                    showAvailableBooks();
                    break;
                case 3:
                    updateStatusToIssued(scanner);
                    break;
                case 4:
                    deleteLostBooks();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS books ("
                + "id INT PRIMARY KEY, "
                + "title VARCHAR(150) NOT NULL, "
                + "author VARCHAR(100) NOT NULL, "
                + "status VARCHAR(20) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating books table: " + e.getMessage());
        }
    }

    private static void insertBook(Scanner scanner) {
        String sql = "INSERT INTO books(id, title, author, status) VALUES (?, ?, ?, ?)";

        System.out.print("Enter book id: ");
        int id = readInt(scanner);
        System.out.print("Enter title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter status (Available/Issued/Lost): ");
        String status = scanner.nextLine().trim();

        if (title.isEmpty() || author.isEmpty() || status.isEmpty()) {
            System.out.println("Title, author, and status are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setString(4, status);
            ps.executeUpdate();
            System.out.println("Book inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting book: " + e.getMessage());
        }
    }

    private static void showAvailableBooks() {
        String sql = "SELECT id, title, author, status FROM books WHERE status = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Available");
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println("Available books:");
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("title") + " | "
                            + rs.getString("author") + " | " + rs.getString("status"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No available books.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading books: " + e.getMessage());
        }
    }

    private static void updateStatusToIssued(Scanner scanner) {
        String sql = "UPDATE books SET status = ? WHERE id = ?";

        System.out.print("Enter book id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Issued");
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("Book status updated to Issued.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating book status: " + e.getMessage());
        }
    }

    private static void deleteLostBooks() {
        String sql = "DELETE FROM books WHERE status = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Lost");
            int deleted = ps.executeUpdate();
            System.out.println("Deleted " + deleted + " lost book(s).");
        } catch (SQLException e) {
            System.out.println("Error deleting books: " + e.getMessage());
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
