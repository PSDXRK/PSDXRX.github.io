//数组使用注意事项
public class ArrayDetail {
	//定义一个main 方法
	public static void main(String[] args) {
		//细节1：数组是多个相同类型数据的组合，实现对这些数据统一管理
		int[] arr1 = {1, 2, 3, 4, 5};//对的
		// int[] arr1 = {1, 2, 3, 4, 1.1};//错的 double -> int 
		// int[] arr1 = {1, 2, 3, 4, "hello"};//错的 string -> int 
		double[] arr2 = {1.1, 2.2, 3.2, 4.2, 100};//对的int->double可以
		//细节2：数组中的元素可以是任何数据类型，
		//      包括基本数据类型和引用类型但是不能混用
		String[] arr3 = {"北京","jack","milan"};
		//细节3：数组创建后，如果没有赋值，有默认值
		//      int 0, short 0, byte 0, long 0,
		//      float 0.0, double 0.0, char \u0000,
		//      boolean false, String null,
		//      
		short[] arr4 = new short[3];
		System.out.println("======数组arr4======");
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);//0 0 0
		}
		//细节4：数组下标必须在指定范围内使用，否则报：下标越界异常，比如
		//int[] arr = new int[5];则有效下标为0-4
		//即数组的下标/索引 最小 0 最大 数组长度-1(5-1=4)
		int[] arr = new int[5];
		//System.out.println(arr[5]);//错的最大为 5-1=4
		System.out.println(arr[4]);//对的，可以的
	}
}