/*
1) ���ԵĶ����﷨ͬ������ʾ�����������η� �������� ������;
	������ʦ�򵥵Ľ��ܷ������η��� �������Եķ��ʷ�Χ
	�����ַ������η� public, proctected, Ĭ��, private ,�����һ���ϸ����
2) ���ԵĶ������Ϳ���Ϊ�������ͣ������������ͻ���������
3) �����������ֵ����Ĭ��ֵ�����������һ�¡�����˵: 
	int 0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000��
	boolean false��String null
*/
public class PropertiesDetail {
	//��дһ��main����
	public static void main(String[] args) {
		//����Person����
		//p1 �Ƕ��������������ã�
		//new Person() �����Ķ���ռ䣨���ݣ����������Ķ���
		Person p1 = new Person();

		//���������Ĭ��ֵ�������������
		//int 0��short 0, byte 0, long 0, float 0.0,double 0.0��
		//char \u0000��boolean false��String null
		
		System.out.println("\n��ǰ����˵���Ϣ");
		System.out.println("age=" + p1.age + " name=" + p1.name 
			+ " sal=" + p1.sal + " isPass=" + p1.isPass);
		//Ĭ����� 0 null 0.0 false
	}
}

class Person {
	//�ĸ�����
	int age;
	String name;
	double sal;
	boolean isPass;

}