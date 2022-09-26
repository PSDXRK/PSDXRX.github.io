//控制结构作业
/*
实现判断一个整数，属于哪个范围，大于0；小于0；等于0
 */
import java.util.Scanner;
public class Homework02 {
	//定义一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入数字");
		int num = myScanner.nextInt();
		if(num > 0) {
			System.out.println("该数大于0");
		}else if(num == 0){
			System.out.println("该数等于0");
		}else{
			System.out.println("该数小于0");
		}
	}
}