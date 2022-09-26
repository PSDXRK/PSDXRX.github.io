//do while练习
import java.util.Scanner;
public class DoWhileExercise02 {
	public static void main(String[] args) {
		//题目2：如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为
		//[System.out.println("老韩问：还钱吗？y/n")] do...while .. //
		//化繁为简
		//(1) 不停的问还钱吗?
		////(2) 使用 char answer 接收回答, 定义一个 Scanner 对象
		// Scanner myScanner = new Scanner(System.in);
		// char answer = ' ';
		// do {
		// 	System.out.println("凡哥使出闪电五连鞭~");
		// 	System.out.println("凡哥问还钱吗？：y/n");
		// 	answer = myScanner.next().charAt(0);
		// 	System.out.println("传哥的回答是" + answer);

		// }while(true);
		//(3) 在 do-while 的 while 判断如果是 y 就不再循环
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("凡哥使出闪电五连鞭~");
			System.out.println("接着问吴泽传还钱吗？：y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("======================" );
			System.out.println("吴泽传被打后回答：" + answer);
			System.out.println("======================" );

		}while(answer != 'y');
		System.out.println("======================" );
		System.out.println("吴泽传说：“别打了~我还钱！”");
		System.out.println("======================" );
		
	}
}