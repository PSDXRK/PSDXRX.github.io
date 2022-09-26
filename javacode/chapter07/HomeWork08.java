/*
	题目：
		给定一个Java程序的代码如下所示，则编译运行后，输出结果是？
 */
public class HomeWork08 {//公有类
	int count = 9; //属性
	public void count1() { //HomeWork08类的成员方法
		count = 10;//这个count就是属性 改成10
		System.out.println("count1= " + count);//10
	}
	public void count2() { //HomeWork08类的成员方法
		System.out.println("count1= " + count++);//先输出9 再自增成 10
	}
	//这是HomeWork08类的main方法，任何一个类都可有 main
	public static void main(String args[]) {
		//老师解答：
		//1. new HomeWork08() 是匿名对象(没有名字的对象，
		//    在堆里，没有被栈引用，使用后，就被销毁，只能用一次)
		//2. new HomeWork08().count1();创建好对象后，就调用coount1()
		new HomeWork08().count1();//10
		HomeWork08 t1 = new HomeWork08();
		t1.count2();//9  先输出9 再自增成 10，此时homework08类的属性count已经变成10
		t1.count2();//10 先输出10 再自增成 11，此时homework08类的属性count已经变成10
	}
}