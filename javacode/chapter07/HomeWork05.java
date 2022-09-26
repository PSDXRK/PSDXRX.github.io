import java.util.Scanner;
public class HomeWork05 {
	//编写一个mian方法
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入圆的半径！");
		double r = myScanneer.nextDouble();
		Circle c1 = new Circle(r);
		System.out.println("半径为" + r +"的圆的周长为： " + c1.perimeter());
		System.out.println("半径为" + r +"的圆的面积为： " + c1.area());
	}
}
/*
	题目：
	  定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示面积的方法
 */
class Circle {
	double r;
	public Circle(double r) {
		this.r = r;
	}
	public double perimeter() {
		return Math.PI * (2 * r);
	}
	public double area() {
		return Math.PI * r * r;
	}
}