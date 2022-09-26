//多重循环控制的练习
public class MultiplyForExercise02 {
	public static void main(String[] args) {	
		//打印出九九乘法表
		for(int k = 1; k<=9; k++){
			for(int a = 1; a <= k; a++){
				System.out.print(a + "*" + k + "=" + (k*a) + "\t");
			}//print,括号里是什么输出什么
			System.out.println();//println相当于是print加上换行符的效果。
		}
	}
}

