//������ϰ
public class ArrayExercise {
	//����һ��main����
	public static void main(String[] args) {
		//����һ��char���͵�26��Ԫ�����飬�ֱ����'A'-'Z'.ʹ��for ѭ��
		//��������Ԫ�ز���ӡ��������ʾ char ������������'A'+1->'B'
		/*
		˼·����
		1.����һ�� ���� char[] chars = new char[26]
		2.��Ϊ 'A' + 1 = 'B' ������ ����ʹ��for ѭ������ֵ
		3.ʹ��for ѭ����������Ԫ��
		 */
		char[] chars = new char[26];
		for(int i = 0; i < chars.length; i++) {//ѭ��26��
			//chars �� char[]
			//dhars[i] �� char����
			chars[i] = (char)('A' + i);//'A'+i �� int ����Ҫǿ��ת��
		}
		//ѭ�����
		System.out.println("======chars����======");
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}