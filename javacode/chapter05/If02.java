//if-else����������
//˫��֧
//�����﷨��
//if(�������ʽ) {
//	ִ�д���� 1;
//}
//else {
//	ִ�д���� 2;
//}
//˵��������������ʱ����ִ�д����1.����ִ�д����2.
//���ִ�д����ֻ��һ����䣬��{}����ʡ�ԣ����򣬲���ʡ��
import java.util.Scanner;
public class If02 {
	public static void main(String[] args) {
		//Ҫ�󣺱�дһ�����򣬿��������˵����䣬�����ͬ־���������18��
		//�����"����������18�꣬Ҫ���Լ�����Ϊ���𣬽������"
		//�������"������䲻�󣬷Ź�����"
		
		//˼·����
		//1.������������䣬Ӧ�ö���һ��Scanner����
		//2.�����䱣�浽һ������ int = age
		//3.ʹ�� if-else �жϣ������Ӧ��Ϣ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������");
		int age = myScanner.nextInt();
		if(age > 18) {
			int outage = age - 18;
			System.out.println("����������18��" + outage +"�꣬Ҫ���Լ�����Ϊ���𣬽������");
		}else {
			int leftage = 18 - age;
			System.out.println("������䲻��,����18�껹��" + leftage +"�꣬�Ź�����");
		}
		System.out.println("�������....");

	}
}