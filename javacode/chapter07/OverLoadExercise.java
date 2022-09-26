public class OverLoadExercise {
	//��дһ��main����
	public static void main(String[] args) {
		//��ϰһ����д������ Methods �ж����������ط��������á�������Ϊ m��
		//       ���������ֱ����һ�� int ���������� int ������һ���ַ���������
		//       �ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
		//       ������� main ()�����зֱ��ò������������������
		Method methods = new Method();
		methods.m(10);
		methods.m(3,7);
		methods.m("hello!");

		//��ϰ���������������ط��� max()����һ���������������� int ֵ�е����ֵ��
		//       �ڶ����������������� double ֵ�е����ֵ��
		//       �������������������� double ֵ�е����ֵ�����ֱ������������
		//����
		System.out.println(methods.max(24,67));//67
		System.out.println(methods.max(24.9,67.8));//67.8
		System.out.println(methods.max(24.9,67.8,78.7));//78.7
	}
}

class Method {
	//1.����һ��int������ִ��ƽ������
	public void m(int n) {
		System.out.println(" ƽ��= " + (n * n));
	}
	//2.��������int��������˲�������
	public void m(int n1, int n2) {
		System.out.println(" ���= " + (n1 * n2));
	}
	//3.����һ���ַ�����������ַ�����Ϣ
	public void m(String str) {
		System.out.println(" ���յ�����Ϣ= " + str);	
	}

	//1.�������� int ֵ�е����ֵ
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;//���أ�n1>n2Ϊ�棬��n1,Ϊ�٣���n2)
	}
	//2.�������� double ֵ�е����ֵ
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	//3.�������� double ֵ�е����ֵ
	public double max(double n1, double n2, double n3) {
		//�����n1��n2�����ֵ
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}