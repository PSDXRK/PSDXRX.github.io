package com.hhfedu.polymorphic_.polyarr_;
//数组的定义类型为父类类型，里面保存的实际元素类型为子类类型
public class PolyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下：要求创建 1 个 Person 对象、
        // 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组中，并调用每个对象 say 方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 23, 99.0);
        persons[2] = new Student("smith", 24, 100.0);
        persons[3] = new Teacher("scott", 45, 12000);
        persons[4] = new Teacher("king", 46, 16000);
        //循环遍历多态数组，调用say
        for(int i = 0; i < persons.length; i++) {
            //提示：person[i]编译类型是Person，运行类型是根据实际情况有JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //使用类型判断 + 向下转型
            if(persons[i] instanceof Student) {//判断person[i]的运行类型是不是Student
                Student student = (Student)persons[i];//向下转型
                student.study();
                //也可以用一条语句代替：((student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher)persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
                //System.out.println("你的类型有误，请自己检查...");
            } else {
                System.out.println("你的类型有误，请自己检查...");
            }
        }
    }
}
