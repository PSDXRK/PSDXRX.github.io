import java.util.Scanner;
public class RecursionExercise01 {
	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入n");
		int n = myScanneer.nextInt();
		int res = t1.fibonacci(n);
		if(n >= 1) {
			System.out.println("当 n = " + n + "时，对应的斐波那契数=" + res);
		} 
	}
}
class T {
	/*
	   请使用递归的方式求出斐波那契数1，1，2，3，5，8，13...
		给你一个整数n，求出它的值是多少？
	思路分析
	1. 当 n = 1 斐波那契数 是 1
	2. 当 n = 2 斐波那契数 是 1
	3. 当 n >= 3 斐波那契数 是前两个数的和
	4. 这就是个递归的思路
	
	 */
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("输入的值应该大于1，您输入有误");
			return -1;
		}
	}
}