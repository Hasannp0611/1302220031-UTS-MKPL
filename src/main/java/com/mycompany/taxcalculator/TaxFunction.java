/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

/**
 *
 * @author hasannp
 */
public class TaxFunction {

	public static int calculateTax(
        int monthlySalary,
        int otherMonthlyIncome,
        int numberOfMonthWorking,
        int deductible,
        boolean isMarried,
        int numberOfChildren
    ) {
        if (isMarried) {
            return MarriedEmpTax.calculate(
                monthlySalary,
                otherMonthlyIncome,
                numberOfMonthWorking,
                deductible,
                numberOfChildren
            );
        } else {
            return SingleEmpTax.calculate(
                monthlySalary,
                otherMonthlyIncome,
                numberOfMonthWorking,
                deductible
            );
        }
    }
}
