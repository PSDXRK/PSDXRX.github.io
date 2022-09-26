package com.hhfedu.super_;


public class B extends A {//子类

    public int n1 = 888;

    //编写方法测试
    public void test() {
        //super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员，
        //也可以使用 super 去访问爷爷类的成员，如果多个基类(上级类)中
        //都有同名的成员，使用 super 访问遵循就近原则。A->B->C,当然也需要遵守访问权限相关的规则
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }
    //1.访问父类的属性，但不能访问父类的private属性
    //    super.属性名；
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);//不能访问n4，因为是私有的
    }

    public void cal() {
        System.out.println("B类的cal()方法....");
    }

    public void sum() {
        System.out.println("B 类的 sum()");
        //希望调用父类-A 的 cal 方法
        //这时，因为子类 B 没有 cal 方法，因此我可以使用下面三种方式
        //找 cal 方法时(cal() 和 this.cal())，顺序是:
        // (1)先找本类，如果有，则调用
        // (2)如果没有，则找父类(如果有，并可以调用，则调用)
        // (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
        // 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access
        // 如果查找方法的过程中，没有找到，则提示方法不存在
        cal();
        this.cal(); //等价 cal()
        super.cal(); //找 cal 方法(super.call()) 的顺序是直接查找父类，其他的规则一样
        //演示访问属性的规则
        //n1 和 this.n1 查找的规则是
        //(1) 先找本类，如果有，则调用
        //(2) 如果没有，则找父类(如果有，并可以调用，则调用)
        //(3) 如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类
        // 提示：如果查找属性的过程中，找到了，但是不能访问， 则报错, cannot access
        // 如果查找属性的过程中，没有找到，则提示属性不存在
        System.out.println(n1);
        System.out.println(this.n1);
        //找 n1 (super.n1) 的顺序是直接查找父类属性，其他的规则一样
        System.out.println(super.n1);
    }

    //2.访问父类的方法，不能访问父类的 private 方法
    //     super.方法名(参数列表)
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//不能访问父类private方法
    }
    //3.访问父类的构造器（这点前面用过）
    //     super(参数列表);只能放在构造器的第一句，只能出现一句

    public B() {
        //super();
        //super("jack");
        super("jack", 10);
    }
}
