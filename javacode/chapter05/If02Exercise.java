//if-else��ϰ
public class If02Exercise {
	public static void main(String[] args) {
		int x = 7;
		int y = 4;
		if(x > 5) {
			if(y > 5) {
				System.out.println(x + y);
			}else{
				System.out.println("�λԷ�ѧϰ�С���");
			}
		}else{
			System.out.println("x is" + x);
		}//������λԷ�ѧϰ��
		

		//��д��������2��double�ͱ�������ֵ
		//�жϵ�һ��������10.0���ҵڶ�����С��20.0����ӡ�������ĺ�
		//
		double d1 = 23.0;
		double d2 = 12.7;
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}


		//������������int���ж϶��ߵĺ�
		//�Ƿ��ܱ�3���ܱ�5��������ӡ��ʾ��Ϣ
		//˼·����
		//1.������������num1 �� num2
		//2.����һ������sun = num1 + num2
		//3.sum%3,5�����0��˵����������
		//4.ʹ��if-else����ʾ��Ӧ��Ϣ
		int num1 = 20;
		int num2 = 55;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println(num1 + "��" + num2 + "�ĺͿ��Ա�3��5����");
		}else {
			System.out.println(num1 + "��" + num2 + "�ĺͲ����Ա�3��5����");
		}


		//�ж�һ������Ƿ������꣬����������Ƿ��������������֮һ��
		//��1������ܱ�4�����������ܱ�100��������2���ܱ�400����
		//
		//˼·����
		//1.������� int year ������
		//2.����ܱ�4�����������ܱ�100����
		// => year % 4 == 0 && year % 100 != 0
		//3.����ܱ�400���� => year % 400 == 0
		//4.����2��3�� �� �Ĺ�ϵ
		//����ʵ��
		int year = 2020;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "������");
		}else{
			System.out.println(year + "��������");
		}
	}
}
