//��ʾ��ֵ�������ʹ��
public class AssignOperator {
	//��дһ��main����
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4;//�ȼ��� n1 = n1 + 4;
		System.out.println("n1=" + n1);//14
		n1 /= 3;//�ȼ��� n1 = n1 / 3 -->4
		System.out.println("n1=" + n1);//4
		//����������
		
		//���ϸ�ֵ��������������ת��
		byte b = 3;
		b += 2;//�ȼ��� b = (byte)(b + 2);
		// b = b + 2//ֱ������д�Ǵ�ģ�
		// ��Ϊ2��int���ұ��Զ�ת��Ϊint�Ͳ��ܸ�ֵ��b(byte��)
		b++;//b = (byte)(b + 1);

	}
}
