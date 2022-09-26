//可变参数快速入门
/*
	java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。
就可以通过可变参数实现。
	基本语法
	访问修饰符 返回类型 方法名(数据类型... 形参名) {
	
	}

 */
public class VarParameter01 {
	//编写一个main方法
	public static void main(String[] args) {
		HhfMethod method = new HhfMethod();
		System.out.println("求和结果为：" + method.sum(1,2,3,4,5));
		System.out.println("求和结果为：" + method.sum(1,200));
	}
}

class HhfMethod {
	//方法 sum 【可以计算 2 个数的和，3 个数的和 ， 4. 5，....
	//可以用方法重载
	// public int sum(int n1, int n2) {//2个数的和
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {//3个数的和
	// 	return n1 + n2 + n3;
	// }
	// public int sum(int n1, int n2, int n3，int n4) {//4个数的和
	// 	return n1 + n2 + n3 + n4;
	// }
	//........
	//上面三个方法名称相同，功能相同，参数个数不同 --> 可变参数优化
	//1.int...表示接受的是可变参数，类型是int，即可以接受多个int(0-多)
	//2.使用可变参数时，可以当作数组来使用 即 nums 可以当作数组
	//3.遍历 nums 求和即可
	public int sum(int... nums) {
		System.out.println("接受的参数个数= " + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}