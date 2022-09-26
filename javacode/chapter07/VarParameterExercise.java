public class VarParameterExercise {
	//编写一个main方法
	public static void main(String[] args) {
		HhfMethod method = new HhfMethod();
		System.out.println(method.showScore1("何辉凡", 100, 100));
		System.out.println(method.showScore1("何辉凡", 100, 100, 100));
		System.out.println(method.showScore1("何辉凡", 100, 100, 100, 100, 100));
		System.out.println("========可变参数优化后=======");
		System.out.println(method.showScore("何辉凡", 100,100,100,100));
		System.out.println(method.showScore("吴泽传", 100,100));
	}
}
//有三个方法，分别实现返回姓名和两门课堂成绩（总分），返回姓名和三门课成绩（总分），
//返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
//类名：HhfMethod 方法名： showScore
class HhfMethod {
	//重载：
	//1. 返回姓名和两门课堂成绩（总分)
	public String showScore1(String name, int n1, int n2) {
		int totalScore = n1 + n2;
		return name + " 成绩总分为： " + totalScore;
	}
	//2.返回姓名和三门课成绩（总分）
	public String showScore1(String name, int n1, int n2, int n3) {
		int totalScore = n1 + n2 + n3;
		return name + " 成绩总分为： " + totalScore;
	}
	//3.返回姓名和五门课成绩（总分）
	public String showScore1(String name, int n1, int n2, int n3, int n4, int n5) {
		int totalScore = n1 + n2 + n3 + n4 + n5;
		return name + " 成绩总分为： " + totalScore;
	}

	//可用可变参数对上述方法进行优化
	public String showScore(String name, double... nums) {
		double totalScore = 0;
		for(int i = 0; i < nums.length; i++) {
			totalScore += nums[i];
		}
		return name + " 有 " + nums.length + " 门课的总成绩为： " + totalScore;
	}
}