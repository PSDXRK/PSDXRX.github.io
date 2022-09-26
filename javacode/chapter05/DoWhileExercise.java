//do while练习
import java.util.Scanner;
public class DoWhileExercise {
	public static void main(String[] args) {
		//题目1:统计1--200之间能被5整除但不能被3整除的个数和总和
		//化繁为简
		//1.输出1-200
		// int i = 1;
		// do {
		// 	System.out.println("i=" + i);
		// 	i++;
		// }while(i <= 200);
		//2.输出能被5整除但不能被3整除的数
		// int i = 1;
		// do {
		// 	if(i % 5 == 0 && i % 3 != 0){
		// 		System.out.println("i=" + i);
		// 	}
		// 	i++;
		// }while(i <= 200);
		//3.统计个数 定义一个变量 int count = 0; 当 条件满足时 count++;
		//4.总和 , 定义一个变量 int sum = 0; 当条件满足时累积 sum += i;
		//(1) 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
		//(2) 还可以更进一步 5,3 倍数也做成变量 int
		//(3) 还可以变成可以改变的输入。引入scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入起始值：");
		int start = myScanner.nextInt();
		System.out.println("请输入结束值：");
		int end = myScanner.nextInt();
		System.out.println("请输入能除的倍数：");
		int multiple1 = myScanner.nextInt();
		System.out.println("请输入不能除的倍数：");
		int multiple2 = myScanner.nextInt();
		int i = start;
		int count = 0;
		int sum = 0;
		do {
			if(i % multiple1 == 0 && i % multiple2 != 0){
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
			i++;
		}while(i <= end);
		System.out.println("个数为：" + count);
		System.out.println("总和为：" + sum);
	}
}