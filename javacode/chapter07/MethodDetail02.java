public class MethodDetail02 {
	//��дһ��main����
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();

		a.m1();

	}
}
class A {
	//1. ͬһ���еķ������ã�ֱ�ӵ��ü���
	
	public void print(int n) {
		System.out.println("print���������� n= " + n);// 10
	}

	public void sayOk() {
		print(10);//ͬһ���еķ������ã�ֱ�ӵ��ü���
		System.out.println("����ִ��sayOk()");
	}

	//2. �����еķ���A�����B�෽������Ҫͨ������������
	public void m1() {
		//�ȴ���һ��B�Ķ���
		System.out.println("m1()����������");// ��һ��ִ��
		B b = new B();
		b.hi();

		System.out.println("m1()��������ִ��");// ������ִ��
	}
}

class B {
	public void hi() {
		System.out.println("B���е�hi()��ִ��");// �ڶ���ִ��
	}
}