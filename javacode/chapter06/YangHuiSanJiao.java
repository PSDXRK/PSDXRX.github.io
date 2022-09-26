public class YangHuiSanJiao {
	//编写一个 main 方法
	public static void main(String[] args) {
		/*
		使用二维数组打印一个 10 行杨辉三角
					1
					1 1
					1 2 1
					1 3 3 1
					1 4 6 4 1
					1 5 10 10 5 1
		规律
		1.第一行有 1 个元素, 第 n 行有 n 个元素
		2. 每一行的第一个元素和最后一个元素都是 1
		3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. arr[i][j]
		arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律
		*/
		int arr[][] = new int[10][];
		for(int i = 0; i < arr.length; i++) {//遍历arr的每个元素
			//给每个元素（一维数组）开辟空间
			arr[i] = new int[i + 1];
			//给每个元素赋值
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j || j == 0) {//每一行的第一个元素和最后一个元素都是 1
					arr[i][j] = 1;//
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//中间元素赋值
				}
			}
		}
		//输出数组
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}