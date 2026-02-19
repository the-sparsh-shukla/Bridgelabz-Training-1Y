class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rate = 1000;

    CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double totalCost() {
        return rentalDays * rate;
    }

    void display() {
        System.out.println(customerName + " " + carModel + " " + totalCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Raj", "SUV", 4);
        c1.display();
        c2.display();
    }
}
