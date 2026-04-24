package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Banking Manager ---");
            System.out.println("1. Add Account");
            System.out.println("2. Show Accounts with Balance > 10000");
            System.out.println("3. Deposit / Withdraw");
            System.out.println("4. Delete Account");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    addAccount(scanner);
                    break;
                case 2:
                    showRichAccounts();
                    break;
                case 3:
                    transaction(scanner);
                    break;
                case 4:
                    deleteAccount(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS accounts ("
                + "accNo BIGINT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "balance DOUBLE NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating accounts table: " + e.getMessage());
        }
    }

    private static void addAccount(Scanner scanner) {
        String sql = "INSERT INTO accounts(accNo, name, balance) VALUES (?, ?, ?)";

        System.out.print("Enter account number: ");
        long accNo = readLong(scanner);
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter opening balance: ");
        double balance = readDouble(scanner);

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setLong(1, accNo);
            ps.setString(2, name);
            ps.setDouble(3, balance);
            ps.executeUpdate();
            System.out.println("Account added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding account: " + e.getMessage());
        }
    }

    private static void showRichAccounts() {
        String sql = "SELECT accNo, name, balance FROM accounts WHERE balance > 10000";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                System.out.println("Accounts with balance > 10000:");
                while (rs.next()) {
                    System.out.println(rs.getLong("accNo") + " | " + rs.getString("name") + " | " + rs.getDouble("balance"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No matching accounts found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading accounts: " + e.getMessage());
        }
    }

    private static void transaction(Scanner scanner) {
        System.out.print("Enter account number: ");
        long accNo = readLong(scanner);
        System.out.print("Enter operation (deposit/withdraw): ");
        String operation = scanner.nextLine().trim();
        System.out.print("Enter amount: ");
        double amount = readDouble(scanner);

        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }

        if (operation.equalsIgnoreCase("deposit")) {
            String sql = "UPDATE accounts SET balance = balance + ? WHERE accNo = ?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
                if (con == null) {
                    return;
                }
                ps.setDouble(1, amount);
                ps.setLong(2, accNo);
                int updated = ps.executeUpdate();
                System.out.println(updated > 0 ? "Deposit successful." : "Account not found.");
            } catch (SQLException e) {
                System.out.println("Error during deposit: " + e.getMessage());
            }
        } else if (operation.equalsIgnoreCase("withdraw")) {
            String sql = "UPDATE accounts SET balance = balance - ? WHERE accNo = ? AND balance >= ?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
                if (con == null) {
                    return;
                }
                ps.setDouble(1, amount);
                ps.setLong(2, accNo);
                ps.setDouble(3, amount);
                int updated = ps.executeUpdate();
                if (updated > 0) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Withdrawal failed: account not found or insufficient balance.");
                }
            } catch (SQLException e) {
                System.out.println("Error during withdrawal: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid operation. Use deposit or withdraw.");
        }
    }

    private static void deleteAccount(Scanner scanner) {
        String sql = "DELETE FROM accounts WHERE accNo = ?";

        System.out.print("Enter account number: ");
        long accNo = readLong(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setLong(1, accNo);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Account deleted." : "Account not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting account: " + e.getMessage());
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

    private static long readLong(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid whole number: ");
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
