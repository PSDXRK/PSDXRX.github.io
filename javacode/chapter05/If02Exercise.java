//if-else练习
public class If02Exercise {
	public static void main(String[] args) {
		int x = 7;
		int y = 4;
		if(x > 5) {
			if(y > 5) {
				System.out.println(x + y);
			}else{
				System.out.println("何辉凡学习中……");
			}
		}else{
			System.out.println("x is" + x);
		}//输出：何辉凡学习中
		

		//编写程序，声明2个double型变量并赋值
		//判断第一个数大于10.0，且第二个数小于20.0，打印两个数的和
		//
		double d1 = 23.0;
		double d2 = 12.7;
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}


		//定义两个变量int，判断二者的和
		//是否能被3又能被5整除，打印提示信息
		//思路分析
		//1.定义两个变量num1 和 num2
		//2.定义一个变量sun = num1 + num2
		//3.sum%3,5后等于0，说明可以整除
		//4.使用if-else来提示对应信息
		int num1 = 20;
		int num2 = 55;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println(num1 + "与" + num2 + "的和可以被3和5整除");
		}else {
			System.out.println(num1 + "与" + num2 + "的和不可以被3和5整除");
		}


		//判断一个年份是否是闰年，闰年的条件是符合下面二者条件之一：
		//（1）年份能被4整除，但不能被100整除；（2）能被400整除
		//
		//思路分析
		//1.定义年份 int year 保存年
		//2.年份能被4整除，但不能被100整除
		// => year % 4 == 0 && year % 100 != 0
		//3.年份能被400整除 => year % 400 == 0
		//4.上面2和3是 或 的关系
		//代码实现
		int year = 2020;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
	}
}
