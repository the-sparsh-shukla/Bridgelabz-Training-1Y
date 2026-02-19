class Employee {
    String name;
    int id;
    double salary;

    void setDetails(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails("Rahul", 101, 50000);
        emp.displayDetails();
    }
}
