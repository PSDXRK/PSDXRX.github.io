//&& �� & ������ʾ
public class LogicOperator01 {
	//��дһ��main����
	public static void main(String[] args) {
		//&& �� & ������ʾ
		//
		// && ��·��
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}

		// & �߼���
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}

		//����
		int a = 4;
		int b = 9;
		//���� &&����·�룩���ԣ������һ������Ϊfalse���������������жϣ�ִ�У�
		if(a < 1 && ++b <50) {
			System.out.println("ok300");//�����
		}
		System.out.println("a=" + a + " b=" + b);//++bû��ִ�� 4 9
		//���� & (�߼���) ����,�����һ������Ϊfalse,�����������Ȼ���жϣ�ִ�У�
		if(a < 1 & ++b < 50) {
			System.out.println("ok400");
		}
		System.out.println("a=" + a + " b=" + b);//++bִ���� 4 10

		//��ʵ�ʿ����С����ǻ����� &&����·�룩Ч�ʸ���

	}
}