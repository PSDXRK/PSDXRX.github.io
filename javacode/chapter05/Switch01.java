//Switch ��������
import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		/*
		������ 
		���дһ�����򣬸ó�����Խ���һ���ַ�������a,b,c,d,e,f,g
		a��ʾ����һ��b��ʾ���ڶ�����
		�����û�������ʾ��Ӧ��Ϣ��Ҫ��ʹ�� Switch ������

		˼·����
		1.����һ���ַ�������scanner����
		2.ʹ��switch �����ƥ�䣬�������Ӧ��Ϣ
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������ַ���a-g��:");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("��������һ");
				break;
			case 'b' :
				System.out.println("�������ڶ�");
				break;
			case 'c' :
				System.out.println("����������");
				break;
			case 'd' :
				System.out.println("����������");
				break;
			case 'e' :
				System.out.println("����������");
				break;
			case 'f' :
				System.out.println("����������");
				break;
			case 'g' :
				System.out.println("����������");
				break;
			default:
				System.out.println("�������������ַ�û��ƥ���");

		}

	}
}