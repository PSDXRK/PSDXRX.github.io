//��Ա������ϰ
import java.util.Scanner;
public class MethodExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		// 1. ��д��AA�·������ж�һ��������������ż��������Boolean
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ��� n");
		int putNum = myScanner.nextInt();
		AA panDuan = new AA();
		if(panDuan.panDuanJiOu(putNum)) {//T
			System.out.println("��ż��");
		}else{//F
			System.out.println("������");
		}
		
		//2.�����С��С��ַ���ӡ ��Ӧ�������������ַ���
		//���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
		System.out.println("����������");
		int a = myScanner.nextInt();
		System.out.println("����������");
		int b = myScanner.nextInt();
		System.out.println("�������ַ�");
		char c = myScanner.next().charAt(0);
		System.out.println("=================");
		panDuan.printChar(a,b,c);
	}
}

class AA {
	// 1. ��д��AA�·������ж�һ��������������ż��������Boolean
	//����˼·
	//1. �����ķ�������
	//2. ����������
	//3. �������β�
	//4. ������
	public boolean panDuanJiOu(int n) {
		//����һ���Լ���
		// boolean a;
		// if(n%2 == 0) {
		// 	a = true;
		// 	System.out.println(a);
		// }else {
		// 	a = false;
		// 	System.out.println(a);
		// }
		// return a;
		
		//���������Ż���
		// if(n % 2 != 0) {
		// 	return false;
		// } else {
		// 	return true;
		// }

		//�����������ţ�
		return n % 2 == 0 ? true : false;
	}

	//2.�����С��С��ַ���ӡ ��Ӧ�������������ַ���
	//���磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��
	/*
		####
		####
		####
		####
	*/
	//˼·
	//1. �����ķ������� void
	//2. ���������� printChar
	//3. �������β� (int row, int col, char c)
	//4. ������ , ѭ��
	public void printChar(int row, int col, char c) {
		for(int i = 0;  i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}