class Activity extends Thread {
    String name;
    int delay;

    public Activity(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " State: " + Thread.currentThread().getState());
            Thread.sleep(delay);
            System.out.println(name + " running...");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ExamHall {
    public static void main(String[] args) {
        Activity entry = new Activity("Student Entry", 0);
        Activity question = new Activity("Question Paper Distribution", 5000);
        Activity attendance = new Activity("Attendance", 10000);
        Activity collection = new Activity("Answer Sheet Collection", 15000);

        question.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);

        entry.start();
        question.start();
        attendance.start();
        collection.start();
    }
}
