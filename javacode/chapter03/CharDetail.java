public class CharDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//��Java�У�char�ı�����һ�������������ʱ����unicode���Ӧ���ַ�
		//Ҫ�����Ӧ�����֣����� (int)�ַ�
		char c1 = 97;
		System.out.println(c1);//���a����Ϊ a ��Ӧ��Unicode����97

		char c2 = 'a';
		System.out.println((int)c2);//��� a ��Ӧ�� ���֣���97

		char c3 = '��';
		System.out.println((int)c3);//��� �� ��Ӧ�����֣���20309

		char c4 = 20309;
		System.out.println(c4);//��� �� ����Ϊ �� ��Ӧ��Unicode����20309

		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode�롣
		
		System.out.println('a' + 10);//��� a ��Unicode�� 97�ټ���10����97+10=107�����107

		//����С����
		char c5 = 'b' + 1;//98+1==> 99
		System.out.println((int)c5);//99
		System.out.println(c5);//99->��Ӧ���ַ�->ASCII�����(�涨�õ�)==> c


	}
}