package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TaskManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Insert Task");
            System.out.println("2. Show Pending Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Completed Tasks");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertTask(scanner);
                    break;
                case 2:
                    showPendingTasks();
                    break;
                case 3:
                    updateToCompleted(scanner);
                    break;
                case 4:
                    deleteCompletedTasks();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS tasks ("
                + "id INT PRIMARY KEY, "
                + "title VARCHAR(150) NOT NULL, "
                + "status VARCHAR(30) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating tasks table: " + e.getMessage());
        }
    }

    private static void insertTask(Scanner scanner) {
        String sql = "INSERT INTO tasks(id, title, status) VALUES (?, ?, ?)";

        System.out.print("Enter task id: ");
        int id = readInt(scanner);
        System.out.print("Enter task title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter status (Pending/Completed): ");
        String status = scanner.nextLine().trim();

        if (title.isEmpty() || status.isEmpty()) {
            System.out.println("Title and status are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, status);
            ps.executeUpdate();
            System.out.println("Task inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting task: " + e.getMessage());
        }
    }

    private static void showPendingTasks() {
        String sql = "SELECT id, title, status FROM tasks WHERE status = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Pending");
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("title") + " | " + rs.getString("status"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No pending tasks.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading tasks: " + e.getMessage());
        }
    }

    private static void updateToCompleted(Scanner scanner) {
        String sql = "UPDATE tasks SET status = ? WHERE id = ?";

        System.out.print("Enter task id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Completed");
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Task marked as completed." : "Task not found.");
        } catch (SQLException e) {
            System.out.println("Error updating task: " + e.getMessage());
        }
    }

    private static void deleteCompletedTasks() {
        String sql = "DELETE FROM tasks WHERE status = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, "Completed");
            int deleted = ps.executeUpdate();
            System.out.println("Deleted " + deleted + " completed task(s).");
        } catch (SQLException e) {
            System.out.println("Error deleting completed tasks: " + e.getMessage());
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
