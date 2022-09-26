package com.hhfedu.super_;
/*
    super 基本语法
        1.访问父类的属性，但不能访问父类的private属性
            super.属性名；
        2.访问父类的方法，不能访问父类的 private 方法
            super.方法名(参数列表)
        3.访问父类的构造器（这点前面用过）
            super(参数列表);只能放在构造器的第一句，只能出现一句
 */
public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        b.sum();
        b.test();
    }
}
