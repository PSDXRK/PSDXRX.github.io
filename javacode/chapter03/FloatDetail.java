public class FloatDetail {

	//��дһ��main����
	public static void main(String[] args) {
		//java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float����Ҫ�ں����'f'��'F'
		//float num1 = 1.1;//�Բ��ԣ�����
		float num1 = 1.1F;//�Ե�
		double num2 = 1.1;//��
		double num3 = 1.1f;//�Եģ�С�ķŴ��������ԣ���Ĳ����Է�С������

		//ʮ��������ʽ����5.12     512.0f     .512  (������С����)
		double num4 = .123;//�Եģ��ȼ���0.123
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//��ѧ��������ʽ���� 5.12e2 [5.12*10��2�η�]    5.12E-2 [5.12/10��2�η�]
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512

		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float����ȷ
		//������˵����
		double num5 = 2.1234567851;
		float num6 = 2.1234567851f;
		System.out.println(num5);//���2.1234567851
		System.out.println(num6);//���2.1234567


		//������ʹ�����壺2.7 �� 8.1 / 3 �Ƚ�
		//��һ�δ���
		double num7 = 2.7;//2.7
		double num8 = 8.1 / 3;//�ӽ�2.7��С��������2.7���Ǽ��������������⣬������ѧ�����⣩
		System.out.println(num7);//��� 2.7
		System.out.println(num8);//��� 2.6999999999999997
		//�õ���Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ��ҪС��
		//��һ�δ���
		if( num7 == num8) {
			System.out.println("���");//����������
		}
		//��ȷ������Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if(Math.abs(num7 - num8) < 0.000001) {
			System.out.println("��ֵ�ǳ�С�����ҹ涨ֵ����Ϊ���");

		}//ѡ�к󣬰�Ctrl+/�ɿ���ע��
		System.out.println(Math.abs(num7 - num8));//���4.440892098500626E-16
		//ϸ�ڣ������ֱ�Ӳ�ѯ�õ�С������ֱ�Ӹ�ֵ������ԱȽ��ж�
		

	}
}