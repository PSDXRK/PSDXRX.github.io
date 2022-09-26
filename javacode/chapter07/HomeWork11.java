public class HomeWork11 {
	//编写一个mian方法
	public static void main(String[] args) {

	}
}
/*
	题目：
		创建一个Employee类
		属性有(名字，性别，年龄，职位，薪水)，提供三个构造方法，可以初始化
		(1) (名字，性别，年龄，职位，薪水)
		(2) (名字，性别，年龄) (3) (职位，薪水),要求充分复用构造器
 */
class Employee {
	String name;
	char sex;
	int age;
	String job;
	double salary;
	//因为要求可以服用构造器，因此先写属性少的构造器
	//职位，薪水
	public Employee(String job, double salary) {
		this.job = job;
		this.salary = salary;
	}
	//名字，性别，年龄
	public Employee(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//名字，性别，年龄，职位，薪水（可以复用）
	public Employee(String name, char sex, int age, String job, double salary) {
		this(name, sex, age);//使用到 前面的 构造器
		this.job = job;
		this.salary = salary;
	}
}