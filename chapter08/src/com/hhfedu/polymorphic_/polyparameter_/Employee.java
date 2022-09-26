package com.hhfedu.polymorphic_.polyparameter_;

public class Employee {
    private String name;
    private double sarary;

    public Employee(String name, double sarary) {
        this.name = name;
        this.sarary = sarary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getAnnual() {
        return sarary * 12;
    }
}
