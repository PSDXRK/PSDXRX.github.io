//while��ϰ
import java.util.Scanner;
public class WhileExercise {
	public static void main(String[] args) {
		//��Ŀ1:��ӡ 1~100 ֮�������ܱ�3����������ͳ�Ƹ��� �� �ܺ�.
		//����Ϊ��
		//��1�����1-100
		// int i =1;
		// while(i <= 100) {
		// 	System.out.println("i=" + i);
		// 	i++;
		// }
		//��2��������Ĺ����У����й��ˣ�ֻ��� 9 �ı��� i % 9 ==0
		// int i =1;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//���ܷ���if���棬��Ȼ�޷����������������޷����
		// 	}
		// 	i++;
		// }
		//��3��ͳ�Ƹ��� ����һ������ int count = 0; �� ��������ʱ count++;
		// int i =1;
		// int count = 0;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//���ܷ���if���棬��Ȼ�޷����������������޷����
		// 	}
		// 	i++;
		// 	count++;
		// }
		//(4) �ܺ� , ����һ������ int sum = 0; ����������ʱ�ۻ� sum += i;
		// int i =1;
		// int count = 0;
		// int sum = 0;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//���ܷ���if���棬��Ȼ�޷����������������޷����
		// 		count++;
		// 		sum += i;
		// 	}
		// 	i++;

		// }
		// System.out.println("����Ϊ��" + count);
		// System.out.println("�ܺ�Ϊ��" + sum);
		//�������
		//(1) Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ�ͽ�����ֵ����������
		//(2) �����Ը���һ�� 3 ����Ҳ���ɱ��� int
		//(3) �����Ա�ɿ��Ըı�����롣����scanner����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ʼֵ��");
		int start = myScanner.nextInt();
		System.out.println("���������ֵ��");
		int end = myScanner.nextInt();
		System.out.println("�����뱶����");
		int multiple = myScanner.nextInt();
		int i =start;
		int count = 0;
		int sum = 0;
		while(i <= end) {
			if(i % multiple == 0) {
				System.out.println("i=" + i);
				//i++;//���ܷ���if���棬��Ȼ�޷����������������޷����
				count++;
				sum += i;
			}
			i++;

		}
		System.out.println("=================");
		System.out.println("����Ϊ��" + count);
		System.out.println("�ܺ�Ϊ��" + sum);
		System.out.println("=================");
	}
}