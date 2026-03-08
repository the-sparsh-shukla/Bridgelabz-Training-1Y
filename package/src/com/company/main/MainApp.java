package com.company.main;

import com.company.hr.EmployeeRecord;
import com.company.payroll.PayrollCalculator;

public class MainApp {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("EMP-101");
        PayrollCalculator payrollCalculator = new PayrollCalculator();
        double netPay = payrollCalculator.calculateNetPay(50000, 3500);

        System.out.println("Employee: " + employeeRecord.getEmployeeId());
        System.out.println("Net Pay: " + netPay);
    }
}