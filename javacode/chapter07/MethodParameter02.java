//��Ա�������λ���
//2. �����������͵Ĵ��λ���
//��Ҫ���ۣ��������ʹ��ݵ��ǵ�ַ������Ҳ��ֵ������ֵ�ǵ�ַ��������ͨ���β�Ӱ��ʵ��
public class MethodParameter02 {
	//��дmain����
	public static void main(String[] args) {
		//����
		B b = new B();
		int[] arr  = {1, 2, 3};
		b.test100(arr);//���÷���
		System.out.println("main������arr����");
		//��������
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}//200 2 3
		System.out.println();

		//����
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		//�����⣬���test200 ִ�е��� p = null ,����Ľ���� 10
		//�����⣬���test200 ִ�е��� p = new Person();....,����������� 10
		System.out.println("main ��p.age=" + p.age);//10000
	}
}
class Person {
	String name;
	int age;
}
class B {
	//B ���б�дһ������ test100�����Խ���һ�����飬�ڷ������޸ĸ����飬
	//����ԭ���������Ƿ�仯��  ��仯
	public void test100(int[] arr) {
		arr[0] = 200;//�޸�
		//��������
		System.out.println("test100������arr����");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}//200 2 3
		System.out.println();	
	}

	//B ���б�дһ������ test200�����Խ���һ�� Person(age,sal)����
	//�ڷ������޸ĸö������ԣ�����ԭ���Ķ����Ƿ�仯��  ��仯
	public void test200(Person p) {
		// p.age = 10000;//�޸Ķ�������
		// ˼��1
		//p = null;
		//System.out.println("test200 ��p.age=" + p.age);//������Ϊp�ÿ�,��û����Ӧ�ĵ�ַ�ռ�
		//��main�����е�p����ָ���Ӧ�ĵ�ַ�ռ䣬����Ӱ��
		
		//˼��2
		p = new Person();//������һ���¶���ָ�����µĵ�ַ�ռ�
		p.name = "tom";
		p.age = 99;
	}
}