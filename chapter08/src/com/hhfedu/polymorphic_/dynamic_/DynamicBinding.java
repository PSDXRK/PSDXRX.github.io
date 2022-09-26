package com.hhfedu.polymorphic_.dynamic_;
//java 的动态绑定机制
/*
    1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
 */
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型是 A， 运行类型是 B
        A a = new B();//向上转型
        //分析
        //1.因为运行类型是B所以，调用对象方法时，该方法和 运行类型B动态绑定
        //2.a.sum()首先找B类里面的sum()方法，没有，找父类的sum()方法
        //3.父类里面的getI()方法也是动态绑定了B类型，所以调用的时B类的getI()方法
        System.out.println(a.sum());// 30 这里的sum()调用getI()是运行类型B里面的getI()
        System.out.println(a.sum1());// 20
    }
}

class A {// 父类
    public int i = 10;
    //动态绑定机制
    public int sum() {
        return getI() + 10;// 20 + 10 = 30
    }
    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}
class B extends A { // 子类
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1() {
//        return i + 10;
//    }
}
