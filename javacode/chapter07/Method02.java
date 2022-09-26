public class Method02 {
	//编写一个main方法
	public static void main(String[] args) {
		//请遍历一个数组 , 输出数组的各个元素值
		// int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		// 解决思路 1，传统的方法，就是使用单个 for 循环，将数组输出，
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		//解决思路 2: 定义一个类 MyTools ,然后写一个成员方法，调用方法实现,
		//           提高了代码的复用性，
		//           可以将实现的代码细节封装起来，然后供其他用户调用即可。
		MyTools tool = new MyTools();
		tool.printArr(map);	
		tool.printArr(map);	
		tool.printArr(map);	
	}
}

//把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools {
	//方法，接收一个二维数组
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