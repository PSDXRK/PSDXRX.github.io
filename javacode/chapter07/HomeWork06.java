import java.util.Scanner;
public class HomeWork06 {
	//编写一个mian方法
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入第一个数n1");
		double n1 = myScanneer.nextDouble();
		System.out.println("请输入第二个数n2");
		double n2 = myScanneer.nextDouble();
		Cale c1 = new Cale(n1, n2);
		System.out.println("两数之和 = " + c1.sum());
		System.out.println("两数之差 = " + c1.reduce());
		System.out.println("两数之积 = " + c1.multiply());
		Double divRes = c1.division();
		if(divRes != null) {
			System.out.println("两数之商 = " + divRes);
		} else {
			System.out.println("您的输入有误，除数不能为 0！");
		}
	}
}
/*
	题目：
		编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
		定义四个方法实现求和、差、、乘、商(要求除数为0的话，要提示)
		并创建两个对象，分别测试
 */
class Cale {
	double n1;
	double n2;
	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public double sum() {
		return n1 + n2;
	}
	public double reduce() {
		return n1 - n2;
	}
	public double multiply() {
		return n1 * n2;
	}
	public Double division() {//Double 才能返回null，double不行
		if(n2 == 0) {
			return null;//不能返回负数，因为除法能得到负数
		} else {
			return n1 / n2;
		}
	}
}