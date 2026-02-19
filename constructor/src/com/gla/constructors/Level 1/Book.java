class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        availability = av;
    }

    void borrow() {
        if (availability) {
            availability = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }

    void display() {
        System.out.println(title + " " + author + " " + price + " " + availability);
    }

    public static void main(String[] args) {
        Book b = new Book("DSA", "Author1", 350, true);
        b.display();
        b.borrow();
        b.display();
    }
}
