public class ThisExercise {
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person("jack", 90);
		Person p2 = new Person("jack", 10);
		System.out.println("p1和p2对比的结果为：" + p1.compareTo(p2));
	}
}
/*
	题目：定义 Person 类，里面有 name、age 属性，并提供 compareTo 比较方法，
	用于判断是否和另一个人相等，提供测试类 TestPerson
	用于测试, 名字和年龄完全一样，就返回 true, 否则返回 fal
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p) {
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		// 上面代码可以简化为一行代码
		return this.name.equals(p.name) && this.age == p.age;
	}
}