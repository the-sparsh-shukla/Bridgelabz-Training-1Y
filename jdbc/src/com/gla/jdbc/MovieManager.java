package com.gla.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MovieManager {
    public static void run(Scanner scanner) {
        createTable();

        while (true) {
            System.out.println("\n--- Movie Manager ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Show Movies with Available Seats");
            System.out.println("3. Reduce Seats (Booking)");
            System.out.println("4. Delete Movie");
            System.out.println("0. Back to Main Menu");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);
            switch (choice) {
                case 1:
                    addMovie(scanner);
                    break;
                case 2:
                    showAvailableMovies();
                    break;
                case 3:
                    bookSeats(scanner);
                    break;
                case 4:
                    deleteMovie(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS movies ("
                + "id INT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "seats INT NOT NULL)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Error creating movies table: " + e.getMessage());
        }
    }

    private static void addMovie(Scanner scanner) {
        String sql = "INSERT INTO movies(id, name, seats) VALUES (?, ?, ?)";

        System.out.print("Enter movie id: ");
        int id = readInt(scanner);
        System.out.print("Enter movie name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter seats: ");
        int seats = readInt(scanner);

        if (name.isEmpty()) {
            System.out.println("Movie name cannot be empty.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, seats);
            ps.executeUpdate();
            System.out.println("Movie added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding movie: " + e.getMessage());
        }
    }

    private static void showAvailableMovies() {
        String sql = "SELECT id, name, seats FROM movies WHERE seats > 0";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            try (ResultSet rs = ps.executeQuery()) {
                boolean found = false;
                System.out.println("Movies with available seats:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("seats"));
                    found = true;
                }
                if (!found) {
                    System.out.println("No movies with available seats.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error reading movies: " + e.getMessage());
        }
    }

    private static void bookSeats(Scanner scanner) {
        String sql = "UPDATE movies SET seats = seats - ? WHERE id = ? AND seats >= ?";

        System.out.print("Enter movie id: ");
        int id = readInt(scanner);
        System.out.print("Enter seats to book: ");
        int seatsToBook = readInt(scanner);

        if (seatsToBook <= 0) {
            System.out.println("Seats to book must be positive.");
            return;
        }

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, seatsToBook);
            ps.setInt(2, id);
            ps.setInt(3, seatsToBook);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("Booking successful.");
            } else {
                System.out.println("Booking failed: movie not found or insufficient seats.");
            }
        } catch (SQLException e) {
            System.out.println("Error booking seats: " + e.getMessage());
        }
    }

    private static void deleteMovie(Scanner scanner) {
        String sql = "DELETE FROM movies WHERE id = ?";

        System.out.print("Enter movie id: ");
        int id = readInt(scanner);

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con == null ? null : con.prepareStatement(sql)) {
            if (con == null) {
                return;
            }
            ps.setInt(1, id);
            int deleted = ps.executeUpdate();
            System.out.println(deleted > 0 ? "Movie deleted." : "Movie not found.");
        } catch (SQLException e) {
            System.out.println("Error deleting movie: " + e.getMessage());
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
