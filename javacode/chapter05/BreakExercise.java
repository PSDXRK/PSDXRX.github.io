//������ϰ1
public class BreakExercise {
	//����һ��main����
	public static void main(String[] args) {
		//1-100 ���ڵ�����ͣ���� ���� ��һ�δ��� 20 �ĵ�ǰ��
		/*
		˼·����
		1.ѭ�� 1-100 ����� sum
		2.�� sum > 20ʱ����¼�µ�ǰ����Ȼ��break
		 */
		int sum = 0;
		int n = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 20) {
				System.out.println("��>20ʱ����ǰ�� i=" + i);
				n = i;
				break;
			}
		}
		System.out.println("��>20ʱ����ǰ��Ϊ" + n);
	}
}