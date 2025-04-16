/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

/**
 *
 * @author hasannp
 */
public class SingleEmpTax {
    
    //Fungsi untuk menghitung pajak untuk pekerja yang masih jomblo.
    
    public static int calculate(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible) {
        if (numberOfMonthWorking > 12) {
            System.err.println("More than 12 month working per year");
        }

        int nonTaxableIncome = 54000000;

        int tax = (int) Math.round(0.05 * (
            ((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - nonTaxableIncome
        ));

        return Math.max(tax, 0);
    }
}
