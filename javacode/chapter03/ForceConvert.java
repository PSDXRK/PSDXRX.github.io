public class ForceConvert {

	//��дһ��main����
	public static void main(String[] args) {

		//��ʾǿ������ת��
		//�Զ�����ת��������̣��������������ת��������С������
		//ʹ��ʱҪ����ǿ��ת������������������ɾ��Ƚ��ͻ������
		int n1 = (int)1.9;//�� 1.9 ǿ��ת���� int �ͣ���� 1
		System.out.println("n1=" + n1);//1,��ɾ�����ʧ

		int n2 = 2000;
		byte b1 = (byte)n2;//�� int �� n2 ǿ��ת���� byte ��
		System.out.println("b1=" + b1);//-48������������
	}
}