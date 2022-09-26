package com.hhfedu.extend_.exerciase;

//编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
public class PC extends Computer {
    private String brand;
    //这里IDEA 根据继承的规则，自动把构造器的调用写好
    //这里也体现： 继承设计的基本思想，父类的构造器完成父类的初始化
    //子类的构造器完成子类的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    //打印PC的信息
    public void printInfo() {
        System.out.println("PC信息如下：");
        //调用父类的getDetails方法，得到相关的属性信息
        System.out.println(getDetails() + " brand=" + brand);
    }
}
