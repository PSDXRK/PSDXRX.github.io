//演示三元运算符(?)
public class TernaryOperator {
	//编写一个main方法
	public static void main(String[] args) {
		//基本语法: 条件表达式 ？ 表达式1：表达式2；
		//运算规则
		//1.如果条件表达式为true,运算后的结果是表达式 1 ；
		//1.如果条件表达式为false,运算后的结果是表达式 2 ；
		//口诀：【一灯大师：一真大师】

		int a = 10;
		int b = 99;
		//解读
		//1. a > b 为 false
		//2. 返回 b--,先返回 b 的值，然后再 b-1
		//3.返回的结果result是 99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result + " b=" + b);//99 98

		//解读
		//1. a < b 为 true 
		//2. 返回 a++,先返回 a 的值，然后再 a++
		//3.返回的结果result是 10
		int result2 = a < b ? a++ : b--;
		System.out.println("result2=" + result2 + " a=" + a + " b=" + b);//10 11 98

	}
}