/*
	��Ŀ��
		����һ��Java����Ĵ���������ʾ����������к��������ǣ�
 */
public class HomeWork08 {//������
	int count = 9; //����
	public void count1() { //HomeWork08��ĳ�Ա����
		count = 10;//���count�������� �ĳ�10
		System.out.println("count1= " + count);//10
	}
	public void count2() { //HomeWork08��ĳ�Ա����
		System.out.println("count1= " + count++);//�����9 �������� 10
	}
	//����HomeWork08���main�������κ�һ���඼���� main
	public static void main(String args[]) {
		//��ʦ���
		//1. new HomeWork08() ����������(û�����ֵĶ���
		//    �ڶ��û�б�ջ���ã�ʹ�ú󣬾ͱ����٣�ֻ����һ��)
		//2. new HomeWork08().count1();�����ö���󣬾͵���coount1()
		new HomeWork08().count1();//10
		HomeWork08 t1 = new HomeWork08();
		t1.count2();//9  �����9 �������� 10����ʱhomework08�������count�Ѿ����10
		t1.count2();//10 �����10 �������� 11����ʱhomework08�������count�Ѿ����10
	}
}