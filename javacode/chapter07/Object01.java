import java.util.Scanner;
public class Object01 {
	//定义一个main方法
	public static void main(String[] args) {
		/*
			张老太养了两只猫猫:一只名字叫小白,今年 3 岁,白色。
			还有一只叫小花,今年 100 岁,花色。请编写一个程序，
			当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。
			如果用户输入的小猫名错误，则显示 张老太没有这只猫猫
		 */
		
		// // 思路分析(自己的方法)（传统方法）
		// // 1.引入Scanner对象
		// // 2.定义string数组存储猫的信息
		// // 3.用判断语句进行查找
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("请输入小猫的名字！");
		// String catName = myScanner.next();
		// String[] arr1 = {"小白", "3岁", "白色"}; 
		// String[] arr2 = {"小花", "100岁", "花色"};
		// if(catName.equals(arr1[0])) {
		// 	for(int i = 0; i < arr1.length; i++) {
		// 		System.out.print(arr1[i] + "\t");
		// 	}
		// } else if(catName.equals(arr2[0])) {
		// 	for(int i = 0; i < arr2.length; i++) {
		// 		System.out.print(arr2[i] + "\t");
		// 	}
		// } else {
		// 	System.out.println("张老太没有这只猫猫！");
		// }
		// //数组 =>(1)数据类型体现不出来
		// //       (2)只能通过[下标]获取信息，造成变量名字和内容的对应关系不明确
		// //       (3)不能体现猫的行为
		

		//使用OPP面向对象解决
		//实例化一只猫（创建一只猫）
		//老韩解读
		//1. new Cat() 创建一只猫
		//2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1
		//3. cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 20;

		//创建了第二只猫，并赋值给cat2
		//cat2也是一个对象
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 30;

		//怎么访问对象的属性呢
		// System.out.println("第一只猫的信息" + cat1.name 
		// 	+ " " + cat1.age + " " + cat1.color + " " + cat1.weight);

		// System.out.println("第二只猫的信息" + cat2.name 
		// 	+ " " + cat2.age + " " + cat2.color + " " + cat2.weight);
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入小猫的名字！");
		String catName = myScanner.next();
		if(catName.equals(cat1.name)) {
			System.out.println("第一只猫的信息:\n" + "名字:" + cat1.name 
			+ "\t年龄:" + cat1.age + "岁\t颜色:" + cat1.color 
			+ "\t体重:" + cat1.weight + "斤");
		} else if(catName.equals(cat2.name)) {
			System.out.println("第二只猫的信息:\n" + "名字:" + cat2.name 
			+ "\t年龄:" + cat2.age + "岁\t颜色:" + cat2.color 
			+ "\t体重:" + cat2.weight + "斤");
		} else {
			System.out.println("张老太没有这只猫猫！");
		}
	}
}
		

//面向对象快速入门
//使用面向对象的方式来解决养猫问题
//
//定义一个猫类 Cat -> 定义数据的类型
class Cat {
	//属性（成员变量）
	//属性可以是基本数据类型，也可以是引用类型（对象、字符串、数组）
	String name; //名字
	int age; //年龄
	String color; //颜色
	double weight; //体重
}