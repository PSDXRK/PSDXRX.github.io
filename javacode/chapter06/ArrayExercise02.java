//������ϰ
public class ArrayExercise02 {
	//����һ��main����
	public static void main(String[] args) {
		//�����һ������int[]�����ֵ {4��-1��9��10��23}�����õ���Ӧ���±�
		//˼·����
		//1.����һ�� int ����
		//2.�ٶ� max = arr1[0] �������,maxIndex=0;
		//3.���±� 1 ��ʼ����arr1 �����max < ��ǰԪ�أ�˵��max����������
		//  ���ֵ�����Ǿ� max = ��ǰԪ�أ�maxIndex = ��ǰԪ���±�
		//4.�����Ǳ����������arr1��max�������������ֵ��maxIndex���ֵ
		int[] arr1 = {4, -1, 9, 10, 23};
		int max = arr1[0];//�ٶ���һ��Ԫ�ؾ������ֵ
		int maxIndex = 0;//
		for(int i = 1; i < arr1.length; i++)  {//���±�1��ʼ����arr1
			if(max < arr1[i]) {//���max < ��ǰԪ��
				max = arr1[i];//��max ���ó� ��ǰԪ��
				maxIndex = i;
			}
		}
		//�����Ǳ����������arr1��max�������������ֵ��maxIndex���ֵ
		System.out.println("max=" + max + "  maxIndex=" + maxIndex);
	}
}