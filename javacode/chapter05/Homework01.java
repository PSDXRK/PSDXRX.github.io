//���ƽṹ��ҵ
/*
1.ĳ����100000Ԫ��û����һ��·�ڣ���Ҫ�ɷѣ���������
1�����ֽ�>50000ʱ��ÿ�ν�5%
2�����ֽ�<=50000ʱ��ÿ�ν�1000
��̼�����˿��Ծ������ٴ�·��
 */
public class Homework01 {
	//����һ��main����
	public static void main(String[] args) {
		//����һ���Լ�д�ģ�
		double cash = 100000;
		int num = 0;
		while(cash > 50000) {
			cash = cash*0.95;
			num++;
		}
		while(cash <=50000){
			if(cash < 1000){
				break;
			}
			cash = cash - 1000;
			num++;
		}
		System.out.println("100000ԪǮ�ܹ�" + num + "��·��");
		System.out.println("�㻹ʣ" + cash + "ԪǮ");

		//������
		double money = 100000;
		int count = 0;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				count++;
			}else if(money >=1000) {
				money -= 1000;
				count++;
			}else {
				break;
			}
		}
		System.out.println("100000ԪǮ�ܹ�" + count + "��·��");
		System.out.println("�㻹ʣ" + money + "ԪǮ");
	}
}