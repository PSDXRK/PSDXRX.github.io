//return ��������
//��return���ڷ���ʱ����ʾ��������������main����ʱ����ʾ�˳�����
public class Return {
	//����һ��main����
	public static void main(String[] args) {
		//break
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("�λԷ�ѧϰ" + i);
				break;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
		System.out.println("======================");
		//continue
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("�λԷ�ѧϰ" + i);
				continue;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
		System.out.println("======================");
		//return
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("�λԷ�ѧϰ" + i);
				return;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
	}
}