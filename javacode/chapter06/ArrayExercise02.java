//数组练习
public class ArrayExercise02 {
	//定义一个main方法
	public static void main(String[] args) {
		//请求出一个数组int[]的最大值 {4，-1，9，10，23}，并得到对应的下标
		//思路分析
		//1.定义一个 int 数组
		//2.假定 max = arr1[0] 是最大制,maxIndex=0;
		//3.从下标 1 开始遍历arr1 ，如果max < 当前元素，说明max不是真正的
		//  最大值，我们就 max = 当前元素；maxIndex = 当前元素下标
		//4.当我们遍历这个数组arr1后，max就是真正的最大值，maxIndex最大值
		int[] arr1 = {4, -1, 9, 10, 23};
		int max = arr1[0];//假定第一个元素就是最大值
		int maxIndex = 0;//
		for(int i = 1; i < arr1.length; i++)  {//从下标1开始遍历arr1
			if(max < arr1[i]) {//如果max < 当前元素
				max = arr1[i];//把max 设置成 当前元素
				maxIndex = i;
			}
		}
		//当我们遍历这个数组arr1后，max就是真正的最大值，maxIndex最大值
		System.out.println("max=" + max + "  maxIndex=" + maxIndex);
	}
}