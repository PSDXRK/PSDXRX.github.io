//���ƽṹ��ҵ
/*
���1+(1+2)+(1+2+3)+....(1+2+3+...+100)�ĺ�
 */
import java.util.Scanner;
public class Homework08 {
	//����һ��main����
	public static void main(String[] args) {
		/*
		���1+(1+2)+(1+2+3)+....(1+2+3+...+100)�ĺ�
		˼·����
		1.һ����100�����
		2.ÿһ���������������
		3.����һ��˫��ѭ��
		4.ʹ��sum�ۼƼ���
		 */
		int sum = 0;
		for(int i  = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println("sum=" + sum);
	}
}