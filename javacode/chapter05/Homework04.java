//控制结构作业
/*
实现判断一个整数是否为水仙花数，水仙花数指的是一个3位数，
其各个位数立方的和等于其本身，例如 153 = 1*1*1 + 5*5*5 + 3*3*3
 */
import java.util.Scanner;
public class Homework04 {
	//定义一个main方法
	public static void main(String[] args) {
		//方法一（自己写的）
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入三位数的整数");
		int num  = myScanner.nextInt();
		int baiweiNum = num/100;
		int shiweiNum = (num%100)/10;
		int geweiNum = num%10;
		if(num == (baiweiNum*baiweiNum*baiweiNum 
			+ shiweiNum*shiweiNum*shiweiNum
			+ geweiNum*geweiNum*geweiNum)) {
			System.out.println("该数是水仙花数");
		}else{
			System.out.println("该数不是水仙花数");
		}

	}
}
