//作用域：面向对象中，变量的作用域是非常重要的知识点
/*
1. 在Java编程中，主要的变量就是属性(成员变量)和局部变量
2. 我们说的局部变量一般是指在成员方法中定义的变量
3. Java中作用域的分类：
		全局变量：也就是属性，作用域为整个类体 Cat类：cry eat等方法使用属性
		局部变量：也就是除了属性外的其他变量，作用域为定义他的代码块中
4. 全局变量(属性)可以不赋值，直接使用，因为有默认值，
   局部变量必须赋值后，才能使用，因为没有默认值
 */
public class Scope01 {
	//编写一个mian方法
	public static void main(String[] args) {

	}
}

class Cat {
	//全局变量：也就是属性，作用域为整个类体 Cat类：cry eat等方法使用属性
	//属性在定义时，可以直接赋值
	int age = 10;//指定的值是 10

	//全局变量(属性)可以不赋值，直接使用，因为有默认值，
 	//局部变量必须赋值后，才能使用，因为没有默认值
 	//
 	double weight;//全局变量(属性)可以不赋值，直接使用，因为有默认值，默认值是0.0

 	// public void hi() {
 	// 	int num;
 	// 	System.out.println("num=" + num);
 	// }//错误，局部变量必须赋值后，才能使用，因为没有默认值


	public void cry() {
		//1.局部变量一般指在成员方法中定义的变量
		//2. n name 就是局部变量
		//3. n name 的作用域在cry方法中
		int n = 10;
		String name = "jack";
		System.out.println("在cry方法中使用属性 age=" + age);
	}

	public void eat() {
		System.out.println("在eat方法中使用属性 age=" + age);

		//System.out.println("在eat方法中使用 cry的变量 name=" + name);//错误，n name 的作用域在cry方法中
	}
}