//������ϰ
import java.util.Scanner;
public class Homework04 {
	//����һ��main ����
	public static void main(String[] args) {
		/*
		�᣺��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������
		    ���磺[10,12,45,90],���23������Ϊ[10,12,23,45,90]
		˼·�������Լ���
		1.���ȶ���һ�����飬�ٽ�����������
		2.���������ð������
		 */
		// Scanner myScanner = new Scanner(System.in);
		// //��ʼ������
		// int[] arr = {10, 12, 45, 90};

		// do {
		// 	int[] arrNew = new int[arr.length + 1];
		// 	// ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
		// 	for(int i = 0; i < arr.length; i++) {
		// 		arrNew[i] = arr[i];
		// 	}
		// 	System.out.println("��������Ҫ��ӵ�Ԫ��");
		// 	int addNum = myScanner.nextInt();
		// 	//��4����arrNew���һ��Ԫ��
		// 	arrNew[arrNew.length - 1] = addNum;
		// 	//�� arr ָ�� arrNew
		// 	arr = arrNew;
		// 	//���arr
		// 	System.out.println("=====���ݺ��arr��Ԫ�����Ϊ=====");
		// 	for(int i = 0; i < arr.length; i++) {
		// 		System.out.print(arr[i] + "\t");
		// 	}
		// 	System.out.println("\n��ȷ���Ƿ������� y/n");
		// 	char key = myScanner.next().charAt(0);
		// 	if(key == 'n') {//���Ϊn�˳�ѭ��
		// 		break;
		// 	}
		// }while(true);
		// System.out.println("�����˳���ӣ�");
		// //��������
		// int temp = 0;//���ڸ��������ı�����
		// for(int i = 0; i < arr.length - 1; i++) {//���ѭ����4��
		// 	for(int j = 0; j < arr.length -1 - i; j++) {//4��--3��--2��--1��
		// 		//���ǰ����� > ����������ͽ���
		// 		if(arr[j] > arr[j + 1]) {
		// 			temp = arr[j];
		// 			arr[j] = arr[j+1];
		// 			arr[j + 1] = temp;
		// 			//�����ı����൱������ˮ������Ҫ����������
		// 		}
		// 	}
		// 	System.out.println("\n===��" + (i+1) + "һ������===");
		// 	for(int j = 0; j < arr.length; j++) {
		// 		System.out.print(arr[j] + "\t");
		// 	}
		// }


		//�Ϻ��ķ���
		//˼·���� �������������� + ��λ
		//1. ������ȷ�� �����Ӧ�ò����ĸ�λ��
		//2. Ȼ������
		//3.������� ����Scanner����
		int[] arr = {10, 12, 45, 90};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������Ҫ�����Ԫ��");
		int insertNum = myScanner.nextInt();
		int index = -1;//index����Ҫ�����λ������

		//�������飬������� insertNum <= arr[i],˵�� i ����Ҫ�����λ��
		//ʹ�� index ���� index = i;
		//����������û�з��� insertNum <= arr[i],˵�� index = arr.length
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]){
				index = i;
				break;//�ҵ����˳�ѭ��
			}
		}

		//�ж�index��ֵ
		if(index == -1){//˵����û���ҵ�λ��
			index = arr.length;
		}
		//����
		//�ȴ���һ���µ�����,��С arr.length + 1
		int[] arrNew = new int[arr.length + 1];
		//������ʦ׼����arr��Ԫ�ؿ����� arrNew,����Ҫ����index��λ��
		for(int i = 0, j = 0; i < arrNew.length; i++) {
			if( i != index ) {//˵�����԰�arr��Ԫ�ؿ�����arrNew
				arrNew[i] = arr[j];
				j++;
			}else {// i ���λ�þ���Ҫ�������
				arrNew[i] = insertNum;
			}
		}

		//��arr ָ��arrNew,ԭ��������ͳ�Ϊ����������
		arr = arrNew;
		//�������
		System.out.println("======�����arr�����======");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
} 