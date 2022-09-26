//控制结构作业
/*
输出小写的a-z,以及大写的Z-A
考察 字符编码和for循环
 */
import java.util.Scanner;
public class Homework06 {
	//定义一个main方法
	public static void main(String[] args) {
		/*
		思路分析
		1.'b' = 'a' + 1   'c' = 'a' + 2 以此类推
		2.使用for搞定
		for(char c1 = 'a'; c1 <= 'z'; c1++){
			System.out.print(c1 + " ");
		}
		 也可用字符对应的编码代替
		for(char c1 = 97; c1 <= (97 + 25); c1++){
			System.out.print(c1 + " ");
		}
		3.输出大写的Z-A，同理
		for(char c2 = 'Z'; c2 >= 'A'; c2--){
			System.out.print(c2 + " ");
		}
		也可用字符对应的编码代替
		for(char c2 = 90; c1 <= (90 - 25); c1--){
			System.out.print(c1 + " ");
		}
		 */
		for(char c1 = 97; c1 <= (97 + 25); c1++){
			System.out.print(c1 + " ");
		}
		System.out.println();
		for(char c2 = 90; c2 >= (90 - 25); c2--){
			System.out.print(c2 + " ");
		}
	}
}