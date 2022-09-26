package com.hhfedu.object_;
/*
== 和 equals 的对比:
    1. == : 既可以判断基本类型，又可以判断引用类型
    2. == : 如果判断基本类型，判断的值是否相等，示例：int i = 10； double d = 10.0;
    3. == : 如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象
    4. equals : 是Object类中的方法，只能判断引用类型，知道如何看jdk源码
    5. 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如Integer,String
 */
public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);// true
        System.out.println(b == c);// true
        B bobj = a;
        System.out.println(bobj == c);// true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等

        //equals 方法，源码怎么查看
        //吧光标放在equals方法，直接输入 CTRL + B
        System.out.println("hello".equals("abc"));
    }
}
class A extends B {}
class B {}
