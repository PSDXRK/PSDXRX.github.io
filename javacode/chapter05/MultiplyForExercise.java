//����ѭ�����Ƶ���ϰ
import java.util.Scanner;
public class MultiplyForExercise {
	public static void main(String[] args) {
		//ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ��
		//����������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
		//ͳ�������༰��������ÿ������ 5 ��ͬѧ��
		//˼·����:
		//����Ϊ��
		//(1) �ȼ���һ���� , 5 ��ѧ���ĳɼ���ƽ���� , ʹ�� for
		//1.1 ���� Scanner ����Ȼ�󣬽����û�����
		//1.2 �õ��ð༶��ƽ���� , ����һ�� doubel sum
		// Scanner myScanner = new Scanner(System.in);
		// double sum = 0;
		// for(int i = 1; i <= 5; i++) {
		// 	System.out.println("�������һ����ĵ�" + i + "��ѧ���ĳɼ�");
		// 	double score = myScanner.nextDouble();
		// 	sum += score;
		// 	System.out.println("�ɼ�Ϊ��" + score);
		// }
		// System.out.println("�ð���ܷ�Ϊ" + sum + "ƽ����Ϊ" + (sum/5));
		//(2) ͳ�� 3 ����(ÿ���� 5 ��ѧ��) ƽ����
		//(3) ���а༶��ƽ����
		//3.1 ����һ��������double totalScore �ۻ�����ѧ���ĳɼ�
		//3.2 ������ѭ��������totalScore / (3*5)
		// Scanner myScanner = new Scanner(System.in);
		// double totalScore = 0;
		// for(int j = 1; j <= 3; j++) {//j��ʾ�༶
		// 	double sum = 0;//һ���༶���ܷ�
		// 	for(int i = 1; i <= 5; i++) {//i��ʾѧ��
		// 		System.out.println("�������" + j + "��ĵ�" + i + "��ѧ���ĳɼ�");
		// 		double score = myScanner.nextDouble();
		// 		sum += score;
		// 		System.out.println("�ɼ�Ϊ��" + score);
		// 	}
		// 	System.out.println(j + "����ܷ�Ϊ" + sum + "ƽ����Ϊ" + (sum/5));
		// 	totalScore += sum;
		// }
		// System.out.println("��������ܷ�Ϊ" + totalScore + "ƽ����Ϊ" + (totalScore/15));
		//(4) ͳ�������༰������
		//4.1 ������� int passNum = 0; ����һ��ѧ���ɼ�>=60, passNum++
		//4.2 ��� >= 60 passNum+
		// Scanner myScanner = new Scanner(System.in);
		// double totalScore = 0;
		// int passNum = 0;
		// for(int j = 1; j <= 3; j++) {//j��ʾ�༶
		// 	double sum = 0;//һ���༶���ܷ�
		// 	for(int i = 1; i <= 5; i++) {//i��ʾѧ��
		// 		System.out.println("�������" + j + "��ĵ�" + i + "��ѧ���ĳɼ�");
		// 		double score = myScanner.nextDouble();
		// 		if(score >= 60){
		// 			passNum++;
		// 		}
		// 		sum += score;
		// 		System.out.println("�ɼ�Ϊ��" + score);
		// 	}
		// 	System.out.println(j + "����ܷ�Ϊ" + sum + "ƽ����Ϊ" + (sum/5));
		// 	totalScore += sum;
		// }
		// System.out.println("��������ܷ�Ϊ" + totalScore + "ƽ����Ϊ" + (totalScore/15));
		// System.out.println("�����༰������Ϊ" + passNum);
		//(5) �����Ż�[Ч�ʣ��ɶ���, �ṹ
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		System.out.println("������༶��");
		int classNum = myScanner.nextInt();
		System.out.println("������ÿ����ѧ������");
		int stuNum = myScanner.nextInt();
		int passNum = 0;
		for(int j = 1; j <= classNum; j++) {//j��ʾ�༶
			double sum = 0;//һ���༶���ܷ�
			for(int i = 1; i <= stuNum; i++) {//i��ʾѧ��
				System.out.println("�������" + j + "��ĵ�" + i + "��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				if(score >= 60){
					passNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ��" + score);
			}
			System.out.println(j + "����ܷ�Ϊ" + sum + "ƽ����Ϊ" + (sum/stuNum));
			totalScore += sum;
		}
		System.out.println(classNum + "������ܷ�Ϊ" + totalScore + "ƽ����Ϊ" + totalScore/(classNum*stuNum));
		System.out.println(classNum + "���༰������Ϊ" + passNum);

		for(int k = 1; k<=9; k++){
			for(int a = 1; a <= k; a++){
				System.out.println(a + "*" + k + "=" + (k*a) + "\t");
			}
		}
	}
}