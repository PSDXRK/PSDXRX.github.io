public class ArrayReverse02 {
	//����һ��main����
	public static void main(String[] args) {
		// Ҫ�󣺰������Ԫ�����ݷ�ת�� 
		// arr {11,22,33,44,55,66} --> arr {66, 55,44,33,22,11}
		//��������
		int[] arr = {11, 22, 33, 44, 55, 66};
		//ʹ������ֵ��ʽ
		//˼·����
		//1. �ȴ���һ���µ����� arr2 ����С arr.length
		//2. ������� arr����ÿ��Ԫ�ؿ����� arr2��Ԫ���У�˳�򿽱���
		//3. �����һ��ѭ������ j -> 0->5
		int[] arr2 = new int[arr.length];
		//�������arr
		for(int i = arr.length - 1,j = 0; i >= 0; i--,j++) {
			arr2[j] = arr[i];
		}
		//4. ��for ѭ��������arr2����һ�����������{66��55��44��33��22��11}
		//5. �� arr ָ�� arr2 ���ݿռ䣬��ʱ arrԭ�������ݿռ��û�б�������
		//  �ᱻ�������� ����
		arr = arr2;
		System.out.println("=====arr��Ԫ�����=====");
		//6. ��� arr ����
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
