/**
 * 演示算术运算符的使用
 */
public class ArithmeticOperator {
	//编写一个main方法
	public static void main(String[] args) {
		// /(除法)的使用
		System.out.println(10 / 4); //从数学来看是2.5，
									//但java中认为 10 4 都是整数，所以结果取整 2
		// 注释快捷键 ctrl+/ 再次输入则取消
		double d = 10 / 4;//java中10/4取整为2，然后类型转变为double,变成2.0
		System.out.println(d);//2.0
		System.out.println(10.0 / 4);//2.5
		double d2 = 10.0 / 4;
		System.out.println(d2);//2.5

		// % 取模(取余)
		// java中 % 的本质 公式： a % b = a - a / b * b
		// 当 a 是 小数时 公式： a % b = a - (int)a / b * b
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);// -1
		System.out.println(10 % -3);// 1
		System.out.println(-10 % -3);// -1
		System.out.println(-10.5 % 3);// -1.5  -10.5 - -10/3*3= -10.5+9 = -1.5

		// ++ 符号的使用
		/*
		单独使用时，i++ 和 ++i 是一样的
		 */
		int i = 10;
		i++;//自增 等价于 i = i + 1; => i =11
		++i;//自增 等价于 i = i + 1; => i =12
		System.out.println("i=" + i);//12

		/*
		作为表达式使用
		前++： ++i 先自增再赋值
		后++： i++ 先赋值再自增
		 */
		int j = 8;
		int k = ++j;//等价 先 j=j+1 再 k=j
		System.out.println("k=" + k + "j=" + j);//9 9

		int f = 8;
		int g = f++;//等价 先 g=f 再 f=f+1
		System.out.println("g=" + g + "f=" + f);//8 9


		
	}
}
