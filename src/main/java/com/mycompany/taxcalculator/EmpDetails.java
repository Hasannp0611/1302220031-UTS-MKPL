/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxcalculator;
/**
 *
 * @author hasannp
 */
public class EmpDetails {
    private Info info;
    private work work;

    public EmpDetails(Info info, work work) {
        this.info = info;
        this.work = work;
    }

    public Info getInfo() {
        return info;
    }

    public work getWork() {
        return work;
    }
}
