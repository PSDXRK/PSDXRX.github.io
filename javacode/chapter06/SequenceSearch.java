//˳����ҿ�������
import java.util.Scanner;
public class SequenceSearch {
	//��дһ��main����
	public static void main(String[] args) {
		// ��һ�����У���üӥ������ëʨ����������������������
		// ������Ϸ��
		// �Ӽ�������������һ�����ƣ��ж��������Ƿ����������
		// Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�
		/*
		˼·����
		1. ����һ���ַ�������
		2. �����û����룬�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		 */
		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		String findName = myScanner.next();
		//�������飬��һ�Ƚϣ����������ʾ���˳�
		//�����и����˼��
		/*
		Ҫ��ʾû�ҵ�
		������if������� else {System.out.println("������˼��û�ҵ���")}
		��Ϊ�����ձȽϵ�һ�����ֲ�ͬ��ֱ����ʾû�ҵ�
		���Զ���һ������/��ʶ int index = -1 
		����ҵ����֣��� index �����仯
		û�ҵ�����ʾû�ҵ� ��һ��if ����ж� index �Ƿ�仯
		 */
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			//�Ƚ� �ַ����Ƚ��� equals
			if(findName.equals(names[i])) {
				System.out.println("��ϲ���ҵ� " + findName);
				System.out.println("�±�Ϊ " + i);
				//�� i ���浽 index
				index = i;
				break;//�ҵ����˳�
			}
		}
		//�ж�û�ҵ�����ʾ
		if(index == -1) {
			System.out.println("������˼��û�ҵ�" + findName);
		}
	}
}