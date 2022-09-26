package com.hhfedu.polymorphic_.objectpoly_;

/*
老韩重要的几句话(记住)：
(1) 一个对象的编译类型和运行类型可以不一致
(2) 编泽类型在定义对象时，就确定了，不能改变
(3) 运行类型是可以变化的。
(4) 编译类型看定义时 =号 的左边，运行类型看 =号 的右边
 */
public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点
        //animal 编译类型就是 Animal , 运行类型 Dog
        Animal animal = new Dog();
        //因为运行时 , 执行到该行时，animal 运行类型是 Dog,所以 cry 就是 Dog 的 cry
        animal.cry(); //小狗汪汪叫

        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new Cat();
        animal.cry(); //小猫喵喵叫
    }
}
