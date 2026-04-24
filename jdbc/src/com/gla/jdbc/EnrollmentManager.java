package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EnrollmentManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Enrollment Manager ---");
            System.out.println("1. Insert Enrollment");
            System.out.println("2. Search by Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Enrollment");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertEnrollment(scanner);
                    break;
                case 2:
                    searchByCourse(scanner);
                    break;
                case 3:
                    updateCourse(scanner);
                    break;
                case 4:
                    deleteEnrollment(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS enrollments ("
                + "id INT PRIMARY KEY, "
                + "student VARCHAR(100) NOT NULL, "
                + "course VARCHAR(100) NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating enrollments table: " + e.getMessage());
        }
    }

    private static void insertEnrollment(Scanner scanner) {
        String sql = "INSERT INTO enrollments(id, student, course) VALUES (?, ?, ?)";

        System.out.print("Enter enrollment id: ");
        int id = readInt(scanner);
        System.out.print("Enter student name: ");
        String student = scanner.nextLine().trim();
        System.out.print("Enter course name: ");
        String course = scanner.nextLine().trim();

        if (student.isEmpty() || course.isEmpty()) {
            System.out.println("Student and course are required.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, student);
            ps.setString(3, course);
            ps.executeUpdate();
            System.out.println("Enrollment inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting enrollment: " + e.getMessage());
        }
    }

    private static void searchByCourse(Scanner scanner) {
        String sql = "SELECT id, student, course FROM enrollments WHERE course LIKE ?";

        System.out.print("Enter course keyword: ");
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
                    System.out.println(rs.getInt("id") + " | " + rs.getString("student") + " | " + rs.getString("course"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No matching records found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error searching enrollments: " + e.getMessage());
        }
    }

    private static void updateCourse(Scanner scanner) {
        String sql = "UPDATE enrollments SET course = ? WHERE id = ?";

        System.out.print("Enter enrollment id: ");
        int id = readInt(scanner);
        System.out.print("Enter new course name: ");
        String course = scanner.nextLine().trim();

        if (course.isEmpty()) {
            System.out.println("Course cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setString(1, course);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            System.out.println(updated > 0 ? "Enrollment updated." : "Enrollment not found.");
        } catch (SQLException e) {
            System.out.println("Error updating enrollment: " + e.getMessage());
        }
    }

    private static void deleteEnrollment(Scanner scanner) {
        String sql = "DELETE FROM enrollments WHERE id = ?";

        System.out.print("Enter enrollment id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Enrollment deleted." : "Enrollment not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting enrollment: " + e.getMessage());
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
