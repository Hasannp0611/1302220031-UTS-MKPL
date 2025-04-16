/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

/**
 *
 * @author hasannp
 */
public class TaxEmp {
    private final int monthlySalary;
    private final int otherMonthlyIncome;
    private final int monthsWorked;
    private final int deductible;
    private final boolean isMarried;
    private final int numberOfChildren;

    public TaxEmp(int monthlySalary, int otherMonthlyIncome, int monthsWorked, int deductible, boolean isMarried, int numberOfChildren) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.monthsWorked = Math.min(monthsWorked, 12);
        this.deductible = deductible;
        this.isMarried = isMarried;
        this.numberOfChildren = Math.min(numberOfChildren, 3);
    }

    public int calculateTax() {
        int nonTaxableIncome = 54000000;

        if (isMarried) {
            nonTaxableIncome += 4500000;
            nonTaxableIncome += numberOfChildren * 1500000;
        }

        int taxableIncome = ((monthlySalary + otherMonthlyIncome) * monthsWorked) - deductible - nonTaxableIncome;

        int tax = (int) Math.round(0.05 * taxableIncome);

        return Math.max(tax, 0);
    }
}
