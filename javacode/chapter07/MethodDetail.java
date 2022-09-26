public class MethodDetail {
	//编写一个main方法
	public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);//1，4是实参
		System.out.println("和 = " + res[0] + "  差 = " + res[1]);


		//细节：调用带参数的方法时，一定对应着参数列表传入相同类型或者兼容类型的参数
		byte b1 = 1;
		byte b2 = 2;
		//调用方法时（传入的）的参数就是实参（实际参数）
		a.getSumAndSub(b1, b2);//可以 byte -> int
		//a.getSumAndSub(1,1, 1.8);//错误: 不兼容的类型: 从double转换到int可能会有损失
		
		//细节： 实参和形参的类型要基本一致或兼容、个数、顺序必须一致
		//a.getSumAndSub(100);// x 个数不统一
		
		a.f4("tom", 10);// ok
		a.f4(10, "tom");// x  实参和形参顺序不对
	}
}


class AA {

	//细节： 方法不能嵌套定义
	// public void f5() {
	// 	public void f6() {}//不可以 方法不能嵌套定义
	// }
	
	public void f4(String str, int n) {

	}

	
	//1. 一个方法最多有一个返回值 [思考，如何返回多个结果 返回数组 ]
	public int[] getSumAndSub(int n1, int n2) {//int n1, int n2是形参
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
	//2. 返回值的类型可以为任意类型，包含基本数据类型或引用类型（数组，对象）、
	//   看 getSumAndSub
	
	//3. 如果方法要求返回值类型，则方法体中最后的执行语句必须为 return 值，
	//   而且要求返回值类型必须和return的值一致或兼容
	public double f1() {//方法名，最好用驼峰命名法，这里为了方便才用 f1之类
						//正确的方法应该是 getSumAndSub 这种
						//提示：在实际工作中，我们的方法都是为了完成某个功能，
						//所以方法名要有一定含义，最好是见名知意

		double d1 = 1.1 * 3;
		int n = 100;
		return n;//可以的 相当于 int -> double
	}
	// public int f2() {

	// 		double d1 = 1.1 * 3;
	// 		return d1;//错误: 不兼容的类型: 从double转换到int可能会有损失
	
	//4. 如果方法为 void ，则方法中可以没有return语句，或者 只写 return；
	public void f3() {
		System.out.println("HELLO");
		int n = 10;
		return;//可以
		//return n;//不可以 

	}
}

