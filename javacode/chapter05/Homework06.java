//���ƽṹ��ҵ
/*
���Сд��a-z,�Լ���д��Z-A
���� �ַ������forѭ��
 */
import java.util.Scanner;
public class Homework06 {
	//����һ��main����
	public static void main(String[] args) {
		/*
		˼·����
		1.'b' = 'a' + 1   'c' = 'a' + 2 �Դ�����
		2.ʹ��for�㶨
		for(char c1 = 'a'; c1 <= 'z'; c1++){
			System.out.print(c1 + " ");
		}
		 Ҳ�����ַ���Ӧ�ı������
		for(char c1 = 97; c1 <= (97 + 25); c1++){
			System.out.print(c1 + " ");
		}
		3.�����д��Z-A��ͬ��
		for(char c2 = 'Z'; c2 >= 'A'; c2--){
			System.out.print(c2 + " ");
		}
		Ҳ�����ַ���Ӧ�ı������
		for(char c2 = 90; c1 <= (90 - 25); c1--){
			System.out.print(c1 + " ");
		}
		 */
		for(char c1 = 97; c1 <= (97 + 25); c1++){
			System.out.print(c1 + " ");
		}
		System.out.println();
		for(char c2 = 90; c2 >= (90 - 25); c2--){
			System.out.print(c2 + " ");
		}
	}
}