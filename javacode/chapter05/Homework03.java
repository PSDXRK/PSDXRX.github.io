//控制结构作业
/*
实现判断一个年份是否为闰年，年份能被4整除,但不能被100整除的,便是闰年
 */
import java.util.Scanner;
public class Homework03 {
	//定义一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入年份");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("该年份是闰年");
		}else{
		System.out.println("该年份不是闰年");
		}
	}
}