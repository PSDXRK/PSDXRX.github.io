//�ݹ飺
//�򵥵�˵: �ݹ���Ƿ����Լ������Լ�,ÿ�ε���ʱ���벻ͬ�ı���.
//�ݹ������ڱ���߽����������,ͬʱ�����ô����ü��
public class Recursion01{
	//��дһ��main����
	public static void main(String[] args) {

		T t1 = new T();
		t1.test(4);//���ʲô? n = 2 n = 3 n = 4
		t1.test02(4);//���ʲô�� n = 2
		int res = t1.factorial(5);//1*2*3*4*5 = 120
		System.out.println("5�Ľ׳� res=" + res);//120

	}
}

class T {
	//����(����ʼǵݹ���û���)
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);
	}
	//�뷽��test�Ա�
	public void test02(int n) {
		if(n > 2) {
			test02(n - 1);
		} else {
			System.out.println("n=" + n);
		}
	}
	//factorial �׳� ���ʼ��ڴ�ͼ
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

}