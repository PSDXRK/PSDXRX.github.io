//����ʹ��ע������
public class ArrayDetail {
	//����һ��main ����
	public static void main(String[] args) {
		//ϸ��1�������Ƕ����ͬ�������ݵ���ϣ�ʵ�ֶ���Щ����ͳһ����
		int[] arr1 = {1, 2, 3, 4, 5};//�Ե�
		// int[] arr1 = {1, 2, 3, 4, 1.1};//��� double -> int 
		// int[] arr1 = {1, 2, 3, 4, "hello"};//��� string -> int 
		double[] arr2 = {1.1, 2.2, 3.2, 4.2, 100};//�Ե�int->double����
		//ϸ��2�������е�Ԫ�ؿ������κ��������ͣ�
		//      ���������������ͺ��������͵��ǲ��ܻ���
		String[] arr3 = {"����","jack","milan"};
		//ϸ��3�����鴴�������û�и�ֵ����Ĭ��ֵ
		//      int 0, short 0, byte 0, long 0,
		//      float 0.0, double 0.0, char \u0000,
		//      boolean false, String null,
		//      
		short[] arr4 = new short[3];
		System.out.println("======����arr4======");
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);//0 0 0
		}
		//ϸ��4�������±������ָ����Χ��ʹ�ã����򱨣��±�Խ���쳣������
		//int[] arr = new int[5];����Ч�±�Ϊ0-4
		//��������±�/���� ��С 0 ��� ���鳤��-1(5-1=4)
		int[] arr = new int[5];
		//System.out.println(arr[5]);//������Ϊ 5-1=4
		System.out.println(arr[4]);//�Եģ����Ե�
	}
}