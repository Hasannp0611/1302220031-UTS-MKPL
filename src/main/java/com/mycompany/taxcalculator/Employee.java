/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

public class Employee {
    private Info info;
    private work work;
    private Family family;

    public Employee(EmpDetails details) {
        this.info = new Info(details.getEmployeeId(), details.getFirstName(), details.getLastName(), 
                             details.getIdNumber(), details.getAddress(), details.isForeigner(), details.isGender());
        this.work = new work(details.getYearJoined(), details.getMonthJoined(), details.getDayJoined(), this.info);
        this.family = new Family();
    }

    public Info getInfo() {
        return info;
    }

    public work getWork() {
        return work;
    }

    public Family getFamily() {
        return family;
    }

    public int getAnnualIncomeTax() {
        return work.getAnnualTax(family.getChildCount(), family.hasSpouse());
    }
}
