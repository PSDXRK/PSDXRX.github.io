//���ƽṹ��ҵ
/*
ʵ���ж�һ�������Ƿ�Ϊˮ�ɻ�����ˮ�ɻ���ָ����һ��3λ����
�����λ�������ĺ͵����䱾������ 153 = 1*1*1 + 5*5*5 + 3*3*3
 */
import java.util.Scanner;
public class Homework04 {
	//����һ��main����
	public static void main(String[] args) {
		//����һ���Լ�д�ģ�
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������λ��������");
		int num  = myScanner.nextInt();
		int baiweiNum = num/100;
		int shiweiNum = (num%100)/10;
		int geweiNum = num%10;
		if(num == (baiweiNum*baiweiNum*baiweiNum 
			+ shiweiNum*shiweiNum*shiweiNum
			+ geweiNum*geweiNum*geweiNum)) {
			System.out.println("������ˮ�ɻ���");
		}else{
			System.out.println("��������ˮ�ɻ���");
		}

	}
}
