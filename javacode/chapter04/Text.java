//��ϰ
public class Text {
	//��дһ��main����
	public static void main(String[] args) {
		//text1 �߼���
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6) {
			//x�ȸ�ֵΪ5��6���бȽϣ�������Ϊ6
			//y������Ϊ6���ٺ�6���бȽ�
			//����Ϊ��5==6 & 6==6����false & true => false
			x = 11;
		}
		System.out.println("x=" + x + " y=" + y);//6 6

		//text2 ��·��
		int a = 5;
		int b = 5;
		if(a++ == 6 && ++b == 6) {
			//x�ȸ�ֵΪ5��6���бȽϣ�������Ϊ6
			//��Ȼa++ == 6 -->false,��Ϊ�Ƕ�·�룬
			//����&&���治�ٽ����жϺ�ִ��
			a = 11;
		}
		System.out.println("a=" + a + " b=" + b);//6 5

		//text3 �߼���
		int q = 5;
		int w = 5;
		if(q++ == 5 | ++w == 5) {
			//q�ȸ�ֵΪ5��5���бȽϣ�������Ϊ6
			//w������Ϊ6���ٺ�5���бȽ�
			//������5==5 | 6==6����true | false -->true
			q = 11;

		}
		System.out.println("q=" + q + " w=" + w);//11 6

		//text4 ��·��
		int r = 5;
		int t = 5;
		if(r++ == 5 || ++t == 5) {
			//r�ȸ�ֵΪ5��5���бȽϣ�������Ϊ6
			//��Ȼr++ == 5 -->true,��Ϊ�Ƕ�·��
			//����||���治�ٽ����жϺ�ִ��
			r = 11;

		}
		System.out.println("r=" + r + " t=" + t);//11 5

		//text5 ������
		boolean c = true;
		boolean d = false;
		short z = 46;
		if((z++ == 46) && (d = true)) z++;
		if((c = false) || (++z == 49)) z++;
		System.out.println("z=" + z);//50



	}
}