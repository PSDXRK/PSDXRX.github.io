//��ʾ��Ԫ�����(?)
public class TernaryOperator {
	//��дһ��main����
	public static void main(String[] args) {
		//�����﷨: �������ʽ �� ���ʽ1�����ʽ2��
		//�������
		//1.����������ʽΪtrue,�����Ľ���Ǳ��ʽ 1 ��
		//1.����������ʽΪfalse,�����Ľ���Ǳ��ʽ 2 ��
		//�ھ�����һ�ƴ�ʦ��һ���ʦ��

		int a = 10;
		int b = 99;
		//���
		//1. a > b Ϊ false
		//2. ���� b--,�ȷ��� b ��ֵ��Ȼ���� b-1
		//3.���صĽ��result�� 99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result + " b=" + b);//99 98

		//���
		//1. a < b Ϊ true 
		//2. ���� a++,�ȷ��� a ��ֵ��Ȼ���� a++
		//3.���صĽ��result�� 10
		int result2 = a < b ? a++ : b--;
		System.out.println("result2=" + result2 + " a=" + a + " b=" + b);//10 11 98

	}
}