/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;

public class Employee {
    private Info info;
    private work work;
    private Family family;

    public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender) {
        this.info = new Info(employeeId, firstName, lastName, idNumber, address, isForeigner, gender);
        this.work = new work(yearJoined, monthJoined, dayJoined, this.info);
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
