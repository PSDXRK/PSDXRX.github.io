//����������
//java ������ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ�� �β��б� ��һ�£�
//���صĺô���
//   1) �������������鷳
//   2) �����˼������鷳
/*
	ע��㣺
	  ��������������ͬ
	  �β��б����벻ͬ���β����ͻ��߸�����˳��������һ����ͬ����������Ҫ��
	  �������ͣ���Ҫ��
 */
public class OverLoad01 {
	//��дһ��main����
	public static void main(String[] args) {
		//��������
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2.9));
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1, 2, 3));
		System.out.println(mc.calculate(1.4, 2));
		System.out.println(mc.calculate(1.4, 2.9));
	}
}

class MyCalculator {
	//������ĸ� calculate ��������������
	//���������ĺ�
	public int calculate(int a, int b) {
		System.out.println("calculate(int a, int b) ������");
		return a + b;
	}
	//����δ�������أ������뷵��ֵ�޹أ�ֻ���β��б�ͬ����������ͬ��������
	// public void calculate(int a, int b) {
	// 	System.out.println("calculate(int a, int b) ������");
	// 	int res = a + b;
	// }

	//���������Ƿ񹹳����أ�û�й��ɣ����Ƿ������ظ����壬�ʹ���
	// public int calculate(int c, int d) {
	// 	System.out.println("calculate(int a, int b) ������");
	// 	return c + d;
	// }
	
	//һ������һ��double�ĺ�
	public double calculate(int a, double b) {
		System.out.println("calculate(int a, double b) ������");
		return a + b;
	}
	//һ��double��һ�������ĺ�
	public double calculate(double a, int b) {
		System.out.println("calculate(double a, int b) ������");
		return a + b;
	}
	//����double�ĺ�
	public double calculate(double a, double b) {
		System.out.println("calculate(double a, double b) ������");
		return a + b;
	}
	//���������ĺ�
	public int calculate(int a, int b, int c) {
		System.out.println("calculate(int a, int b, int c) ������");
		return a + b + c;
	}
}