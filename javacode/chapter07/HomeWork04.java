public class HomeWork04 {
	//��дһ��mian����
	public static void main(String[] args) {
		A03 a03 = new A03();
		int[] arr = {1,3,5,7,8};
		int[] newArr = a03.copyArr(arr);
		//����newArr����֤
		System.out.println("========���ص� newArr Ԫ���������========");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
	}
}

/*
	��Ŀ��
		��д��A03��ʵ������ĸ��ƹ���copyArr����������飬���������飬Ԫ�غ;�����һ��
 */
//����
//1. ���� A03
//2. ������ copyArr
//3. ����ֵ 
//4. �βΣ�int[] arr1 , int[] arr2)
class A03 {
	public int[] copyArr(int[] oldArr) {
		//�ڶ��У�������һ������Ϊ oldArr.length ������
		int[] newArr = new int[oldArr.length];
		//���� oldArr ���飬��Ԫ�ؿ����� newArr 
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}