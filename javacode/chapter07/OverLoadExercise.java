public class OverLoadExercise {
	//编写一个main方法
	public static void main(String[] args) {
		//练习一：编写程序，类 Methods 中定义三个重载方法并调用。方法名为 m。
		//       三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
		//       分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
		//       在主类的 main ()方法中分别用参数区别调用三个方法
		Method methods = new Method();
		methods.m(10);
		methods.m(3,7);
		methods.m("hello!");

		//练习二：定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，
		//       第二个方法，返回两个 double 值中的最大值，
		//       第三个方法，返回三个 double 值中的最大值，并分别调用三个方法
		//测试
		System.out.println(methods.max(24,67));//67
		System.out.println(methods.max(24.9,67.8));//67.8
		System.out.println(methods.max(24.9,67.8,78.7));//78.7
	}
}

class Method {
	//1.接收一个int参数，执行平方运算
	public void m(int n) {
		System.out.println(" 平方= " + (n * n));
	}
	//2.接收两个int参数，相乘并输出结果
	public void m(int n1, int n2) {
		System.out.println(" 相乘= " + (n1 * n2));
	}
	//3.接收一个字符串，并输出字符串信息
	public void m(String str) {
		System.out.println(" 接收到的信息= " + str);	
	}

	//1.返回两个 int 值中的最大值
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;//返回（n1>n2为真，则n1,为假，则n2)
	}
	//2.返回两个 double 值中的最大值
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	//3.返回三个 double 值中的最大值
	public double max(double n1, double n2, double n3) {
		//先求出n1和n2的最大值
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}