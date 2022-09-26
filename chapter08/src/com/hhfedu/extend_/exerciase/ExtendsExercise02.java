package com.hhfedu.extend_.exerciase;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A2 {
    public A2() {
        System.out.println("我是A2类");
    }
}
class B2 extends A2{
    public B2() {
        System.out.println("我是B2类的无参构造器");
    }
    public B2(String name) {
        //隐藏了super();
        System.out.println(name + "我是B2类的有参构造器");
    }
}
class C extends B2 {
    public C() {
        this("hello");
        System.out.println("我是C类的无参构造器");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是C类的有参构造器");
    }
}
