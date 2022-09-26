// 什么是this?
// java虚拟机给每个对象分配器this，代表当前对象
// 简单的说，哪个对象调用，this就代表哪个对象
public class This01 {
	//编写一个mian方法
	public static void main(String[] args) {

		Dog dog1 = new Dog("大壮",9);
		System.out.println("dog1的hashcode=" + dog1.hashCode());
		//dog1调用了info方法,那么this就是指的dog1对象的属性
		dog1.info();
		System.out.println("==============================================");
		Dog dog2 = new Dog("大黄",3);
		System.out.println("dog2的hashcode=" + dog2.hashCode());
		//dog2调用了info方法,那么this就是指的dog2对象的属性
		dog2.info();
	}
}

class Dog {//类

	String name;
	int age;
	// public Dog(String dName, int dAge) {//构造器
	// 	name = dName;
	// 	age = dAge;
	// }
	//如果我们构造器的形参，能直接写成属性名，就更好了
	//但是出现了一个问题，根据变量的作用域原则
	//构造器的 name 是局部变量，而不是属性
	//构造器的 age 是局部变量，而不是属性
	//==> 引出this关键字
	public Dog(String name, int age) {//构造器
		//this.name 就是当前对象的属性name
		//this.age 就是当前对象的属性age
		this.name = name;
		this.age = age;
		System.out.println("构造器里的this.hashcode=" + this.hashCode());
	}

	public void info() {//成员方法，输出属性信息
		System.out.println("info()方法里的this.hashcode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}