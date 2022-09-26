/*
	可变参数注意事项和使用细节
	    1. 可变参数的实参个数可以为0或任意多个。
	    2. 可变参数的实参可以为数组。
	    3. 可变参数的本质就是数组。
	    4. 可变参数可以和普通类型的参数一起放在形参了列表，但必须保证可变参数在后
	    5. 一个形参列表中只能出现一个可变参数
 */
public class VarParameterDetail {
	//编写一个main方法
	public static void main(String[] args) {
		//细节：可变参数的实参可以为数组
		T t1 = new T();
		int[] arr = {1, 2, 3};
		t1.f1(arr);
	}
}

class T {
	public void f1(int... nums) {
		System.out.println("长度= " + nums.length);
	}

	//细节:可变参数可以和普通类型的参数一起放在形参了列表，但必须保证可变参数在后
	// public void f2(double... nums, String str) {//错的 须保证可变参数在后

	// }
	public void f2(String str, double... nums) {//对的

	}
}