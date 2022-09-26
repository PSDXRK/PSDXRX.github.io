public class HomeWork07 {
	//编写一个mian方法
	public static void main(String[] args) {
		Dog dog = new Dog("TOM",'白', 2);
		dog.show();
	}
}
/*
	题目：
		设计一个Dog类，有名字，颜色和年龄属性，定义输出方法show()显示其信息
		并创建对象，进行测试
 */
class Dog {
	String name;
	char color;
	int age;
	public Dog(String name, char color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show() {
		System.out.println("名字： " + name);
		System.out.println("颜色： " + color);
		System.out.println("年龄： " + age);
	}
}