//break���ϸ��
//1.break�������ڶ��Ƕ�׵�����г���ʱ������ͨ����ǩָ��Ҫ��ֹ������
//2.��ǩ�Ļ���ʹ��
//lable1:{.....
//lable2:	{ ......
//lable3:		{ ......
//				  break;
//				}
//			}
//		 }
//���
//break������ָ���Ƴ��Ĳ�
//lable1�Ǳ�ǩ�������ɳ���Աָ��
//break��ָ�����ĸ�lable���˳��ĸ�
//��ʵ�ʿ����У�������Ҫʹ�ñ�ǩ
//���û��ָ��breakĬ���˳������ѭ����
public class BreakDetail {
	public static void main(String[] args) {
		lable1:
		for(int j = 0; j < 4; j++) {
		lable2:
			for(int i = 0; i < 10; i++) {
				if(i==2) {
					//break;//�ȼ�break lable2
					break lable1;//�˳�lable1��ѭ��
				}
				System.out.println("i=" + i);
			}
		}
	}
}