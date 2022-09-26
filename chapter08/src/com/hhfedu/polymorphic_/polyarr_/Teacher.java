package com.hhfedu.polymorphic_.polyarr_;

public class Teacher extends Person {
    private double sarary;

    public Teacher(String name, int age, double sarary) {
        super(name, age);
        this.sarary = sarary;
    }

    public double getSarary() {
        return sarary;
    }

    public void setSarary(double sarary) {
        this.sarary = sarary;
    }
    //重写父类的say方法

    @Override
    public String say() {
        return super.say();
    }
    //特有方法
    public void teach() {
        System.out.println("老师 " + getName() + " 正在教java课程...");
    }
}
