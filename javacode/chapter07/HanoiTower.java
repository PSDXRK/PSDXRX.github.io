import java.util.Scanner;
public class HanoiTower {
	//��дһ��main����
	public static void main(String[] args) {

		Tower tower = new Tower();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("�����뺺ŵ������������");
		int panNum = myScanneer.nextInt();
		tower.move(panNum, 'A', 'B', 'C');
	}
}

class Tower {
	/*
		��ŵ������ŵ�����ֳƺ�������������Դ��ӡ��һ�����ϴ�˵��������ߡ�
		�����촴�������ʱ�������������ʯ���ӣ���һ�������ϴ������ϰ��մ�С˳��
		���� 64 ƬԲ�̡����������������Ű�Բ�̴����濪ʼ����С˳�����°ڷ�����һ
		�������ϡ����ҹ涨����СԲ���ϲ��ܷŴ�Բ�̣�����������֮��һ��ֻ���ƶ�һ��Բ�̡�
	 */
	
	//����
	//num ��ʾ���Ӹ��� a,b,c�ֱ��ʾ������
	public void move(int num, char a, char b, char c) {
		//���ֻ��һ���� num = 1
		if(num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//����ж���̣����Կ���������������������������̣�num-1)
			//(1)���ƶ����������̵� b ���� c
			move(num - 1, a, c, b);
			//(2)����������̣��ƶ��� c
			System.out.println(a + "->" + c);
			//(3)�ٰ� b���������̣��ƶ���c ���� a
			move(num - 1, b, a, c);
		}
	}
}