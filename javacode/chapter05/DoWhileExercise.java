//do while��ϰ
import java.util.Scanner;
public class DoWhileExercise {
	public static void main(String[] args) {
		//��Ŀ1:ͳ��1--200֮���ܱ�5���������ܱ�3�����ĸ������ܺ�
		//����Ϊ��
		//1.���1-200
		// int i = 1;
		// do {
		// 	System.out.println("i=" + i);
		// 	i++;
		// }while(i <= 200);
		//2.����ܱ�5���������ܱ�3��������
		// int i = 1;
		// do {
		// 	if(i % 5 == 0 && i % 3 != 0){
		// 		System.out.println("i=" + i);
		// 	}
		// 	i++;
		// }while(i <= 200);
		//3.ͳ�Ƹ��� ����һ������ int count = 0; �� ��������ʱ count++;
		//4.�ܺ� , ����һ������ int sum = 0; ����������ʱ�ۻ� sum += i;
		//(1) Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ�ͽ�����ֵ����������
		//(2) �����Ը���һ�� 5,3 ����Ҳ���ɱ��� int
		//(3) �����Ա�ɿ��Ըı�����롣����scanner����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ʼֵ��");
		int start = myScanner.nextInt();
		System.out.println("���������ֵ��");
		int end = myScanner.nextInt();
		System.out.println("�������ܳ��ı�����");
		int multiple1 = myScanner.nextInt();
		System.out.println("�����벻�ܳ��ı�����");
		int multiple2 = myScanner.nextInt();
		int i = start;
		int count = 0;
		int sum = 0;
		do {
			if(i % multiple1 == 0 && i % multiple2 != 0){
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
			i++;
		}while(i <= end);
		System.out.println("����Ϊ��" + count);
		System.out.println("�ܺ�Ϊ��" + sum);
	}
}