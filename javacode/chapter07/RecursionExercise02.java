import java.util.Scanner;
public class RecursionExercise02 {
	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("������Ҫ�鿴������");
		int peachDay = myScanneer.nextInt();
		int res = t1.peach(peachDay);//���һ���������
		if(res != -1) {
			System.out.println("��" + peachDay + "���������Ϊ�� " + res);//1534
		} 
	}
}

class T {
	/*
		���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
		�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ���������� 10 ��ʱ��
		���ٳ�ʱ������û�ԣ�������ֻ�� 1 �������ˡ����⣺��������ٸ����ӣ�

		˼·���� ����
		1. day = 10 �� 1 ������
		2. day = 9  �У�day10 + 1)*2 = 4 
		3. day = 8  �У�day9  + 1)*2 = 10
		4. ���ɾ��� ǰһ������� = ����һ������� +1��*2//����
		5. �ݹ�
	*/
	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <=9) {
			return(peach(day +1) + 1)*2;//����
		} else {
			System.out.println("day�� 1-10֮�䣬������������");
			return -1;
		}
	}
}