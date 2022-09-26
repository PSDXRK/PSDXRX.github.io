package com.hhfedu.extend_.exerciase;


public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
            //分析：
        /**
         *  1.首先调用B类里面的无参构造器
         *  2.执行 this("abc");---->> B(String name)构造器
         *  3.调用构造器B(String name)，因为B继承父类A，所以默认有super();
         *  4.所以先输出 a 再输出 b name ，再输出 b
         */
    }
}
class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}
class B extends A{
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name) {
        //默认有super();
        System.out.println("b name");
    }
}
