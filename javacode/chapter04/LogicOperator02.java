//  ��ʾ | �� || ��ʹ��
public class LogicOperator02 {
	//��дһ��main����
	public static void main(String[] args) {
		// ||(��·��) �� |(�߼���) ������ʾ
		//
		// ||����·��
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}

		// |���߼���
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//����
		int a = 4;
		int b = 9;
		//���� ||����·�򣩶��ԣ������һ������Ϊtrue���������������жϣ�ִ�У�
		if(a < 5 || ++b <50) {
			System.out.println("ok300");//ok300
		}
		System.out.println("a=" + a + " b=" + b);//++bû��ִ�� 4 9
		//���� | (�߼���) ����,�����Ƿ�Ϊtrue,�����������Ȼ���жϣ�ִ�У�
		if(a < 5 | ++b < 50) {
			System.out.println("ok400");//ok400
		}
		System.out.println("a=" + a + " b=" + b);//++bִ���� 4 10

		//��ʵ�ʿ����С����ǻ����� ||����·|��Ч�ʸ���

	}
}