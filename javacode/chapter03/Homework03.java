//��̣����������������� + ƴ�ӣ���Ч�������������Ա��üӺ�ƴ�ӿ�Ч��
//����������ļ۸��üӺ�ƴ�ӣ���Ч��
public class Homework03 {
	//��дһ��main����
	public static void main(String[] args) {
		//��̣����������������� + ƴ�ӣ���Ч��
		String book1 = "���������ء�";
		String book2 = "�����塷";
		String s3 = book1 + book2;
		System.out.println(s3);

		//���������Ա��üӺ�ƴ�ӿ�Ч��
		//�Ա��ǵ����ַ� Ӧ����char����
		char c1 = '��';
		char c2 = 'Ů';
		System.out.println(c1 + c2);//�õ� �� �ַ���ֵ + Ů �ַ���ֵ
		String s1 = c1 + "";
		String s2 = c2 + "";
		String gender = s1 + s2;
		System.out.println(gender);

		//����������ļ۸��üӺ�ƴ�ӣ���Ч��
		double price1 = 20.50;
		double price2 = 30.98;
		System.out.println(price1 + price2);


	}
}