//练习二
public class ArithmeticOperatorExercise02 {
	//编写一个main方法
	public static void main(String[] args) {
		//假如还有59天放假，问：合xx个星期零xx天？
		int week = 59 / 7;
		int day = 59 % 7;
		System.out.println("假如还有59天放假，合" + week 
			+ "星期零" + day + "天");
		
		int days = 12359;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天放假，合" + weeks + "星期零" 
			+ leftdays + "天");
		 
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：
		//5/9*(华氏温度-100)，请求出华氏温度多用的摄氏温度
		double huashi = 135.6;
		double sheshi = 5.0 / 9.0 * (huashi - 100.0);
		System.out.println("华氏温度" + huashi + "对应的摄氏温度为：" + sheshi);

	}
}