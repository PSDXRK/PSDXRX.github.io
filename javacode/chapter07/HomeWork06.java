import java.util.Scanner;
public class HomeWork06 {
	//��дһ��mian����
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("�������һ����n1");
		double n1 = myScanneer.nextDouble();
		System.out.println("������ڶ�����n2");
		double n2 = myScanneer.nextDouble();
		Cale c1 = new Cale(n1, n2);
		System.out.println("����֮�� = " + c1.sum());
		System.out.println("����֮�� = " + c1.reduce());
		System.out.println("����֮�� = " + c1.multiply());
		Double divRes = c1.division();
		if(divRes != null) {
			System.out.println("����֮�� = " + divRes);
		} else {
			System.out.println("�����������󣬳�������Ϊ 0��");
		}
	}
}
/*
	��Ŀ��
		��̴���һ��Cale�����࣬�����ж���2��������ʾ������������
		�����ĸ�����ʵ����͡�����ˡ���(Ҫ�����Ϊ0�Ļ���Ҫ��ʾ)
		�������������󣬷ֱ����
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
	public Double division() {//Double ���ܷ���null��double����
		if(n2 == 0) {
			return null;//���ܷ��ظ�������Ϊ�����ܵõ�����
		} else {
			return n1 / n2;
		}
	}
}