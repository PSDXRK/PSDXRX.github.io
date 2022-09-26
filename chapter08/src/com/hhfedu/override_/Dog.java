package com.hhfedu.override_;

public class Dog extends Animal{
    //解读
    //1. 因为 Dog 是 Animal 的子类
    //2. Dog的cry方法和Animal的cry定义形式一样(名称、返回类型、参数)
    //3. 这时我们就说Dog的cry方法，重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫...");
    }
/*
    细节：
    1.子类的方法的形参列表，方法名称，要和父类方法的形参列表，方法名称完全一样
    2.子类方法的返回类型和父类方法的返回类型一样，或者是父类返回类型的子类
       比如父类 的返回类型是Object，子类方法返回类型是String
    3.子类方法不能缩小父类方法的访问权限，public > protected > 默认 > private
 */
    public String m1() {
        return null;
    }
    //直接报错，因为Obkect不是String的子类
//    public Object m2() {
//
//    }
    public BBB m3() {
        return null;
    }
    //直接报错
    //因为子类方法不能缩小父类方法的访问权限，public > protected > 默认 > private
//    private void eat() {
//
//    }
    public void eat() {
        //这是可以的，因为public > protected ，所以并没有缩小父类的访问权限
    }
}
class AAA {

}
class BBB extends AAA {

}
