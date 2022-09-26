/*
构造器使用细节：
	1.一个类可以定义多个不同的构造器，即构造器重载
		比如：我们可以再给Person类定义一个构造器，用来创建对象的时候
		      只指定人名，不需要指定年龄
    2.构造器名和类名要相同
    3.构造器没有返回值
    4.构造器是完成对象初始化，并不是创建对象
    5.在创建对象时，系统自动的调用该类的构造方法
    6.如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器（也叫默认构造器）
      比如Dog(){},使用javap指令，反编译看看
    7.一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器
      除非显式的定义一下，即：Dog(){} 写（这点很重要）
 */
public class ConstructorDetail {
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person("King", 50);//第一个构造器
		System.out.println("第一个构造器初始化的信息：\n" 
			+ "姓名：" + p1.name + "\n年龄：" + p1.age);
		Person p2 = new Person("jack");//第二个构造器
		System.out.println("第一个构造器初始化的信息：\n" 
			+ "姓名：" + p2.name + "\n年龄：" + p2.age);

		Dog dog1 = new Dog();//使用的时默认的无参构造器
	}
}
class Dog {
	//细节：如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	//使用 javap 指令 反编译看看
	/*
		默认构造器
		Dog() {

		}
	*/
	//细节：一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器，
	//除非显式的定义一下,即: Dog(){} 写 (这点很重要)
	//
	public Dog(String dName) {
		//... 
	}
	Dog() { //显式的定义一下 无参构造器

	}
}

class Person {
	//细节：一个类可以定义多个不同的构造器，即构造器重载
	//        比如：我们可以再给Person类定义一个构造器，用来创建对象的时候
	//        只指定人名，不需要指定年龄
	String name;
	int age;//默认为0
	//第1个构造器
	public Person(String pName, int pAge) {
		System.out.println("第1个构造器被调用！");
		name = pName;
		age = pAge;
	}
	//第2个构造器,只指定人名，不指定年龄
	public Person(String pName) {
		System.out.println("第2个构造器被调用！");
		name = pName;
	}
}