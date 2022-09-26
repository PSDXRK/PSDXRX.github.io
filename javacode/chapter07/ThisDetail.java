//this的注意事项和使用细节
/*
	1) this 关键字可以用来访问本类的属性、方法、构造器
	2) this 用于区分当前类的属性和局部变量
	3) 访问成员方法的语法：this.方法名(参数列表)
	4) 访问构造器语法：this(参数列表); 注意只能在构造器中使用
	   (即只能在构造器中访问另外一个构造器, 必须放在第一条语句)
	5) this 不能在类定义的外部使用，只能在类定义的方法中使用

 */
public class ThisDetail {
	//编写一个mian方法
	public static void main(String[] args) {

		T t1 = new T();
		t1.f2();
		t1.f3();
		T2 t2 = new T2();//调用构造器 T2()
	}
}

class T {
	String name = "jack";
	int num = 20;
	//细节：访问成员方法的语法：this.方法名(参数列表)
	public void f1() {
		System.out.println("f1()方法被调用");
	}

	public void f2() {
		System.out.println("f2()方法被调用");
		//调用本类的 f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}

	//细节：this 关键字可以用来访问本类的属性
	public void f3() {
		String name = "bob";
		int num = 887;
		//传统方式
		System.out.println("name=" + name +" num=" + num);//按就近原则访问，
		                                                  //如果f3没有定义name.num
		                                                  //则访问属性，定义了的话就访问局部变量
		System.out.println("name=" +this.name +" num=" + this.num);//一定访问属性
	}

}

class T2 {

	//细节：访问构造器语法：this(参数列表); 注意只能在构造器中使用
	//      (即只能在构造器中访问另外一个构造器, 必须放在第一条语句)
	public T2() {
		//这里去访问 T(String name,int age)构造器
		this("jack", 29);//能在构造器中访问另外一个构造器,必须放在第一条语句
		System.out.println("调用 T2() 构造器");
	}

	public T2(String name,int age) {

		System.out.println("调用 T2(String name,int age) 构造器");
	}
}