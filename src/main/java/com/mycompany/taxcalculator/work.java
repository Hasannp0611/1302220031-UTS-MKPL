/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

import java.time.LocalDate;

public class work {
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;
    private Info info;

    public work(int year, int month, int day, Info info) {
        this.yearJoined = year;
        this.monthJoined = month;
        this.dayJoined = day;
        this.info = info;
    }

    public void setMonthlySalary(int grade) {
        int baseSalary = 0;
        switch (grade) {
            case 1: baseSalary = 3000000; break;
            case 2: baseSalary = 5000000; break;
            case 3: baseSalary = 7000000; break;
        }

        if (info.isForeigner()) {
            monthlySalary = (int)(baseSalary * 1.5);
        } else {
            monthlySalary = baseSalary;
        }
    }

    public void setAdditionalIncome(int income) {
        this.otherMonthlyIncome = income;
    }

    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }

    public int getAnnualTax(int childCount, boolean hasSpouse) {
        LocalDate now = LocalDate.now();
        if (now.getYear() == yearJoined) {
            monthWorkingInYear = now.getMonthValue() - monthJoined;
        } else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, !hasSpouse, childCount);
    }
}
