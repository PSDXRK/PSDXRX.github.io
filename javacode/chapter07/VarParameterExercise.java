public class VarParameterExercise {
	//��дһ��main����
	public static void main(String[] args) {
		HhfMethod method = new HhfMethod();
		System.out.println(method.showScore1("�λԷ�", 100, 100));
		System.out.println(method.showScore1("�λԷ�", 100, 100, 100));
		System.out.println(method.showScore1("�λԷ�", 100, 100, 100, 100, 100));
		System.out.println("========�ɱ�����Ż���=======");
		System.out.println(method.showScore("�λԷ�", 100,100,100,100));
		System.out.println(method.showScore("����", 100,100));
	}
}
//�������������ֱ�ʵ�ַ������������ſ��óɼ����ܷ֣����������������ſγɼ����ܷ֣���
//�������������ſγɼ����ܷ֣�����װ��һ���ɱ�����ķ���
//������HhfMethod �������� showScore
class HhfMethod {
	//���أ�
	//1. �������������ſ��óɼ����ܷ�)
	public String showScore1(String name, int n1, int n2) {
		int totalScore = n1 + n2;
		return name + " �ɼ��ܷ�Ϊ�� " + totalScore;
	}
	//2.�������������ſγɼ����ܷ֣�
	public String showScore1(String name, int n1, int n2, int n3) {
		int totalScore = n1 + n2 + n3;
		return name + " �ɼ��ܷ�Ϊ�� " + totalScore;
	}
	//3.�������������ſγɼ����ܷ֣�
	public String showScore1(String name, int n1, int n2, int n3, int n4, int n5) {
		int totalScore = n1 + n2 + n3 + n4 + n5;
		return name + " �ɼ��ܷ�Ϊ�� " + totalScore;
	}

	//���ÿɱ�������������������Ż�
	public String showScore(String name, double... nums) {
		double totalScore = 0;
		for(int i = 0; i < nums.length; i++) {
			totalScore += nums[i];
		}
		return name + " �� " + nums.length + " �ſε��ܳɼ�Ϊ�� " + totalScore;
	}
}