package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DoctorAvailability {

    static class Doctor {
        private final String name;
        private final String specialty;
        private final boolean weekendAvailable;

        Doctor(String name, String specialty, boolean weekendAvailable) {
            this.name = name;
            this.specialty = specialty;
            this.weekendAvailable = weekendAvailable;
        }

        public String getName() {
            return name;
        }

        public String getSpecialty() {
            return specialty;
        }

        public boolean isWeekendAvailable() {
            return weekendAvailable;
        }

        @Override
        public String toString() {
            return name + " | " + specialty + " | Weekend Available: " + weekendAvailable;
        }
    }

    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Ananya", "Cardiology", true),
                new Doctor("Dr. Rahul", "Orthopedics", false),
                new Doctor("Dr. Meera", "Dermatology", true),
                new Doctor("Dr. Kunal", "Neurology", true),
                new Doctor("Dr. Priya", "Pediatrics", false)
        );

        System.out.println("Weekend Available Doctors (sorted by specialty):");
        doctors.stream()
                .filter(Doctor::isWeekendAvailable)
                .sorted(Comparator.comparing(Doctor::getSpecialty)
                        .thenComparing(Doctor::getName))
                .forEach(System.out::println);
    }
}
