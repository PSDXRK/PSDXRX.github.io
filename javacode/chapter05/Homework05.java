//���ƽṹ��ҵ
/*
���1-100֮�䲻�ܱ�5����������ÿ���һ��
 */
import java.util.Scanner;
public class Homework05 {
	//����һ��main����
	public static void main(String[] args) {
		int count = 0;//ͳ������ĸ���
		for(int i = 1; i <= 100; i++) {
			if(i%5 != 0) {
				count++;
				System.out.print(i + "\t");
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}