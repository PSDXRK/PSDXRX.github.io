public class ForceConvertDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//��ʾǿ������ת��
		//ϸ��1��ǿ��ת������ֻ�������Ĳ�������Ч��������ʹ��С�����������ȼ�
		//int x = (int)10*3.5+6*1.5;//double --> int �ᱨ��
		int y = (int)(10*3.5+6*1.5);//�Եģ����ˣ����������ȼ�
		System.out.println(y);//44  35.0 + 9.0 = 44.0(double) --> 44(int)

		//ϸ��2��char ���Ϳ��Ա��� int �ĳ���ֵ�������ܱ��� int �ı���ֵ����Ҫǿת
		char c1 = 100;//ok char ���Ϳ��Ա��� int �ĳ���ֵ
		int m = 100;//ok
		//char c2 = m;//���� char���ܱ��� int �ı���ֵ
		char c3 = (char)m;//ok
		System.out.println(c3);//100��Ӧ���ַ� d


	}
}