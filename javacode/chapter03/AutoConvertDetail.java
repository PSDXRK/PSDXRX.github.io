//�Զ�����ת��ϸ��
public class AutoConvertDetail {

	//��дһ��main����
	public static void main(String[] args) {
		//ϸ��1���ж������͵������ǻ������ʱ��
		//ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ٽ��м���
		int n1 = 10;
		//float d1 = n1 + 1.1;
		//������Ϊ ���л������ʱ��1.1 ��double���ͣ��������
		//���� n1 �Զ�ת��Ϊdouble���ͣ����Խ��Ϊdouble > float
		double d1 = n1 + 1.1;//�Ե�
		float d2 = n1 + 1.1f;//�Ե�
		System.out.println(n1);//10
		System.out.println(d1);//11.1
		System.out.println(d2);//11.1
		
		//ϸ��2�������ǰѾ��ȣ�����������������͸�ֵ�����ȣ�������С����������ʱ��
		//�ͻᱨ����֮������Զ�����ת��
		//int n2 = 1.1;//���� double -> int �޷��Զ�ʵ��
		
		
		//ϸ��3:��byte, short���� char ֮�䲻���໥�Զ�ת��
		//���������� byte ʱ��(1)���жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		byte b1 = 10;//�Եģ���-128~127��Χ��
		//int n2 = 1;n2��int
		//byte b2 = n2;//����ԭ������Ǳ�����ֵ���ж�����
		//char c1 = b1;//����ԭ��byte�����Զ�ת����char
		
		
		//ϸ��4��byte, short, char  �������߿��Լ��㣬�ڼ���ʱ����ת��Ϊint����
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//��ģ�b2 + s1 => int
		int n3 = b2 + s1;//�Ե�
		//byte b4 = b2 + b3;//��ģ�b2 + b3 =>int
		//ֻҪ�� byte short char ����ļ��㶼������ת��Ϊint���ͣ������ǵ������ǻ������
		

		//ϸ��5��Boolean ������ת��
		boolean pass = true;
		//int num20 = pass;//����boolean�����������Զ�ת��
		
		
		//ϸ��6:�Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ ������ ���������
		//��һ����
		byte b4 =1;
		short s3 = 100;
		int num30 = 1;
		double num40 = 1.1;
		//float num50 = b4 + s3 + num30 + num40;//���� double���ܸ�ֵ��float
		double num60 = b4 + s3 + num30 + num40;//�Ե�
		System.out.println(b4 + s3 + num30 + num40);//���103.1������Զ�����Ϊdouble����


	}
}