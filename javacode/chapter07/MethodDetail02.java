public class MethodDetail02 {
	//编写一个main方法
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();

		a.m1();

	}
}
class A {
	//1. 同一类中的方法调用：直接调用即可
	
	public void print(int n) {
		System.out.println("print方法被调用 n= " + n);// 10
	}

	public void sayOk() {
		print(10);//同一类中的方法调用：直接调用即可
		System.out.println("继续执行sayOk()");
	}

	//2. 跨类中的方法A类调用B类方法：需要通过对象名调用
	public void m1() {
		//先创建一个B的对象
		System.out.println("m1()方法被调用");// 第一步执行
		B b = new B();
		b.hi();

		System.out.println("m1()方法继续执行");// 第三步执行
	}
}

class B {
	public void hi() {
		System.out.println("B类中的hi()被执行");// 第二步执行
	}
}