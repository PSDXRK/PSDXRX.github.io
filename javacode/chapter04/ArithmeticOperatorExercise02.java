//��ϰ��
public class ArithmeticOperatorExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		//���绹��59��ż٣��ʣ���xx��������xx�죿
		int week = 59 / 7;
		int day = 59 % 7;
		System.out.println("���绹��59��ż٣���" + week 
			+ "������" + day + "��");
		
		int days = 12359;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "��ż٣���" + weeks + "������" 
			+ leftdays + "��");
		 
		//����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��
		//5/9*(�����¶�-100)������������¶ȶ��õ������¶�
		double huashi = 135.6;
		double sheshi = 5.0 / 9.0 * (huashi - 100.0);
		System.out.println("�����¶�" + huashi + "��Ӧ�������¶�Ϊ��" + sheshi);

	}
}