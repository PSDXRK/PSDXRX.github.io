public class ArrayReverse {
	//定义一个main方法
	public static void main(String[] args) {
		// 要求：把数组的元素内容反转。 
		// arr {11,22,33,44,55,66} --> arr {66, 55,44,33,22,11}
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};

		//方法一 
		//通过找规律进行反转
		//思路分析
		//规律
		//1. 把 arry[0] 和 arr[5] 进行交换 {66，22，33，44，55，11}
		//2. 把 arry[1] 和 arr[4] 进行交换 {66，55，33，44，22，11}
		//3. 把 arry[2] 和 arr[3] 进行交换 {66，55，44，33，22，11}
		//4. 一共要交换 3 次 = arr.length / 2
		//5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 -i]
		//代码
		// int temp = 0;
		// for(int i = 0; i < arr.length / 2; i++) {
		// 	temp = arr[arr.length - 1 -i];
		// 	arr[arr.length - 1 -i] = arr[i];
		// 	arr[i] = temp;
		// }
		//优化
		int temp = 0;
		int len = arr.length;//数组的长度
		for(int i = 0; i < arr.length / 2; i++) {
			temp = arr[len - 1 -i];
			arr[len - 1 -i] = arr[i];
			arr[i] = temp;//建议自己用内存分析法分析下
		}
		System.out.println("====反转后的数组====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}