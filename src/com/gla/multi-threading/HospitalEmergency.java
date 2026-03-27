class PatientTask implements Runnable {
    private final int patientId;
    private final String severity;
    private final int treatmentSeconds;

    public PatientTask(int patientId, String severity, int treatmentSeconds) {
        this.patientId = patientId;
        this.severity = severity;
        this.treatmentSeconds = treatmentSeconds;
    }

    @Override
    public void run() {
        try {
            System.out.println("Patient " + patientId + " (" + severity + ") started treatment by "
                    + Thread.currentThread().getName());
            Thread.sleep(treatmentSeconds * 1000L);
            System.out.println("Patient " + patientId + " treated in " + treatmentSeconds + " sec");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class HospitalEmergency {
    public static void main(String[] args) {
        Thread p1 = new Thread(new PatientTask(1, "Critical", 2), "Doctor-1");
        Thread p2 = new Thread(new PatientTask(2, "Serious", 3), "Doctor-2");
        Thread p3 = new Thread(new PatientTask(3, "Stable", 4), "Doctor-3");

        p1.setPriority(10);
        p2.setPriority(7);
        p3.setPriority(3);

        p1.start();
        p2.start();
        p3.start();
    }
}
