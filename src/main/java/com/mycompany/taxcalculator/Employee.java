/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

public class Employee {
    private EmpDetails details;
    private Family family;

    public Employee(EmpDetails details, Family family) {
        this.details = details;
        this.family = family;
    }

    public Info getInfo() {
        return details.getInfo();
    }

    public work getWork() {
        return details.getWork();
    }

    public Family getFamily() {
        return family;
    }

    public int getAnnualIncomeTax() {
        return getWork().getAnnualTax(family.getChildCount(), family.hasSpouse());
    }
}