//������ϰ
import java.util.Scanner;
public class Homework05 {
	//����һ��main ����
	public static void main(String[] args) {

		/*
		��Ŀ���������10��������1-100�����浽���飬
		�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±ꡢ
		�����������Ƿ��� 8 
		 */
		int[] arr = new int[10];
		//(int)(Math.random() * 100) + 1 ��������� 1-100
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}

		//�������10��������1-100�����浽����
		System.out.println("======���������arr��Ԫ�����======");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//�����ӡ
		System.out.println("======�������е�arr��Ԫ�����======");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		//�����ֵ�����ֵ���±�
		int max = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ��" + max + "\n" + "���ֵ���±�Ϊ��" + index);

		//��ƽ��ֵ
		double avrNum = 0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avrNum = sum/arr.length;
		System.out.println("ƽ��ֵΪ��" + avrNum);

		//���������Ƿ��� 8
		int index2 = -1;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�ֵ");
		int searchNum = myScanner.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == searchNum) {
				index2 = i;
				break;
			}
		}
		if(index2 != -1) {
			System.out.println("������������� " + searchNum + " ���±�Ϊ " + index2);
		} else {
			System.out.println("�����������û�� " + searchNum);
		}
	}
}