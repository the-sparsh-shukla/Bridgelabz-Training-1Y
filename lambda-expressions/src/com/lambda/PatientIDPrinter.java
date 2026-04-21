package com.lambda;

import java.util.Arrays;
import java.util.List;

public class PatientIDPrinter {

    public static void printPatientId(String id) {
        System.out.println("Patient ID: " + id);
    }

    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P-1001", "P-1002", "P-1003", "P-1004");

        System.out.println("Printing patient IDs using method reference:");
        patientIds.forEach(PatientIDPrinter::printPatientId);
    }
}
