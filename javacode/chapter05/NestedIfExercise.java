//Ƕ�׷�֧�κ���ϰ
import java.util.Scanner;
public class NestedIfExercise {
	public static void main(String[] args) {
		//��Ʊϵͳ�����ݵ��������·ݺ����䣬��ӡƱ��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ο�����");
		int age = myScanner.nextInt();
		System.out.println("�����뵱ǰ�·�");
		int month = myScanner.nextInt();
		if (month > 4 && month < 10) {
			System.out.println("��ǰΪ������");
			if(age >= 18 && age <= 60) {
				System.out.println("����Ʊ��Ϊ��60Ԫ");
			} else if (age < 18) {
				System.out.println("��ͯΪ��ۣ�" + (60/2) +"Ԫ");
			} else if (age > 60) {
				System.out.println("���˼۸�Ϊ����֮һ��" + (60/3) + "Ԫ");
			} else {
				System.out.println("������������");
			}
		} else {
			System.out.println("��ǰΪ������");
			if(age >= 18 && age <= 60) {
				System.out.println("����Ʊ��Ϊ��40Ԫ");
			}else {
				System.out.println("Ʊ�ۣ�20Ԫ");
			}
		} 
	}
}