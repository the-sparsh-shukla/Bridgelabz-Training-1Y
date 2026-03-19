package INHERITENCE;

public // Superclass
class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

// Worker interface
interface Worker {
    void performDuties();
}

// Chef subclass implements Worker interface
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        displayBasicInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing " + specialty + " dishes with precision and creativity.");
        System.out.println("---");
    }
}

// Waiter subclass implements Worker interface
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, String id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        displayBasicInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Taking orders, serving food, and ensuring customer satisfaction.");
        System.out.println("---");
    }
}

// Main class demonstrating inheritance + interface implementation
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Polymorphic Worker array
        Worker[] staff = {
                new Chef("Mario Rossi", "CHEF001", "Italian Cuisine"),
                new Waiter("Anna Verdi", "WAIT001", 8),
                new Chef("Luca Bianchi", "CHEF002", "French Pastries"),
                new Waiter("Giulia Neri", "WAIT002", 6)
        };

        System.out.println("Restaurant Management System");
        System.out.println("=============================");
        System.out.println("Staff performing their duties:\n");

        // Polymorphism through interface
        for (Worker worker : staff) {
            worker.performDuties();
        }
    }
}

