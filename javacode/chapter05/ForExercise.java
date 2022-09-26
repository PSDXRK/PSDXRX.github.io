//For练习
import java.util.Scanner;
public class ForExercise {
	public static void main(String[] args) {
		//题目1:打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.
		//老韩的两个编程思想(技巧)
		//1. 化繁为简 : 即将复杂的需求，拆解成简单的需求，逐步完成 编程 = 思想 --练习-> 代码
		//2. 先死后活 : 先考虑固定的值，然后转成可以灵活变化的
		//思路分析
		//打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和
		//化繁为简
		//(1) 完成 输出 1-100 的值
		// for(int i = 0 ; i <= 100; i++) {
		// 	System.out.println("i=" + i);
		// }
		//(2) 在输出的过程中，进行过滤，只输出 9 的倍数 i % 9 ==0
		// for(int i = 0 ; i <= 100; i++) {
		// 	if(i % 9 == 0) {
		// 		System.out.println("i=" + i);
		// 	}
		// }
		//(3) 统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
		// int count = 0;
		// for(int i = 0 ; i <= 100; i++) {
		// 	if(i % 9 == 0) {
		// 		System.out.println("i=" + i);
		// 		count++;
		// 	}
		// }
		//(4) 总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
		int count = 0;
		int sum = 0;
		for(int i = 1 ; i <= 100; i++) {
			if(i % 9 == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;//等价sum = sum + i
			}
		}
		System.out.println("个数为：" + count);
		System.out.println("总和为：" + sum);


		//先死后活
		//(1) 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
		//(2) 还可以更进一步 9 倍数也做成变量 int
		//(3) 还可以变成可以改变的输入。引入scanner对象
		int count2 = 0;
		int sum2 = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入起始值：");
		int start = myScanner.nextInt();
		System.out.println("请输入结束值：");
		int end = myScanner.nextInt();
		System.out.println("请输入倍数：");
		int multiple = myScanner.nextInt();
		for(int j = start ; j <= end; j++) {
			if(j % multiple == 0) {
				System.out.println("j=" + j);
				count2++;
				sum2 += j;//等价sum = sum + i
			}
		}
		System.out.println("个数为：" + count2);
		System.out.println("总和为：" + sum2);

	}
}