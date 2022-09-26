package com.hhfedu.polymorphic_.polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double sarary) {
        super(name, sarary);
    }
    public void work() {
        System.out.println("普通员工 " + getName() + " 正在工作...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
