public class YangHuiSanJiao {
	//��дһ�� main ����
	public static void main(String[] args) {
		/*
		ʹ�ö�ά�����ӡһ�� 10 ���������
					1
					1 1
					1 2 1
					1 3 3 1
					1 4 6 4 1
					1 5 10 10 5 1
		����
		1.��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
		2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
		3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ. arr[i][j]
		arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //�����ҵ��������
		*/
		int arr[][] = new int[10][];
		for(int i = 0; i < arr.length; i++) {//����arr��ÿ��Ԫ��
			//��ÿ��Ԫ�أ�һά���飩���ٿռ�
			arr[i] = new int[i + 1];
			//��ÿ��Ԫ�ظ�ֵ
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j || j == 0) {//ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
					arr[i][j] = 1;//
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//�м�Ԫ�ظ�ֵ
				}
			}
		}
		//�������
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}