package StoryProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoryProblem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store ID → Name
        HashMap<Integer, String> students = new HashMap<>();

        // Store ID → Courses
        HashMap<Integer, ArrayList<String>> courses = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Register Course");
            System.out.println("3. View All");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (students.containsKey(id)) {
                    System.out.println("ID already exists!");
                } else {
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    students.put(id, name);
                    courses.put(id, new ArrayList<>());

                    System.out.println("Student added!");
                }
            }

            else if (choice == 2) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                if (!students.containsKey(id)) {
                    System.out.println("Student not found!");
                } else {
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    courses.get(id).add(course);
                    System.out.println("Course added!");
                }
            }

            else if (choice == 3) {
                for (int id : students.keySet()) {
                    System.out.println("\nID: " + id);
                    System.out.println("Name: " + students.get(id));
                    System.out.println("Courses: " + courses.get(id));
                }
            }

            else if (choice == 4) {
                System.out.println("Exit...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}