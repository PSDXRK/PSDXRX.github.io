/*
1) 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名;
	这里老师简单的介绍访问修饰符： 控制属性的访问范围
	有四种访问修饰符 public, proctected, 默认, private ,后面我会详细介绍
2) 属性的定义类型可以为任意类型，包含基本类型或引用类型
3) 属性如果不赋值，有默认值，规则和数组一致。具体说: 
	int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，
	boolean false，String null
*/
public class PropertiesDetail {
	//编写一个main方法
	public static void main(String[] args) {
		//创建Person对象
		//p1 是对象名（对象引用）
		//new Person() 创建的对象空间（数据）才是真正的对象
		Person p1 = new Person();

		//对象的属性默认值，遵守数组规则：
		//int 0，short 0, byte 0, long 0, float 0.0,double 0.0，
		//char \u0000，boolean false，String null
		
		System.out.println("\n当前这个人的信息");
		System.out.println("age=" + p1.age + " name=" + p1.name 
			+ " sal=" + p1.sal + " isPass=" + p1.isPass);
		//默认输出 0 null 0.0 false
	}
}

class Person {
	//四个属性
	int age;
	String name;
	double sal;
	boolean isPass;

}