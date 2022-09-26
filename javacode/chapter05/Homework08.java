//控制结构作业
/*
求出1+(1+2)+(1+2+3)+....(1+2+3+...+100)的和
 */
import java.util.Scanner;
public class Homework08 {
	//定义一个main方法
	public static void main(String[] args) {
		/*
		求出1+(1+2)+(1+2+3)+....(1+2+3+...+100)的和
		思路分析
		1.一共有100项相加
		2.每一项的数字在逐渐增加
		3.很像一个双层循环
		4.使用sum累计即可
		 */
		int sum = 0;
		for(int i  = 1; i <= 100; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println("sum=" + sum);
	}
}