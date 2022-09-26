//if-else语句快速入门
//双分支
//基本语法：
//if(条件表达式) {
//	执行代码块 1;
//}
//else {
//	执行代码块 2;
//}
//说明：当条件成立时。即执行代码块1.否则执行代码块2.
//如果执行代码块只有一条语句，则{}可以省略，否则，不可省略
import java.util.Scanner;
public class If02 {
	public static void main(String[] args) {
		//要求：编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
		//则输出"你的年龄大于18岁，要对自己的行为负责，进入监狱"
		//否则，输出"你的年龄不大，放过你了"
		
		//思路分析
		//1.接收输入的年龄，应该定义一个Scanner对象
		//2.把年龄保存到一个变量 int = age
		//3.使用 if-else 判断，输出对应信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("你的年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			int outage = age - 18;
			System.out.println("你的年龄大于18岁" + outage +"年，要对自己的行为负责，进入监狱");
		}else {
			int leftage = 18 - age;
			System.out.println("你的年龄不大,距离18岁还有" + leftage +"年，放过你了");
		}
		System.out.println("程序继续....");

	}
}