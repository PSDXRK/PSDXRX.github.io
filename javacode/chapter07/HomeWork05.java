import java.util.Scanner;
public class HomeWork05 {
	//��дһ��mian����
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double r = myScanneer.nextDouble();
		Circle c1 = new Circle(r);
		System.out.println("�뾶Ϊ" + r +"��Բ���ܳ�Ϊ�� " + c1.perimeter());
		System.out.println("�뾶Ϊ" + r +"��Բ�����Ϊ�� " + c1.area());
	}
}
/*
	��Ŀ��
	  ����һ��Բ��Circle���������ԣ��뾶���ṩ��ʾԲ�ܳ����ܵķ������ṩ��ʾ����ķ���
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