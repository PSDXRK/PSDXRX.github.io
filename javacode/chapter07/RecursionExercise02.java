import java.util.Scanner;
public class RecursionExercise02 {
	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入要查看的天数");
		int peachDay = myScanneer.nextInt();
		int res = t1.peach(peachDay);//求第一天的桃子数
		if(res != -1) {
			System.out.println("第" + peachDay + "天的桃子数为： " + res);//1534
		} 
	}
}

class T {
	/*
		猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
		以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
		想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？

		思路分析 逆推
		1. day = 10 有 1 个桃子
		2. day = 9  有（day10 + 1)*2 = 4 
		3. day = 8  有（day9  + 1)*2 = 10
		4. 规律就是 前一天的桃子 = （后一天的桃子 +1）*2//规则
		5. 递归
	*/
	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <=9) {
			return(peach(day +1) + 1)*2;//规则
		} else {
			System.out.println("day在 1-10之间，您的输入有误！");
			return -1;
		}
	}
}