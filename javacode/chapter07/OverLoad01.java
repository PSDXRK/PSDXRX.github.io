//方法的重载
//java 中允许同一个类中，多个同名方法的存在，但要求 形参列表 不一致！
//重载的好处：
//   1) 减轻了起名的麻烦
//   2) 减轻了记名的麻烦
/*
	注意点：
	  方法名：必须相同
	  形参列表：必须不同（形参类型或者个数或顺序，至少有一样不同，参数名无要求
	  返回类型：无要求
 */
public class OverLoad01 {
	//编写一个main方法
	public static void main(String[] args) {
		//快速入门
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2.9));
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1, 2, 3));
		System.out.println(mc.calculate(1.4, 2));
		System.out.println(mc.calculate(1.4, 2.9));
	}
}

class MyCalculator {
	//下面的四个 calculate 方法构成了重载
	//两个整数的和
	public int calculate(int a, int b) {
		System.out.println("calculate(int a, int b) 被调用");
		return a + b;
	}
	//下面未构成重载，重载与返回值无关，只有形参列表不同而方法名相同才是重载
	// public void calculate(int a, int b) {
	// 	System.out.println("calculate(int a, int b) 被调用");
	// 	int res = a + b;
	// }

	//看看下面是否构成重载，没有构成，而是方法的重复定义，就错了
	// public int calculate(int c, int d) {
	// 	System.out.println("calculate(int a, int b) 被调用");
	// 	return c + d;
	// }
	
	//一个整数一个double的和
	public double calculate(int a, double b) {
		System.out.println("calculate(int a, double b) 被调用");
		return a + b;
	}
	//一个double和一个整数的和
	public double calculate(double a, int b) {
		System.out.println("calculate(double a, int b) 被调用");
		return a + b;
	}
	//两个double的和
	public double calculate(double a, double b) {
		System.out.println("calculate(double a, double b) 被调用");
		return a + b;
	}
	//三个整数的和
	public int calculate(int a, int b, int c) {
		System.out.println("calculate(int a, int b, int c) 被调用");
		return a + b + c;
	}
}