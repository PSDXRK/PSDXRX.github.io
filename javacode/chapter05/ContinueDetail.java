//ϸ����ʾ
public class ContinueDetail {
	//����һ��main����
	public static void main(String[] args) {
		lable1:
		for(int i = 0; i < 4; i++) {//���� i j ֻ�ڵ�ǰѭ���򱻶��壬��ѭ��������ٴζ���
			lable2:
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					continue;//��������ѭ��������ִ�� lable2 ��ѭ��
					//continue lable1;//�ȼ���break;
				}
				System.out.println("j=" + j);
			}
		}
		//���0-9������2���Ĵ�
		lable3:
		for(int i = 0; i < 4; i++) {
			lable4:
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					break;//�������� lable4 ѭ����֮��ִ�� lable3 ��ѭ��
				}
				System.out.println("j=" + j);
			}
		}
		//���01�Ĵ�
	}
}