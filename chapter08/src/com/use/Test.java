package com.use;

import com.xiaoqiang.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@4aa298b7
        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@7d4991ad
    }
}

