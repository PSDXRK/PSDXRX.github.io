public class ArrayReverse {
	//����һ��main����
	public static void main(String[] args) {
		// Ҫ�󣺰������Ԫ�����ݷ�ת�� 
		// arr {11,22,33,44,55,66} --> arr {66, 55,44,33,22,11}
		//��������
		int[] arr = {11, 22, 33, 44, 55, 66};

		//����һ 
		//ͨ���ҹ��ɽ��з�ת
		//˼·����
		//����
		//1. �� arry[0] �� arr[5] ���н��� {66��22��33��44��55��11}
		//2. �� arry[1] �� arr[4] ���н��� {66��55��33��44��22��11}
		//3. �� arry[2] �� arr[3] ���н��� {66��55��44��33��22��11}
		//4. һ��Ҫ���� 3 �� = arr.length / 2
		//5. ÿ�ν���ʱ����Ӧ���±� �� arr[i] �� arr[arr.length - 1 -i]
		//����
		// int temp = 0;
		// for(int i = 0; i < arr.length / 2; i++) {
		// 	temp = arr[arr.length - 1 -i];
		// 	arr[arr.length - 1 -i] = arr[i];
		// 	arr[i] = temp;
		// }
		//�Ż�
		int temp = 0;
		int len = arr.length;//����ĳ���
		for(int i = 0; i < arr.length / 2; i++) {
			temp = arr[len - 1 -i];
			arr[len - 1 -i] = arr[i];
			arr[i] = temp;//�����Լ����ڴ������������
		}
		System.out.println("====��ת�������====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}