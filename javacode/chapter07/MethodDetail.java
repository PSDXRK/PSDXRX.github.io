public class MethodDetail {
	//��дһ��main����
	public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);//1��4��ʵ��
		System.out.println("�� = " + res[0] + "  �� = " + res[1]);


		//ϸ�ڣ����ô������ķ���ʱ��һ����Ӧ�Ų����б�����ͬ���ͻ��߼������͵Ĳ���
		byte b1 = 1;
		byte b2 = 2;
		//���÷���ʱ������ģ��Ĳ�������ʵ�Σ�ʵ�ʲ�����
		a.getSumAndSub(b1, b2);//���� byte -> int
		//a.getSumAndSub(1,1, 1.8);//����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
		
		//ϸ�ڣ� ʵ�κ��βε�����Ҫ����һ�»���ݡ�������˳�����һ��
		//a.getSumAndSub(100);// x ������ͳһ
		
		a.f4("tom", 10);// ok
		a.f4(10, "tom");// x  ʵ�κ��β�˳�򲻶�
	}
}


class AA {

	//ϸ�ڣ� ��������Ƕ�׶���
	// public void f5() {
	// 	public void f6() {}//������ ��������Ƕ�׶���
	// }
	
	public void f4(String str, int n) {

	}

	
	//1. һ�����������һ������ֵ [˼������η��ض����� �������� ]
	public int[] getSumAndSub(int n1, int n2) {//int n1, int n2���β�
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. ����ֵ�����Ϳ���Ϊ�������ͣ����������������ͻ��������ͣ����飬���󣩡�
	//   �� getSumAndSub
	
	//3. �������Ҫ�󷵻�ֵ���ͣ��򷽷���������ִ��������Ϊ return ֵ��
	//   ����Ҫ�󷵻�ֵ���ͱ����return��ֵһ�»����
	public double f1() {//��������������շ�������������Ϊ�˷������ f1֮��
						//��ȷ�ķ���Ӧ���� getSumAndSub ����
						//��ʾ����ʵ�ʹ����У����ǵķ�������Ϊ�����ĳ�����ܣ�
						//���Է�����Ҫ��һ�����壬����Ǽ���֪��

		double d1 = 1.1 * 3;
		int n = 100;
		return n;//���Ե� �൱�� int -> double
	}
	// public int f2() {

	// 		double d1 = 1.1 * 3;
	// 		return d1;//����: �����ݵ�����: ��doubleת����int���ܻ�����ʧ
	
	//4. �������Ϊ void ���򷽷��п���û��return��䣬���� ֻд return��
	public void f3() {
		System.out.println("HELLO");
		int n = 10;
		return;//����
		//return n;//������ 

	}
}

