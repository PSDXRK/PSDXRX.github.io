//continue��������
//1) continue ������ڽ�������ѭ��������ִ����һ��ѭ����
//2) continue �������ڶ��Ƕ�׵�ѭ���������ʱ������ͨ����ǩָ��
//Ҫ����������һ��ѭ�� , �����ǰ��ı�ǩ��ʹ�õĹ���һ��
public class Continue {
	//����һ��main����
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.println("i=" + i);
		}
	}
}