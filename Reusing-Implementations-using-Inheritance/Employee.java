package INHERITENCE;

public class Employee {
        protected String name;
        protected String id;
        protected double salary;

        public Employee(String name, String id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
        }
    }

    // Manager subclass
    class Manager extends Employee {
        private int teamSize;

        public Manager(String name, String id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Manager, Team Size: " + teamSize);
            System.out.println("---");
        }
    }

    // Developer subclass
    class Developer extends Employee {
        private String programmingLanguage;

        public Developer(String name, String id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Developer, Language: " + programmingLanguage);
            System.out.println("---");
        }
    }

    // Intern subclass
    class Intern extends Employee {
        private String mentorName;

        public Intern(String name, String id, double salary, String mentorName) {
            super(name, id, salary);
            this.mentorName = mentorName;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Intern, Mentor: " + mentorName);
            System.out.println("---");
        }
    }

    // Test the hierarchy
    public class EmployeeManagementSystem {
        public static void main(String[] args) {
            Employee[] employees = {
                    new Manager("Alice Johnson", "M001", 85000, 8),
                    new Developer("Bob Smith", "D101", 65000, "Java"),
                    new Intern("Carol Lee", "I201", 25000, "David Brown")
            };

            System.out.println("Employee Management System");
            System.out.println("==========================");

            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }
    }

}
