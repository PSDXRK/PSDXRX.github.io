//������ϰ2
import java.util.Scanner;
public class BreakExercise02 {
	//����һ��main����
	public static void main(String[] args) {
		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,
		//����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ��ʹ�� for+break
		//
		// ˼·����
		// 1. ���� Scanner ��������û�����
		// 2. ���� String name ; String password; �����û���������
		// 3. ���ѭ�� 3 ��[��¼ 3 ��]����� ������������ǰ�˳�
		// 4. ����һ����� int chance ��¼���м��ε�
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for(int i = 1; i <= 3; i++) {
			System.out.println("����������");
			name = myScanner.next();
			System.out.println("����������");
			password = myScanner.next();
			//�Ƚ������Ƿ���ȷ
			//�ַ��������ݱȽ�ʹ�÷��� equals
			if("�λԷ�".equals(name) && "368464".equals(password)) {
				System.out.println("��½�ɹ�");
				break;
			}else {
				chance--;
				System.out.println("���󣬻���" + chance + "�λ���");
			}
		}
	}
}