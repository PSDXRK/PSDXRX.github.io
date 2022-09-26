package com.hhfedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",24);
        System.out.println(person.say());
        Student student = new Student("smith",99,"416100220093",100);
        System.out.println(student.say());
    }
}
