//Ƕ�׷�֧����
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		//��Ŀ���μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭
		//���Ҹ����Ա���ʾ�����������Ů���飬����ɼ����Ա�
		//�����жϺ������Ϣ
		
		// ��ʾ: double score; char gender;
		// �����ַ�: char gender = scanner.next().charAt(0)
		

		//˼·����
		//1. ���� Scanner ���󣬽����û�����
		//2. ���� �ɼ����浽 double score
		//3. ʹ�� if-else �ж� ��������ɼ����� 8.0 ���������������ʾ��̭
		//4. ������뵽 �������ٽ��� char gender, ʹ�� if-else �����Ϣ
		//����ʵ�� =>
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ø��ֳɼ�");
		double score = myScanner.nextDouble();
		System.out.println("�������Ա�");
		char gender = myScanner.next().charAt(0);//�����ַ�
		//�Ƚ����ַ������ڽ��ܵ�һ���ַ�
		if(score > 8.0) {
			System.out.println("===============================\n���������");
			if(gender == '��'){
				System.out.println("����������");
			}else if(gender == 'Ů') {
				System.out.println("����Ů����");
			} else {
				System.out.println("����Ա�������������������");
			}
		}else {
			System.out.println("sorry,�㱻��̭�ˣ�");
		}


	}
}