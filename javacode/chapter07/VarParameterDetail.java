/*
	�ɱ����ע�������ʹ��ϸ��
	    1. �ɱ������ʵ�θ�������Ϊ0����������
	    2. �ɱ������ʵ�ο���Ϊ���顣
	    3. �ɱ�����ı��ʾ������顣
	    4. �ɱ�������Ժ���ͨ���͵Ĳ���һ������β����б������뱣֤�ɱ�����ں�
	    5. һ���β��б���ֻ�ܳ���һ���ɱ����
 */
public class VarParameterDetail {
	//��дһ��main����
	public static void main(String[] args) {
		//ϸ�ڣ��ɱ������ʵ�ο���Ϊ����
		T t1 = new T();
		int[] arr = {1, 2, 3};
		t1.f1(arr);
	}
}

class T {
	public void f1(int... nums) {
		System.out.println("����= " + nums.length);
	}

	//ϸ��:�ɱ�������Ժ���ͨ���͵Ĳ���һ������β����б������뱣֤�ɱ�����ں�
	// public void f2(double... nums, String str) {//��� �뱣֤�ɱ�����ں�

	// }
	public void f2(String str, double... nums) {//�Ե�

	}
}