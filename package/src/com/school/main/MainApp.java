package com.school.main;

import com.school.data.StudentData;
import com.school.util.DataFormatter;

public class MainApp {
    public static void main(String[] args) {
        StudentData studentData = new StudentData(27);
        DataFormatter dataFormatter = new DataFormatter();

        System.out.println(dataFormatter.formatRollNumber(studentData.getRollNumber()));
    }
}