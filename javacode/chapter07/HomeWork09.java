public class HomeWork09 {
	//��дһ��mian����
	public static void main(String[] args) {
		Music music = new Music("�������ɴ�", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}
/*
	��Ŀ��
		����Music�࣬������������name������ʱ��times���ԣ����в���play���ܺͷ���
		����������Ϣ�Ĺ��ܷ���getInfo��
 */
class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//����play����
	public void play() {
		System.out.println("���� " + name + " ���ڲ�����..... ʱ��Ϊ " + times +" ��");
	}
	//���ر���������Ϣ�Ĺ��ܷ���getInfo��
	public String getInfo() {
		return "���� " + name + " ����ʱ��Ϊ " + times + " ��";
	}
}