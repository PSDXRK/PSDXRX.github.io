import java.util.Scanner;
public class RecursionExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("������n");
		int n = myScanneer.nextInt();
		int res = t1.fibonacci(n);
		if(n >= 1) {
			System.out.println("�� n = " + n + "ʱ����Ӧ��쳲�������=" + res);
		} 
	}
}
class T {
	/*
	   ��ʹ�õݹ�ķ�ʽ���쳲�������1��1��2��3��5��8��13...
		����һ������n���������ֵ�Ƕ��٣�
	˼·����
	1. �� n = 1 쳲������� �� 1
	2. �� n = 2 쳲������� �� 1
	3. �� n >= 3 쳲������� ��ǰ�������ĺ�
	4. ����Ǹ��ݹ��˼·
	
	 */
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("�����ֵӦ�ô���1������������");
			return -1;
		}
	}
}