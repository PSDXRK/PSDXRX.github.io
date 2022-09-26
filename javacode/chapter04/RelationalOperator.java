//演示关系运算符的使用
//关系运算符的结果都是boolean型，也就是只有 true 或者 false

public class RelationalOperator {
	//编写一个main方法
	public static void main(String[] args) {

		int a = 9;//开发中，不可以使用 a, b, n1, n2之类的变量名
		int b = 8;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		boolean flag = a > b;
		System.out.println("flag=" + flag);

	}
}