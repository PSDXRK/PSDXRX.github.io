public class ScopeDetail {
	//��дһ��mian����
	public static void main(String[] args) {

		Person p1 = new Person();
		/*
		ϸ�ڣ� �����������ڽϳ��������Ŷ���Ĵ����������������Ŷ�������ٶ����١�
			   �ֲ��������������ڽ϶̣����������Ĵ�����ִ�ж�������
			   �����Ŵ����Ľ��������١�����һ�η������ù�������Ч
		 */
		p1.say();//��ִ�� say ����ʱ��say �����ľֲ��������� name �ᴴ����
				//�� say ִ����Ϻ�name �ֲ�����������,
				//��������(ȫ�ֱ���)��Ȼ����ʹ�ã�����Person�е�name������ʹ��
				
				
		T t1 = new T();
		t1.test();//jack �� 1 �ֿ�����ʶ������Եķ�ʽ

		t1.test2(p1);//jack	 �� 2 �ֿ�����ʶ������Եķ�ʽ
	}
}

/*
	ϸ�ڣ� ������Χ��ͬ
		ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ��������ã�
		�ֲ�������ֻ���ڱ����ж�Ӧ�ķ�����ʹ��
 */
class T {
	//ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ���������)
	public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);//jack��ͨ���������)������Person�е�ȫ�ֱ���name
	}

	public void test2(Person p) {
		System.out.println(p.name);//jack
	}
}

class Person {
	//ϸ�ڣ����Կ��Լ����η�(public protected private..)
	//      �ֲ��������ܼ����η�
	public int age = 20;//���Ե�
	String name = "jack";

	public void say() {
		//ϸ��1�� ���Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "King";
		//protected int age = 60;//���� �ֲ��������ܼ����η�
		System.out.println("say() name= " + name);//���ʵ���King,����jack
	}

	public void hi() {
		//ϸ��2�� ��ͬһ���������У�����ͬһ����Ա�����У������ֲ���������������
		String address = "����";
		//String address = "�Ϻ�";//������ͬһ�������ڣ���������

	}
}