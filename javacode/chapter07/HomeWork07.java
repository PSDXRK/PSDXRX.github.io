public class HomeWork07 {
	//��дһ��mian����
	public static void main(String[] args) {
		Dog dog = new Dog("TOM",'��', 2);
		dog.show();
	}
}
/*
	��Ŀ��
		���һ��Dog�࣬�����֣���ɫ���������ԣ������������show()��ʾ����Ϣ
		���������󣬽��в���
 */
class Dog {
	String name;
	char color;
	int age;
	public Dog(String name, char color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void show() {
		System.out.println("���֣� " + name);
		System.out.println("��ɫ�� " + color);
		System.out.println("���䣺 " + age);
	}
}