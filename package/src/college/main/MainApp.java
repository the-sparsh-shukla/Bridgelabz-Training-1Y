package college.main;

import college.department.Department;
import college.faculty.Faculty;
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Aarav");
        Faculty faculty = new Faculty("Dr. Mehta");
        Department department = new Department("Computer Science");

        System.out.println("Student: " + student.getName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Department: " + department.getName());
    }
}