import java.util.Scanner;
public class ArrayReduce {
	//����һ��main����
	public static void main(String[] args) {
		/*
		Ҫ��ʵ�ֶ�̬�ĸ���������Ԫ��Ч����ʵ�ֶ�����������
		��һ������{1��2��3��4��5��6}�����Խ����������������
		��ʾ�û��Ƿ����������ÿ���������һ��Ԫ��
		��ֻʣ��һ��Ԫ��ʱ����ʾ������������


		˼·����
		1. �����ʼ���� int[] arr = {1,2,3,4,5,6}
		2. ����һ���µ����� int[] arrNew = new int[arr.length - 1];
		3. ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
		4. �� arr ָ�� arrNew; arr = arrNew;��ô��ԭ����arr����ͱ�����
		5. ����һ��Scanner������Խ����û�����
		6. ��Ϊ�û�ʲôʱ���˳���ȷ����ʹ�� do-while + break������
		*/
		Scanner myScanner = new Scanner(System.in);
		//��ʼ������
		int[] arr = {1,2,3,4,5,6};

		do {
			if(arr.length == 1) {
				System.out.println("�����������ˣ�");
				break;
			}else{
				int[] arrNew = new int[arr.length - 1];
				// ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
				for(int i = 0; i < arrNew.length; i++) {
					arrNew[i] = arr[i];
				}
				//�� arr ָ�� arrNew
				arr = arrNew;
				//���arr
				System.out.println("=====�������arr��Ԫ�����Ϊ=====");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
				}
				System.out.println("\n��ȷ���Ƿ�������� y/n");
				char key = myScanner.next().charAt(0);
				if(key == 'n') {//���Ϊn�˳�ѭ��
					break;
				}
			}
		}while(true);
		System.out.println("�����˳�������");
	}
}