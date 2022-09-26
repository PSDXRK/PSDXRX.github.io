package com.hhfedu.extend_;

/**
 * 继承可以解决代码复用,让我们的编程更加靠近人类思维.当多个类存在相同的属性(变量)和方法时,
 * 可以从这些类中抽象出父类,在父类中定义这些相同的属性和方法，
 * 所有的子类不需要重新定义这些属性和方法，只需要通过 extends 来声明继承父类即可
 */

/**
 *  继承的基本语法
 *      class 子类 extends 父类 {
 *
 *      }
 *  1. 子类会自动拥有父类定义的属性和方法
 *  2. 父类又称为 超类、基类
 *  3. 子类又叫派生类
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("===================");
        Graduate graduate = new Graduate();
        graduate.name = "大华";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
