package com.hhfedu.polymorphic_.detail_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        System.out.println(s.count);//20
        s.display();//20
        Base1 b = s;//b 的编译类型是Base1，运行类型是 s
        System.out.println(b == s);//true
        System.out.println(b.count);//10 看编译类型
        b.display();//20 看运行类型
    }
}
class Base1 {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
class Sub1 extends Base1 {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
