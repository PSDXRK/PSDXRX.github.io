//while练习
import java.util.Scanner;
public class WhileExercise {
	public static void main(String[] args) {
		//题目1:打印 1~100 之间所有能被3整数的数，统计个数 及 总和.
		//化繁为简
		//（1）输出1-100
		// int i =1;
		// while(i <= 100) {
		// 	System.out.println("i=" + i);
		// 	i++;
		// }
		//（2）在输出的过程中，进行过滤，只输出 9 的倍数 i % 9 ==0
		// int i =1;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//不能放在if里面，不然无法进行自增，导致无法输出
		// 	}
		// 	i++;
		// }
		//（3）统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
		// int i =1;
		// int count = 0;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//不能放在if里面，不然无法进行自增，导致无法输出
		// 	}
		// 	i++;
		// 	count++;
		// }
		//(4) 总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
		// int i =1;
		// int count = 0;
		// int sum = 0;
		// while(i <= 100) {
		// 	if(i % 3 == 0) {
		// 		System.out.println("i=" + i);
		// 		//i++;//不能放在if里面，不然无法进行自增，导致无法输出
		// 		count++;
		// 		sum += i;
		// 	}
		// 	i++;

		// }
		// System.out.println("个数为：" + count);
		// System.out.println("总和为：" + sum);
		//先死后活
		//(1) 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
		//(2) 还可以更进一步 3 倍数也做成变量 int
		//(3) 还可以变成可以改变的输入。引入scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入起始值：");
		int start = myScanner.nextInt();
		System.out.println("请输入结束值：");
		int end = myScanner.nextInt();
		System.out.println("请输入倍数：");
		int multiple = myScanner.nextInt();
		int i =start;
		int count = 0;
		int sum = 0;
		while(i <= end) {
			if(i % multiple == 0) {
				System.out.println("i=" + i);
				//i++;//不能放在if里面，不然无法进行自增，导致无法输出
				count++;
				sum += i;
			}
			i++;

		}
		System.out.println("=================");
		System.out.println("个数为：" + count);
		System.out.println("总和为：" + sum);
		System.out.println("=================");
	}
}