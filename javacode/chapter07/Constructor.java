//构造器
/*
	我们来看一个需求：前面我们在创建人类的对象时，是先把一个对象创建好后，
	再给他的年龄和姓名属性赋值，如果现在我要求，在创建人类的对象时，
	就直接指定这个对象的年龄和姓名，该怎么做? 这时就可以使用构造器。

	基本语法:

	[修饰符] 方法名(形参列表){
		方法体;
	}

说明：
1) 构造器的修饰符可以默认， 也可以是 public protected private
2) 构造器没有返回值
3) 方法名 和类名字必须一样
4) 参数列表 和 成员方法一样的规则
5) 构造器的调用, 由系统完成

基本介绍：
构造方法又叫构造器(constructor)，是类的一种特殊的方法，
它的主要作用是完成对新对象的初始化。它有几个特点：
	1) 方法名和类名相同
	2) 没有返回值
	3) 在创建对象时，系统会自动的调用该类的构造器完成对象的初始化。

 */
public class Constructor {
	//编写一个mian方法
	public static void main(String[] args) {
		//现在我们就用构造方法来完成刚才提出的问题:
		//在创建人类的对象时，就直接指定这个对象的年龄和姓名
		
		//当我们 new 一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("jack", 70);
		System.out.println("p1的信息如下:\np1对象姓名 name=" +
		 p1.name + "\np1对象年龄 age=" +p1.age);
	}
}
//在创建人类的对象时，就直接指定这个对象的年龄和姓名

class Person {
	String name;
	int age;
	//构造器
	//1. 构造器没有返回值, 也不能写 void
	//2. 构造器的名称和类 Person 一样
	//3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge) {
		System.out.println("构造器被调用~~");
		name = pName;
		age = pAge;
	}
}

