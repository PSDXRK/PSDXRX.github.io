import java.util.Scanner;
public class HomeWork02 {
	//��дһ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�Ԫ����");
		String findName = myScanner.next();
		String[] arry = {"��ë", "��ë", "��ë","����"};
		A02 a02 = new A02();
		int index = a02.find(arry,findName);
		System.out.println("���ҵ�������Ϊ�� " + index);

	}
}
//��Ŀ����д��A01,���巽��find��ʵ�ֲ���ĳ�ַ��������е�Ԫ�ز��ң�������������
//      ����Ҳ������� -1
class A02 {
	public int find(String[] arry, String name) {
		for(int i = 0; i < arry.length; i++) {
			if(name.equals(arry[i])) {
				return i;
			}
		}
		return -1;
	}
}