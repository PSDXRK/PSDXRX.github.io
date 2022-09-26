//嵌套分支课后练习
import java.util.Scanner;
public class NestedIfExercise {
	public static void main(String[] args) {
		//出票系统：根据淡旺季的月份和年龄，打印票价
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该游客年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入当前月份");
		int month = myScanner.nextInt();
		if (month > 4 && month < 10) {
			System.out.println("当前为旺季！");
			if(age >= 18 && age <= 60) {
				System.out.println("成人票价为：60元");
			} else if (age < 18) {
				System.out.println("儿童为半价：" + (60/2) +"元");
			} else if (age > 60) {
				System.out.println("老人价格为三分之一：" + (60/3) + "元");
			} else {
				System.out.println("输入年龄有误！");
			}
		} else {
			System.out.println("当前为淡季！");
			if(age >= 18 && age <= 60) {
				System.out.println("成人票价为：40元");
			}else {
				System.out.println("票价：20元");
			}
		} 
	}
}