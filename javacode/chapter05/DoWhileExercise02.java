//do while��ϰ
import java.util.Scanner;
public class DoWhileExercise02 {
	public static void main(String[] args) {
		//��Ŀ2�������������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪ
		//[System.out.println("�Ϻ��ʣ���Ǯ��y/n")] do...while .. //
		//����Ϊ��
		//(1) ��ͣ���ʻ�Ǯ��?
		////(2) ʹ�� char answer ���ջش�, ����һ�� Scanner ����
		// Scanner myScanner = new Scanner(System.in);
		// char answer = ' ';
		// do {
		// 	System.out.println("����ʹ������������~");
		// 	System.out.println("�����ʻ�Ǯ�𣿣�y/n");
		// 	answer = myScanner.next().charAt(0);
		// 	System.out.println("����Ļش���" + answer);

		// }while(true);
		//(3) �� do-while �� while �ж������ y �Ͳ���ѭ��
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("����ʹ������������~");
			System.out.println("���������󴫻�Ǯ�𣿣�y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("======================" );
			System.out.println("���󴫱����ش�" + answer);
			System.out.println("======================" );

		}while(answer != 'y');
		System.out.println("======================" );
		System.out.println("����˵���������~�һ�Ǯ����");
		System.out.println("======================" );
		
	}
}