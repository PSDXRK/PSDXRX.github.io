//��Ա������ϰ
/*
	��дһ������ copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ��󡣿�¡����
	ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
 */
public class MethodExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "jack";
		p.age = 18;
		p.sex = '��';
		//����Tools
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//���� p �� p2 ��Person����,���������������Ķ���������ͬ
		System.out.println("p ������ age=" + p.age + " ����=" 
			+ p.name + " �Ա�=" + p.sex);
		System.out.println("p2 ������ age=" + p2.age 
			+ " ����=" + p2.name + " �Ա�=" + p2.sex);
		//��ʾ������ͬ����ȽϿ����Ƿ���ͬһ������
		System.out.println(p == p2);//false

	}
}

class Person {
	String name;
	int age;
	char sex;
}

class MyTools {
	//��д������˼·
	//1. �����ķ��������� Person
	//2. ������������ copyPerson
	//3. �������β��ǣ�Person p��
	//4. �����壬����һ���¶��󣬲��������ԣ����ؼ���
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		p2.sex = p.sex;
		return p2;
	}
}