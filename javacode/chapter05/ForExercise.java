//For��ϰ
import java.util.Scanner;
public class ForExercise {
	public static void main(String[] args) {
		//��Ŀ1:��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� �� �ܺ�.
		//�Ϻ����������˼��(����)
		//1. ����Ϊ�� : �������ӵ����󣬲��ɼ򵥵���������� ��� = ˼�� --��ϰ-> ����
		//2. ������� : �ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��
		//˼·����
		//��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� �� �ܺ�
		//����Ϊ��
		//(1) ��� ��� 1-100 ��ֵ
		// for(int i = 0 ; i <= 100; i++) {
		// 	System.out.println("i=" + i);
		// }
		//(2) ������Ĺ����У����й��ˣ�ֻ��� 9 �ı��� i % 9 ==0
		// for(int i = 0 ; i <= 100; i++) {
		// 	if(i % 9 == 0) {
		// 		System.out.println("i=" + i);
		// 	}
		// }
		//(3) ͳ�Ƹ��� ����һ������ int count = 0; �� ��������ʱ count++;
		// int count = 0;
		// for(int i = 0 ; i <= 100; i++) {
		// 	if(i % 9 == 0) {
		// 		System.out.println("i=" + i);
		// 		count++;
		// 	}
		// }
		//(4) �ܺ� , ����һ������ int sum = 0; ����������ʱ�ۻ� sum += i;
		int count = 0;
		int sum = 0;
		for(int i = 1 ; i <= 100; i++) {
			if(i % 9 == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;//�ȼ�sum = sum + i
			}
		}
		System.out.println("����Ϊ��" + count);
		System.out.println("�ܺ�Ϊ��" + sum);


		//�������
		//(1) Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ�ͽ�����ֵ����������
		//(2) �����Ը���һ�� 9 ����Ҳ���ɱ��� int
		//(3) �����Ա�ɿ��Ըı�����롣����scanner����
		int count2 = 0;
		int sum2 = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ʼֵ��");
		int start = myScanner.nextInt();
		System.out.println("���������ֵ��");
		int end = myScanner.nextInt();
		System.out.println("�����뱶����");
		int multiple = myScanner.nextInt();
		for(int j = start ; j <= end; j++) {
			if(j % multiple == 0) {
				System.out.println("j=" + j);
				count2++;
				sum2 += j;//�ȼ�sum = sum + i
			}
		}
		System.out.println("����Ϊ��" + count2);
		System.out.println("�ܺ�Ϊ��" + sum2);

	}
}