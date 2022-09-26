//封装快速入门
/*
封装实现三步骤：
    1.将属性私有化private，【不能直接修改属性】
    2.提供一个公共的（public）set方法，用于对属性判断并赋值
        public void setXxx(类型 参数名）{//Xxx表示某个属性
            //加入数据验证的业务逻辑
            属性 = 参数名；
        }
    3.提供一个公共的（public）get方法，用于获取属性的值
        public 数据类型 getXxx() {//权限判断，Xxx某个属性
            return xx;
        }
 */
package com.hhfedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        //如果要使用快捷键 alt+r, 需要先配置主类(锤子图标旁边)
        //第一次，我们使用鼠标点击形式运算程序，后面就可以用alt + r
        Person person = new Person();
        person.setName("jackhhjhjjn");
        person.setAge(302);
        person.setSalary(30000);
        //输出信息
        System.out.println(person.info());

        //如果我么们直接使用构造器指定属性
        Person smith = new Person("smith", 2000, 30000);
        System.out.println("======simith的信息如下=======");
        System.out.println(smith.info());
    }
}

//不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
// 年龄合理就设置，否则给默认年龄, 必须在 1-120, 年龄， 工资不能直接查看 ，
// name 的长度在 2-6 字符之间
class Person {
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//私有化工资

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    //接下来进行封装
    //自己写太慢了，可以用快捷键 Alt + insert 然后选择 Getter and Setter
    //然后选择要封装的属性
    //然后根据要求完善代码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对，需要（2-6）个字符，默认名字 无名");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，年龄需要在 1-120 之间，给默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        //可以这里增加一个对当个前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {

        return "信息为：name=" + name + " age=" + age + " sarary=" + salary;
    }
}