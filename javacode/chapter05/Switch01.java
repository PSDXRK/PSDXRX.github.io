//Switch 快速入门
import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		/*
		案例： 
		请编写一个程序，该程序可以接收一个字符，比如a,b,c,d,e,f,g
		a表示星期一，b表示星期二……
		根据用户输入显示相应信息，要求使用 Switch 语句完成

		思路分析
		1.接收一个字符，创建scanner对象
		2.使用switch 来完成匹配，并输出对应信息
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入字符（a-g）:");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("今天星期一");
				break;
			case 'b' :
				System.out.println("今天星期二");
				break;
			case 'c' :
				System.out.println("今天星期三");
				break;
			case 'd' :
				System.out.println("今天星期四");
				break;
			case 'e' :
				System.out.println("今天星期五");
				break;
			case 'f' :
				System.out.println("今天星期六");
				break;
			case 'g' :
				System.out.println("今天星期天");
				break;
			default:
				System.out.println("您的输入有误，字符没有匹配项！");

		}

	}
}