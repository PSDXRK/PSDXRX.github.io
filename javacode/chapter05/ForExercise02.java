//For��ϰ
import java.util.Scanner;
public class ForExercise02 {
	public static void main(String[] args) {
		//��Ŀ2���������ı��ʽ���
		//0+5=5
		//1+4=5
		//2+3=5
		//3+2=5
		//4+1=5
		//5+0=5
		//����Ϊ��
		//(1)����� 0-5
		// for (int i = 0; i <= 5; i++) {
		// 	System.out.println(i);
		// }
		//(2)�����+�� 5-i
		// for (int i = 0; i <= 5; i++) {
		// 	System.out.println(i + "+" + (5-i)+ "=5");
		// }
		//�������
		//��1��5 ��ɱ��� 
		//��2�������Ա�ɿ��Ըı�����롣����scanner����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������������");
		int num = myScanner.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(i + "+" + (num-i)+ "=" + num);
		}
	}
}