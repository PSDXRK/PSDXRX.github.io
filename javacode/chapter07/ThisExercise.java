public class ThisExercise {
	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person("jack", 90);
		Person p2 = new Person("jack", 10);
		System.out.println("p1��p2�ԱȵĽ��Ϊ��" + p1.compareTo(p2));
	}
}
/*
	��Ŀ������ Person �࣬������ name��age ���ԣ����ṩ compareTo �ȽϷ�����
	�����ж��Ƿ����һ������ȣ��ṩ������ TestPerson
	���ڲ���, ���ֺ�������ȫһ�����ͷ��� true, ���򷵻� fal
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p) {
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		// ���������Լ�Ϊһ�д���
		return this.name.equals(p.name) && this.age == p.age;
	}
}