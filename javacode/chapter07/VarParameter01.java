//�ɱ������������
/*
	java ����ͬһ�����ж��ͬ��ͬ���ܵ�����������ͬ�ķ�������װ��һ��������
�Ϳ���ͨ���ɱ����ʵ�֡�
	�����﷨
	�������η� �������� ������(��������... �β���) {
	
	}

 */
public class VarParameter01 {
	//��дһ��main����
	public static void main(String[] args) {
		HhfMethod method = new HhfMethod();
		System.out.println("��ͽ��Ϊ��" + method.sum(1,2,3,4,5));
		System.out.println("��ͽ��Ϊ��" + method.sum(1,200));
	}
}

class HhfMethod {
	//���� sum �����Լ��� 2 �����ĺͣ�3 �����ĺ� �� 4. 5��....
	//�����÷�������
	// public int sum(int n1, int n2) {//2�����ĺ�
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {//3�����ĺ�
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3��int n4) {//4�����ĺ�
	// 	return n1 + n2 + n3 + n4;
	// }
	//........
	//������������������ͬ��������ͬ������������ͬ --> �ɱ�����Ż�
	//1.int...��ʾ���ܵ��ǿɱ������������int�������Խ��ܶ��int(0-��)
	//2.ʹ�ÿɱ����ʱ�����Ե���������ʹ�� �� nums ���Ե�������
	//3.���� nums ��ͼ���
	public int sum(int... nums) {
		System.out.println("���ܵĲ�������= " + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}