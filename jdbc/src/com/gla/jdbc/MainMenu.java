package com.gla.jdbc;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== JDBC Main Menu =====");
            System.out.println("1. Employee Manager");
            System.out.println("2. Product Manager");
            System.out.println("3. Library Manager");
            System.out.println("4. Customer Manager");
            System.out.println("5. Banking Manager");
            System.out.println("6. Movie Manager");
            System.out.println("7. Hospital Manager");
            System.out.println("8. Vehicle Manager");
            System.out.println("9. Enrollment Manager");
            System.out.println("10. Menu Manager");
            System.out.println("11. Gym Manager");
            System.out.println("12. Sales Manager");
            System.out.println("13. Task Manager");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = readInt(scanner);

            switch (choice) {
                case 1:
                    EmployeeManager.run(scanner);
                    break;
                case 2:
                    ProductManager.run(scanner);
                    break;
                case 3:
                    LibraryManager.run(scanner);
                    break;
                case 4:
                    CustomerManager.run(scanner);
                    break;
                case 5:
                    BankingManager.run(scanner);
                    break;
                case 6:
                    MovieManager.run(scanner);
                    break;
                case 7:
                    HospitalManager.run(scanner);
                    break;
                case 8:
                    VehicleManager.run(scanner);
                    break;
                case 9:
                    EnrollmentManager.run(scanner);
                    break;
                case 10:
                    MenuManager.run(scanner);
                    break;
                case 11:
                    GymManager.run(scanner);
                    break;
                case 12:
                    SalesManager.run(scanner);
                    break;
                case 13:
                    TaskManager.run(scanner);
                    break;
                case 0:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 0-13.");
            }
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
