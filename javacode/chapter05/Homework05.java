//控制结构作业
/*
输出1-100之间不能被5整除的数，每五个一行
 */
import java.util.Scanner;
public class Homework05 {
	//定义一个main方法
	public static void main(String[] args) {
		int count = 0;//统计输出的个数
		for(int i = 1; i <= 100; i++) {
			if(i%5 != 0) {
				count++;
				System.out.print(i + "\t");
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}