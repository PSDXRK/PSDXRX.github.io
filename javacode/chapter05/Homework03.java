//���ƽṹ��ҵ
/*
ʵ���ж�һ������Ƿ�Ϊ���꣬����ܱ�4����,�����ܱ�100������,��������
 */
import java.util.Scanner;
public class Homework03 {
	//����һ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("�����������");
		}else{
		System.out.println("����ݲ�������");
		}
	}
}