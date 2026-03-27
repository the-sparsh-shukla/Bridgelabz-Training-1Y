import java.util.concurrent.Semaphore;

class BookIssueTask implements Runnable {
    private static final Semaphore LIBRARIAN = new Semaphore(2);
    private final String studentName;

    public BookIssueTask(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void run() {
        try {
            LIBRARIAN.acquire();
            System.out.println(studentName + " is issuing a book");
            Thread.sleep(1500);
            System.out.println(studentName + " completed issue process");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            LIBRARIAN.release();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Thread s1 = new Thread(new BookIssueTask("Student-1"));
        Thread s2 = new Thread(new BookIssueTask("Student-2"));
        Thread s3 = new Thread(new BookIssueTask("Student-3"));
        Thread s4 = new Thread(new BookIssueTask("Student-4"));

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
