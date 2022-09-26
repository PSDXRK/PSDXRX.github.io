//switch �κ���ϰ
import java.util.Scanner;
public class SwitchExercise {
	public static void main(String[] args) {
		//1) ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��
		//ֻת�� a, b, c, d, e. ��������� "other"��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������a-e");
		char c = myScanner.next().charAt(0);
		switch(c) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
				break;
		}
		//2)��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ�
		//���"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
		//˼·����
		//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ�� switch
		//2. ����������Ҫ����һ��ת��, ���˼· :
		// ����ɼ��� [60,100] , (int)(�ɼ�/60) = 1
		// ����ɼ��� [0,60) , (int)(�ɼ�/60) = 0
		//����ʵ��
		System.out.println("������ɼ���0-100��");
		int score = myScanner.nextInt();
		if(score >= 0 && score <= 100) {
			switch((int)(score/60)) {
				case 0 :
					System.out.println("���ϸ�");
					break;
				case 1 :
					System.out.println("�ϸ�");
					break;
				default :
					System.out.println("��������");
					break;
			}
		}else{
			System.out.println("����ɼ�����");
		}
		//3)��������ָ���·ݣ�
		//��ӡ���·������ļ��ڡ�
		//3,4,5 ���� 6,7,8 �ļ� 9,10,11 �＾ 12, 1, 2 ����
		//[������ϰ, ��ʾ ʹ�ô�͸ ]
		//
		//˼·����
		//1. ���� Scanner ���� �����û�����
		//2. ʹ�� int month ����
		//3. ʹ�� switch ��ƥ�� ,ʹ�ô�͸����ɣ��Ƚϼ��
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		if(month >= 1 && month <=12) {
			switch(month) {
				case 1:
				case 2:
				case 3:
					System.out.println("����");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("�ļ�");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("�＾");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("����");
					break;
				default :
					System.out.println("��������");
					break;
			}
		}else{
			System.out.println("�����·�����");
		}
		
	}
}