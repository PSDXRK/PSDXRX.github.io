//������ϰ
public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//������ʵ�������������ֵ
		int n1 = 55;
		int n2 = 33;
		int n3 = 113;
		//˼·
		//1.�ȵõ� n1 �� n2 �����ֵ�����浽 max1
		//2.Ȼ������� max1 �� n3 �е����ֵ�����浽 max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.print("������ǣ�" + max2);

		//ʹ��һ�����ʵ��(�Ƽ�ʹ������ķ�����������)
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.print("\n������ǣ�" + max);

	}
}