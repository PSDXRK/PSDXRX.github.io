//For练习
import java.util.Scanner;
public class ForExercise02 {
	public static void main(String[] args) {
		//题目2：完成下面的表达式输出
		//0+5=5
		//1+4=5
		//2+3=5
		//3+2=5
		//4+1=5
		//5+0=5
		//化繁为简
		//(1)先输出 0-5
		// for (int i = 0; i <= 5; i++) {
		// 	System.out.println(i);
		// }
		//(2)后面的+是 5-i
		// for (int i = 0; i <= 5; i++) {
		// 	System.out.println(i + "+" + (5-i)+ "=5");
		// }
		//先死后活
		//（1）5 变成变量 
		//（2）还可以变成可以改变的输入。引入scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入任意数字");
		int num = myScanner.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(i + "+" + (num-i)+ "=" + num);
		}
	}
}