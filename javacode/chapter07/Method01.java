//     ��Ա������������
// ��ĳЩ����£�����Ҫ��Ҫ�����Ա����(��Ʒ���)��
// ��������:������һЩ������( ���䣬����..),
// �������໹��һЩ��Ϊ����:����˵�����ܲ�..,ͨ��ѧϰ��
// �������������⡣��ʱ��Ҫ�ó�Ա����������ɡ�
		/*
		1) ��� speak ��Ա����,��� ������һ�����ˡ� 
		2) ��� cal01 ��Ա����,���Լ���� 1+..+1000 �Ľ��
		3) ��� cal02 ��Ա����,�÷������Խ���һ���� n������� 1+..+n �Ľ��
		4) ��� getSum ��Ա����,���Լ����������ĺ�
		*/
import java.util.Scanner;
public class Method01 {
	//��дһ��main����
	public static void main(String[] args) {
		//����ʹ��
		//1.����д�ú������ȥ���ã��������
		//2.�ȴ���һ������Ȼ����÷�������
		Person p1 = new Person();//��������
		p1.speak();//���÷���
		p1.cal01();//����cal01����
		p1.cal02(5);//����cal02����,ͬʱ�� n = 5
		p1.cal02(100);//����cal02����,ͬʱ�� n = 100
		//���� getSum ������ͬʱ num1=10, num2=20
		//�� ���� getSum ���ص�ֵ������ ���� returnRes
		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum �������ص�ֵ=" + returnRes);
	}
}
class Person {

	String name;
	int age;
	//��������Ա������
	//���speak ��Ա���������������һ�����ˡ�
	/*
	�Ϻ����
		1.public�� ��ʾ�����ǹ�����
		2.void�� ��ʾ����û�з���ֵ
		3.speak():  speak�Ƿ�������() ���β��б�
		4.{} �����壬����д����Ҫִ�еĴ���
		5.System.out.println("����һ������");��ʾ���ǵķ����������һ�仰����
	      ����һ������
	 */
	public void speak() {
		System.out.println("����һ������");
	}

	//��� cal01 ��Ա����,���Լ���� 1+..+1000 �Ľ��
	public void cal01() {
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("sum= "  + sum);
	}

	//��� cal02 ��Ա����,�÷������Խ���һ���� n������� 1+..+n �Ľ��
	// 1.��ͳ����
	// public void cal02() {
	// 		int sum02 = 0;
	// 		Scanner myScanner = new Scanner(System.in);
	// 		System.out.println("������ n");
	// 		int inputNum = myScanner.nextInt();
	// 		for(int i = 1; i <= inputNum; i++) {
	// 			sum02 += i;
	// 		}
	// 		System.out.println("sum02= "  + sum02);
	// }
	 
	//�����
	// 1. (int n) �β��б� ��ʾ��ǰ��һ���β� n �����Խ����û�����
	public void cal02(int n) {
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("������= " + res);
	}



	//��� getSum ��Ա����,���Լ����������ĺ�
	//�Ϻ����
	//1. public ��ʾ�����ǹ�����
	//2. int :��ʾ����ִ�к󣬷���һ�� int ֵ
	//3. getSum ������
	//4. (int num1, int num2) �β��б�2 ���βΣ����Խ����û������������
	//5. return res; ��ʾ�� res ��ֵ ����
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}
