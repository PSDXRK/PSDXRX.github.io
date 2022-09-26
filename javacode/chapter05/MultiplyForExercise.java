//多重循环控制的练习
import java.util.Scanner;
public class MultiplyForExercise {
	public static void main(String[] args) {
		//统计 3 个班成绩情况，每个班有 5 名同学，
		//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
		//统计三个班及格人数，每个班有 5 名同学。
		//思路分析:
		//化繁为简
		//(1) 先计算一个班 , 5 个学生的成绩和平均分 , 使用 for
		//1.1 创建 Scanner 对象然后，接收用户输入
		//1.2 得到该班级的平均分 , 定义一个 doubel sum
		// Scanner myScanner = new Scanner(System.in);
		// double sum = 0;
		// for(int i = 1; i <= 5; i++) {
		// 	System.out.println("请输入第一个班的第" + i + "个学生的成绩");
		// 	double score = myScanner.nextDouble();
		// 	sum += score;
		// 	System.out.println("成绩为：" + score);
		// }
		// System.out.println("该班的总分为" + sum + "平均分为" + (sum/5));
		//(2) 统计 3 个班(每个班 5 个学生) 平均分
		//(3) 所有班级的平均分
		//3.1 定义一个变量，double totalScore 累积所有学生的成绩
		//3.2 当多重循环结束后，totalScore / (3*5)
		// Scanner myScanner = new Scanner(System.in);
		// double totalScore = 0;
		// for(int j = 1; j <= 3; j++) {//j表示班级
		// 	double sum = 0;//一个班级的总分
		// 	for(int i = 1; i <= 5; i++) {//i表示学生
		// 		System.out.println("请输入第" + j + "班的第" + i + "个学生的成绩");
		// 		double score = myScanner.nextDouble();
		// 		sum += score;
		// 		System.out.println("成绩为：" + score);
		// 	}
		// 	System.out.println(j + "班的总分为" + sum + "平均分为" + (sum/5));
		// 	totalScore += sum;
		// }
		// System.out.println("三个班的总分为" + totalScore + "平均分为" + (totalScore/15));
		//(4) 统计三个班及格人数
		//4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60, passNum++
		//4.2 如果 >= 60 passNum+
		// Scanner myScanner = new Scanner(System.in);
		// double totalScore = 0;
		// int passNum = 0;
		// for(int j = 1; j <= 3; j++) {//j表示班级
		// 	double sum = 0;//一个班级的总分
		// 	for(int i = 1; i <= 5; i++) {//i表示学生
		// 		System.out.println("请输入第" + j + "班的第" + i + "个学生的成绩");
		// 		double score = myScanner.nextDouble();
		// 		if(score >= 60){
		// 			passNum++;
		// 		}
		// 		sum += score;
		// 		System.out.println("成绩为：" + score);
		// 	}
		// 	System.out.println(j + "班的总分为" + sum + "平均分为" + (sum/5));
		// 	totalScore += sum;
		// }
		// System.out.println("三个班的总分为" + totalScore + "平均分为" + (totalScore/15));
		// System.out.println("三个班及格人数为" + passNum);
		//(5) 可以优化[效率，可读性, 结构
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;
		System.out.println("请输入班级数");
		int classNum = myScanner.nextInt();
		System.out.println("请输入每个班学生人数");
		int stuNum = myScanner.nextInt();
		int passNum = 0;
		for(int j = 1; j <= classNum; j++) {//j表示班级
			double sum = 0;//一个班级的总分
			for(int i = 1; i <= stuNum; i++) {//i表示学生
				System.out.println("请输入第" + j + "班的第" + i + "个学生的成绩");
				double score = myScanner.nextDouble();
				if(score >= 60){
					passNum++;
				}
				sum += score;
				System.out.println("成绩为：" + score);
			}
			System.out.println(j + "班的总分为" + sum + "平均分为" + (sum/stuNum));
			totalScore += sum;
		}
		System.out.println(classNum + "个班的总分为" + totalScore + "平均分为" + totalScore/(classNum*stuNum));
		System.out.println(classNum + "个班及格人数为" + passNum);

		for(int k = 1; k<=9; k++){
			for(int a = 1; a <= k; a++){
				System.out.println(a + "*" + k + "=" + (k*a) + "\t");
			}
		}
	}
}