import java.util.Scanner;
public class Object01 {
	//����һ��main����
	public static void main(String[] args) {
		/*
			����̫������ֻèè:һֻ���ֽ�С��,���� 3 ��,��ɫ��
			����һֻ��С��,���� 100 ��,��ɫ�����дһ������
			���û�����Сè������ʱ������ʾ��è�����֣����䣬��ɫ��
			����û������Сè����������ʾ ����̫û����ֻèè
		 */
		
		// // ˼·����(�Լ��ķ���)����ͳ������
		// // 1.����Scanner����
		// // 2.����string����洢è����Ϣ
		// // 3.���ж������в���
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("������Сè�����֣�");
		// String catName = myScanner.next();
		// String[] arr1 = {"С��", "3��", "��ɫ"}; 
		// String[] arr2 = {"С��", "100��", "��ɫ"};
		// if(catName.equals(arr1[0])) {
		// 	for(int i = 0; i < arr1.length; i++) {
		// 		System.out.print(arr1[i] + "\t");
		// 	}
		// } else if(catName.equals(arr2[0])) {
		// 	for(int i = 0; i < arr2.length; i++) {
		// 		System.out.print(arr2[i] + "\t");
		// 	}
		// } else {
		// 	System.out.println("����̫û����ֻèè��");
		// }
		// //���� =>(1)�����������ֲ�����
		// //       (2)ֻ��ͨ��[�±�]��ȡ��Ϣ����ɱ������ֺ����ݵĶ�Ӧ��ϵ����ȷ
		// //       (3)��������è����Ϊ
		

		//ʹ��OPP���������
		//ʵ����һֻè������һֻè��
		//�Ϻ����
		//1. new Cat() ����һֻè
		//2. Cat cat1 = new Cat(); �Ѵ�����è���� cat1
		//3. cat1 ����һ������
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 20;

		//�����˵ڶ�ֻè������ֵ��cat2
		//cat2Ҳ��һ������
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";
		cat2.weight = 30;

		//��ô���ʶ����������
		// System.out.println("��һֻè����Ϣ" + cat1.name 
		// 	+ " " + cat1.age + " " + cat1.color + " " + cat1.weight);

		// System.out.println("�ڶ�ֻè����Ϣ" + cat2.name 
		// 	+ " " + cat2.age + " " + cat2.color + " " + cat2.weight);
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Сè�����֣�");
		String catName = myScanner.next();
		if(catName.equals(cat1.name)) {
			System.out.println("��һֻè����Ϣ:\n" + "����:" + cat1.name 
			+ "\t����:" + cat1.age + "��\t��ɫ:" + cat1.color 
			+ "\t����:" + cat1.weight + "��");
		} else if(catName.equals(cat2.name)) {
			System.out.println("�ڶ�ֻè����Ϣ:\n" + "����:" + cat2.name 
			+ "\t����:" + cat2.age + "��\t��ɫ:" + cat2.color 
			+ "\t����:" + cat2.weight + "��");
		} else {
			System.out.println("����̫û����ֻèè��");
		}
	}
}
		

//��������������
//ʹ���������ķ�ʽ�������è����
//
//����һ��è�� Cat -> �������ݵ�����
class Cat {
	//���ԣ���Ա������
	//���Կ����ǻ����������ͣ�Ҳ�������������ͣ������ַ��������飩
	String name; //����
	int age; //����
	String color; //��ɫ
	double weight; //����
}