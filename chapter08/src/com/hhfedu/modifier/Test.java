package com.hhfedu.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();

    }
}
//只有默认和public 可以修饰类
//protected class Tiger { }//错误
//private  class Monkey { }//错误
