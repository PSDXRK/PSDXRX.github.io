public class HomeWork11 {
	//��дһ��mian����
	public static void main(String[] args) {

	}
}
/*
	��Ŀ��
		����һ��Employee��
		������(���֣��Ա����䣬ְλ��нˮ)���ṩ�������췽�������Գ�ʼ��
		(1) (���֣��Ա����䣬ְλ��нˮ)
		(2) (���֣��Ա�����) (3) (ְλ��нˮ),Ҫ���ָ��ù�����
 */
class Employee {
	String name;
	char sex;
	int age;
	String job;
	double salary;
	//��ΪҪ����Է��ù������������д�����ٵĹ�����
	//ְλ��нˮ
	public Employee(String job, double salary) {
		this.job = job;
		this.salary = salary;
	}
	//���֣��Ա�����
	public Employee(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//���֣��Ա����䣬ְλ��нˮ�����Ը��ã�
	public Employee(String name, char sex, int age, String job, double salary) {
		this(name, sex, age);//ʹ�õ� ǰ��� ������
		this.job = job;
		this.salary = salary;
	}
}