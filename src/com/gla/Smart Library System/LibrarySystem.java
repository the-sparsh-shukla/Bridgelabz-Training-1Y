public class LibrarySystem {

    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 450);
        Book b2 = new Magazine(201, "Tech Monthly", 120);

        int daysLate = 4;

        System.out.println("Library: " + Book.libraryName);

        System.out.println("TextBook Fine: ₹" + b1.calculateFine(daysLate));
        System.out.println("Magazine Fine: ₹" + b2.calculateFine(daysLate));
    }
}