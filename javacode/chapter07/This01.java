// ʲô��this?
// java�������ÿ�����������this������ǰ����
// �򵥵�˵���ĸ�������ã�this�ʹ����ĸ�����
public class This01 {
	//��дһ��mian����
	public static void main(String[] args) {

		Dog dog1 = new Dog("��׳",9);
		System.out.println("dog1��hashcode=" + dog1.hashCode());
		//dog1������info����,��ôthis����ָ��dog1���������
		dog1.info();
		System.out.println("==============================================");
		Dog dog2 = new Dog("���",3);
		System.out.println("dog2��hashcode=" + dog2.hashCode());
		//dog2������info����,��ôthis����ָ��dog2���������
		dog2.info();
	}
}

class Dog {//��

	String name;
	int age;
	// public Dog(String dName, int dAge) {//������
	// 	name = dName;
	// 	age = dAge;
	// }
	//������ǹ��������βΣ���ֱ��д�����������͸�����
	//���ǳ�����һ�����⣬���ݱ�����������ԭ��
	//�������� name �Ǿֲ�����������������
	//�������� age �Ǿֲ�����������������
	//==> ����this�ؼ���
	public Dog(String name, int age) {//������
		//this.name ���ǵ�ǰ���������name
		//this.age ���ǵ�ǰ���������age
		this.name = name;
		this.age = age;
		System.out.println("���������this.hashcode=" + this.hashCode());
	}

	public void info() {//��Ա���������������Ϣ
		System.out.println("info()�������this.hashcode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}