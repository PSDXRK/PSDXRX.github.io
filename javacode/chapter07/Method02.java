public class Method02 {
	//��дһ��main����
	public static void main(String[] args) {
		//�����һ������ , �������ĸ���Ԫ��ֵ
		// int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		// ���˼· 1����ͳ�ķ���������ʹ�õ��� for ѭ���������������
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		//���˼· 2: ����һ���� MyTools ,Ȼ��дһ����Ա���������÷���ʵ��,
		//           ����˴���ĸ����ԣ�
		//           ���Խ�ʵ�ֵĴ���ϸ�ڷ�װ������Ȼ�������û����ü��ɡ�
		MyTools tool = new MyTools();
		tool.printArr(map);	
		tool.printArr(map);	
		tool.printArr(map);	
	}
}

//������Ĺ��ܣ�д��һ����ķ����У�Ȼ����ø÷�������
class MyTools {
	//����������һ����ά����
	public void printArr(int[][] map) {
		System.out.println("==========");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}
}