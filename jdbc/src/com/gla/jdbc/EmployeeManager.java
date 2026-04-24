package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Employee Manager ---");
            System.out.println("1. Insert Employee");
            System.out.println("2. Show Employees with Salary > 30000");
            System.out.println("3. Increase Salary by 10% (All)");
            System.out.println("4. Delete Employees with Salary < 15000");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    insertEmployee(scanner);
                    break;
                case 2:
                    showHighSalaryEmployees();
                    break;
                case 3:
                    increaseSalary();
                    break;
                case 4:
                    deleteLowSalaryEmployees();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS employee ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "salary DOUBLE NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating employee table: " + e.getMessage());
        }
    }

    private static void insertEmployee(Scanner scanner) {
        String sql = "INSERT INTO employee(id, name, salary) VALUES (?, ?, ?)";

        System.out.print("Enter employee id: ");
        int id = readInt(scanner);
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter salary: ");
        double salary = readDouble(scanner);

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Employee inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting employee: " + e.getMessage());
        }
    }

    private static void showHighSalaryEmployees() {
        String sql = "SELECT id, name, salary FROM employee WHERE salary > 30000";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println("Employees with salary > 30000:");
                boolean found = false;
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getDouble("salary"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No records found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading employees: " + e.getMessage());
        }
    }

    private static void increaseSalary() {
        String sql = "UPDATE employee SET salary = salary * 1.10";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            int updated = ps.executeUpdate();
            System.out.println("Updated salary for " + updated + " employee(s).");
        } catch (SQLException e) {
            System.out.println("Error updating salary: " + e.getMessage());
        }
    }

    private static void deleteLowSalaryEmployees() {
        String sql = "DELETE FROM employee WHERE salary < 15000";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            int deleted = ps.executeUpdate();
            System.out.println("Deleted " + deleted + " employee(s).");
        } catch (SQLException e) {
            System.out.println("Error deleting employees: " + e.getMessage());
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
