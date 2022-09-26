package com.hhfedu.pkg;

import com.hhfedu.modifier.A;
//不同的包只能访问public属性或方法
//但是不能访问 protected, 默认 ，private修饰的属性和方法
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("n1=" + a.n1);
        a.m1();
        //a.m2();//错误
        //a.m3();//错误
        //a.m4();//错误
    }
}
