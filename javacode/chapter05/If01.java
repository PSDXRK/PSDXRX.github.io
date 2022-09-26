//if语句快速入门
import java.util.Scanner;
public class If01 {
	public static void main(String[] args) {
		//要求：编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
		//则输出"你的年龄大于18岁，要对自己的行为负责，进入监狱"
		
		//思路分析
		//1.接收输入的年龄，应该定义一个Scanner对象
		//2.把年龄保存到一个变量 int = age
		//3.使用 if 判断，输出对应信息
		
		//应该定义一个Scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量
		int age = myScanner.nextInt();
		//使用if判断，输出对应信息
		if(age > 18) {
			System.out.println("你的年龄大于18岁，要对自己的行为负责，进入监狱");
		}
		System.out.println("程序继续....");
	}
}