/**
 * ��ʾ�����������ʹ��
 */
public class ArithmeticOperator {
	//��дһ��main����
	public static void main(String[] args) {
		// /(����)��ʹ��
		System.out.println(10 / 4); //����ѧ������2.5��
									//��java����Ϊ 10 4 �������������Խ��ȡ�� 2
		// ע�Ϳ�ݼ� ctrl+/ �ٴ�������ȡ��
		double d = 10 / 4;//java��10/4ȡ��Ϊ2��Ȼ������ת��Ϊdouble,���2.0
		System.out.println(d);//2.0
		System.out.println(10.0 / 4);//2.5
		double d2 = 10.0 / 4;
		System.out.println(d2);//2.5

		// % ȡģ(ȡ��)
		// java�� % �ı��� ��ʽ�� a % b = a - a / b * b
		// �� a �� С��ʱ ��ʽ�� a % b = a - (int)a / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);// -1
		System.out.println(10 % -3);// 1
		System.out.println(-10 % -3);// -1
		System.out.println(-10.5 % 3);// -1.5  -10.5 - -10/3*3= -10.5+9 = -1.5

		// ++ ���ŵ�ʹ��
		/*
		����ʹ��ʱ��i++ �� ++i ��һ����
		 */
		int i = 10;
		i++;//���� �ȼ��� i = i + 1; => i =11
		++i;//���� �ȼ��� i = i + 1; => i =12
		System.out.println("i=" + i);//12

		/*
		��Ϊ���ʽʹ��
		ǰ++�� ++i �������ٸ�ֵ
		��++�� i++ �ȸ�ֵ������
		 */
		int j = 8;
		int k = ++j;//�ȼ� �� j=j+1 �� k=j
		System.out.println("k=" + k + "j=" + j);//9 9

		int f = 8;
		int g = f++;//�ȼ� �� g=f �� f=f+1
		System.out.println("g=" + g + "f=" + f);//8 9


		
	}
}
