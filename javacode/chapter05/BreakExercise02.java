//课堂练习2
import java.util.Scanner;
public class BreakExercise02 {
	//定义一个main方法
	public static void main(String[] args) {
		//实现登录验证，有 3 次机会，如果用户名为"丁真" ,
		//密码"666"提示登录成功，否则提示还有几次机会，请使用 for+break
		//
		// 思路分析
		// 1. 创建 Scanner 对象接收用户输入
		// 2. 定义 String name ; String password; 保存用户名和密码
		// 3. 最多循环 3 次[登录 3 次]，如果 满足条件就提前退出
		// 4. 定义一般变量 int chance 记录还有几次登
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入姓名");
			name = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();
			//比较输入是否正确
			//字符串的内容比较使用方法 equals
			if("何辉凡".equals(name) && "368464".equals(password)) {
				System.out.println("登陆成功");
				break;
			}else {
				chance--;
				System.out.println("错误，还有" + chance + "次机会");
			}
		}
	}
}