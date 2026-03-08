package com.gla.interfacesabstraction.staticinterfacemethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatUtility {
    interface DateUtility {
        static String formatAsIso(LocalDate date) {
            return date.format(DateTimeFormatter.ISO_DATE);
        }

        static String formatAsIndian(LocalDate date) {
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }

        static LocalDate parseIso(String dateText) {
            return LocalDate.parse(dateText, DateTimeFormatter.ISO_DATE);
        }
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 2, 20);
        System.out.println("ISO: " + DateUtility.formatAsIso(date));
        System.out.println("Indian: " + DateUtility.formatAsIndian(date));
        System.out.println("Parsed year: " + DateUtility.parseIso("2026-02-20").getYear());
    }
}
