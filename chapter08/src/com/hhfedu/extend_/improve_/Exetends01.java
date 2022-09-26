//继承快速入门
package com.hhfedu.extend_.improve_;

import com.hhfedu.extend_.Graduate;
import com.hhfedu.extend_.Pupil;

public class Exetends01 {
    public static void main(String[] args) {
    com.hhfedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();
        System.out.println("===================");
        com.hhfedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 24;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}
