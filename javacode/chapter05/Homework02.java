//���ƽṹ��ҵ
/*
ʵ���ж�һ�������������ĸ���Χ������0��С��0������0
 */
import java.util.Scanner;
public class Homework02 {
	//����һ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������");
		int num = myScanner.nextInt();
		if(num > 0) {
			System.out.println("��������0");
		}else if(num == 0){
			System.out.println("��������0");
		}else{
			System.out.println("����С��0");
		}
	}
}