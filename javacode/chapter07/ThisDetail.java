//this��ע�������ʹ��ϸ��
/*
	1) this �ؼ��ֿ����������ʱ�������ԡ�������������
	2) this �������ֵ�ǰ������Ժ;ֲ�����
	3) ���ʳ�Ա�������﷨��this.������(�����б�)
	4) ���ʹ������﷨��this(�����б�); ע��ֻ���ڹ�������ʹ��
	   (��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)
	5) this �������ඨ����ⲿʹ�ã�ֻ�����ඨ��ķ�����ʹ��

 */
public class ThisDetail {
	//��дһ��mian����
	public static void main(String[] args) {

		T t1 = new T();
		t1.f2();
		t1.f3();
		T2 t2 = new T2();//���ù����� T2()
	}
}

class T {
	String name = "jack";
	int num = 20;
	//ϸ�ڣ����ʳ�Ա�������﷨��this.������(�����б�)
	public void f1() {
		System.out.println("f1()����������");
	}

	public void f2() {
		System.out.println("f2()����������");
		//���ñ���� f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}

	//ϸ�ڣ�this �ؼ��ֿ����������ʱ��������
	public void f3() {
		String name = "bob";
		int num = 887;
		//��ͳ��ʽ
		System.out.println("name=" + name +" num=" + num);//���ͽ�ԭ����ʣ�
		                                                  //���f3û�ж���name.num
		                                                  //��������ԣ������˵Ļ��ͷ��ʾֲ�����
		System.out.println("name=" +this.name +" num=" + this.num);//һ����������
	}

}

class T2 {

	//ϸ�ڣ����ʹ������﷨��this(�����б�); ע��ֻ���ڹ�������ʹ��
	//      (��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)
	public T2() {
		//����ȥ���� T(String name,int age)������
		this("jack", 29);//���ڹ������з�������һ��������,������ڵ�һ�����
		System.out.println("���� T2() ������");
	}

	public T2(String name,int age) {

		System.out.println("���� T2(String name,int age) ������");
	}
}