package com.gla.collections;

import java.util.PriorityQueue;

public class HospitalTriage {
    static class Patient implements Comparable<Patient> {
        private final String name;
        private final int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity);
        }

        public String toString() {
            return name + "(severity=" + severity + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>();
        triage.offer(new Patient("Aman", 4));
        triage.offer(new Patient("Neha", 9));
        triage.offer(new Patient("Ravi", 6));

        while (!triage.isEmpty()) {
            System.out.println("Treating: " + triage.poll());
        }
    }
}

