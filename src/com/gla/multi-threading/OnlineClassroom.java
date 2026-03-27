import java.util.concurrent.CountDownLatch;

class StudentJoinTask implements Runnable {
    private final String studentName;
    private final CountDownLatch latch;

    public StudentJoinTask(String studentName, CountDownLatch latch) {
        this.studentName = studentName;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 2000));
            System.out.println(studentName + " joined class");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            latch.countDown();
        }
    }
}

public class OnlineClassroom {
    public static void main(String[] args) throws InterruptedException {
        int students = 5;
        CountDownLatch latch = new CountDownLatch(students);

        for (int i = 1; i <= students; i++) {
            new Thread(new StudentJoinTask("Student-" + i, latch)).start();
        }

        latch.await();
        System.out.println("All students joined. Lecture starts now.");
    }
}
