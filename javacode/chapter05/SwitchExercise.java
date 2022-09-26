//switch 课后练习
import java.util.Scanner;
public class SwitchExercise {
	public static void main(String[] args) {
		//1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。
		//只转换 a, b, c, d, e. 其它的输出 "other"。
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char c = myScanner.next().charAt(0);
		switch(c) {
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default :
				System.out.println("other");
				break;
		}
		//2)对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
		//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
		//思路分析
		//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
		//2. 这里我们需要进行一个转换, 编程思路 :
		// 如果成绩在 [60,100] , (int)(成绩/60) = 1
		// 如果成绩在 [0,60) , (int)(成绩/60) = 0
		//代码实现
		System.out.println("请输入成绩（0-100）");
		int score = myScanner.nextInt();
		if(score >= 0 && score <= 100) {
			switch((int)(score/60)) {
				case 0 :
					System.out.println("不合格");
					break;
				case 1 :
					System.out.println("合格");
					break;
				default :
					System.out.println("输入有误");
					break;
			}
		}else{
			System.out.println("输入成绩有误");
		}
		//3)根据用于指定月份，
		//打印该月份所属的季节。
		//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
		//[课堂练习, 提示 使用穿透 ]
		//
		//思路分析
		//1. 创建 Scanner 对象， 接收用户输入
		//2. 使用 int month 接收
		//3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if(month >= 1 && month <=12) {
			switch(month) {
				case 1:
				case 2:
				case 3:
					System.out.println("春季");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("夏季");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("秋季");
					break;
				case 10:
				case 11:
				case 12:
					System.out.println("冬季");
					break;
				default :
					System.out.println("输入有误");
					break;
			}
		}else{
			System.out.println("输入月份有误");
		}
		
	}
}