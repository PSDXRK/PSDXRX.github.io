//三元运算符细节

public class TernaryOperatorDetail {
	public static void main(String[] args) {
		//表达式1和表达式2要为可以赋给接收变量的类型（或可以自动转换）
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;//都是int型，正确
		//int c = a > b ? 1.1 : 1.2;// 1.1 1.2 都是double型，错误
		double d = a > b ? a : b;// 正确 表达式1和表达式2可以自动转换

		//等价于 if--else语句
		/*
			if(a > b) {
				c = a;
			}else 
			c = b;
		
		 */

	}
}