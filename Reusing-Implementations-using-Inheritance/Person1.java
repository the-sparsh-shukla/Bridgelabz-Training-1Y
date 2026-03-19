package INHERITENCE;

public
    class Person1 {
        protected String name;
        protected int age;

        public Person1 (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayBasicInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Teacher subclass
    class Teacher extends Person1 {
        private String subject;
        private int yearsOfExperience;

        public Teacher(String name, int age, String subject, int yearsOfExperience) {
            super(name, age);
            this.subject = subject;
            this.yearsOfExperience = yearsOfExperience;
        }

        public void displayRole() {
            displayBasicInfo();
            System.out.println("Role: Teacher");
            System.out.println("Subject: " + subject);
            System.out.println("Experience: " + yearsOfExperience + " years");
            System.out.println("---");
        }
    }

    // Student subclass
    class Student extends Person1 {
        private int grade;
        private double gpa;

        public Student(String name, int age, int grade, double gpa) {
            super(name, age);
            this.grade = grade;
            this.gpa = gpa;
        }

        public void displayRole() {
            displayBasicInfo();
            System.out.println("Role: Student");
            System.out.println("Grade: " + grade);
            System.out.println("GPA: " + String.format("%.2f", gpa));
            System.out.println("---");
        }
    }

    // Staff subclass
    class Staff extends Person1 {
        private String department;
        private String position;

        public Staff(String name, int age, String department, String position) {
            super(name, age);
            this.department = department;
            this.position = position;
        }

        public void displayRole() {
            displayBasicInfo();
            System.out.println("Role: Staff");
            System.out.println("Department: " + department);
            System.out.println("Position: " + position);
            System.out.println("---");
        }
    }

    // Main class demonstrating hierarchical inheritance
    public class SchoolManagementSystem {
        public static void main(String[] args) {
            // Hierarchical inheritance: multiple subclasses from single parent
            Person[] schoolMembers = {
                    new Teacher("Mr. Smith", 45, "Mathematics", 15),
                    new Student("Alice Johnson", 16, 10, 3.85),
                    new Staff("Ms. Brown", 38, "Administration", "Principal"),
                    new Teacher("Dr. Patel", 52, "Physics", 25),
                    new Student("Bob Wilson", 15, 9, 3.92)
            };

            System.out.println("School Management System - Hierarchical Inheritance");
            System.out.println("==================================================");

            // Demonstrate polymorphism with instanceof checking
            for (Person1 person : schoolMembers) {
                if (person instanceof Teacher) {
                    ((Teacher) person).displayRole();
                } else if (person instanceof Student) {
                    ((Student) person).displayRole();
                } else if (person instanceof Staff) {
                    ((Staff) person).displayRole();
                }
            }
        }
    }

}
