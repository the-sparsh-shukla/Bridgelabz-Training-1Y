package com.company.payroll;

public class PayrollCalculator {
    public double calculateNetPay(double basicPay, double deductions) {
        return basicPay - deductions;
    }
}