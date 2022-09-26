package com.hhfedu.extend_;

import com.hhfedu.extend_.Base;
//输入 ctrl + H 可以看到类的继承关系
public class Sub extends Base {//子类方法
    //super();//默认调用父类的无参构造器，写不写都默认存在
    public Sub(String name, int age) {
        //1.调用父类的无参构造器，方法如下，或者什么都不写，默认会调用无参构造器
        super();//父类的无参构造器
        System.out.println("子类Sub(String name, int age)构造器被调用....");
    }
    public Sub() {//构造器
        //2.调用父类的 Base(String name, int age) 构造器
        super("smith",18);
        System.out.println("子类无参Sub()构造器被调用....");
    }
    public Sub(String name) {
        //3.调用父类的 Base(String name) 构造器
        super("bob");
        System.out.println("子类Sub(String name)构造器被调用....");
    }
    public void sayOk() {//子类方法
        //我们发现 父类的非private属性和方法都可以访问
        //但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();//私有的不能在子类中直接访问，
        // 要通过公共的方法去访问
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
