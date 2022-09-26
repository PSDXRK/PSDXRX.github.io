//成员方法练习
/*
	编写一个方法 copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，
	注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
 */
public class MethodExercise02 {
	//编写一个main方法
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "jack";
		p.age = 18;
		p.sex = '男';
		//创建Tools
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//到此 p 和 p2 是Person对象,但是是两个独立的对象，属性相同
		System.out.println("p 的属性 age=" + p.age + " 名字=" 
			+ p.name + " 性别=" + p.sex);
		System.out.println("p2 的属性 age=" + p2.age 
			+ " 名字=" + p2.name + " 性别=" + p2.sex);
		//提示：可以同对象比较看看是否是同一个对象
		System.out.println(p == p2);//false

	}
}

class Person {
	String name;
	int age;
	char sex;
}

class MyTools {
	//编写方法的思路
	//1. 方法的返回类型是 Person
	//2. 方法的名字是 copyPerson
	//3. 方法的形参是（Person p）
	//4. 方法体，创建一个新对象，并复制属性，返回即可
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		p2.sex = p.sex;
		return p2;
	}
}