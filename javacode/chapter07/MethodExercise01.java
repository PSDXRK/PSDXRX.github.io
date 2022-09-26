//成员方法练习
import java.util.Scanner;
public class MethodExercise01 {
	//编写一个main方法
	public static void main(String[] args) {
		// 1. 编写类AA新方法：判断一个数是奇数还是偶数，返回Boolean
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要判断的数 n");
		int putNum = myScanner.nextInt();
		AA panDuan = new AA();
		if(panDuan.panDuanJiOu(putNum)) {//T
			System.out.println("是偶数");
		}else{//F
			System.out.println("是奇数");
		}
		
		//2.根据行、列、字符打印 对应行数和列数的字符，
		//比如：行：4，列：4，字符#,则打印相应的效果
		System.out.println("请输入行数");
		int a = myScanner.nextInt();
		System.out.println("请输入列数");
		int b = myScanner.nextInt();
		System.out.println("请输入字符");
		char c = myScanner.next().charAt(0);
		System.out.println("=================");
		panDuan.printChar(a,b,c);
	}
}

class AA {
	// 1. 编写类AA新方法：判断一个数是奇数还是偶数，返回Boolean
	//分析思路
	//1. 方法的返回类型
	//2. 方法的名字
	//3. 方法的形参
	//4. 方法体
	public boolean panDuanJiOu(int n) {
		//方法一（自己）
		// boolean a;
		// if(n%2 == 0) {
		// 	a = true;
		// 	System.out.println(a);
		// }else {
		// 	a = false;
		// 	System.out.println(a);
		// }
		// return a;
		
		//方法二（优化）
		// if(n % 2 != 0) {
		// 	return false;
		// } else {
		// 	return true;
		// }

		//方法三（最优）
		return n % 2 == 0 ? true : false;
	}

	//2.根据行、列、字符打印 对应行数和列数的字符，
	//比如：行：4，列：4，字符#,则打印相应的效果
	/*
		####
		####
		####
		####
	*/
	//思路
	//1. 方法的返回类型 void
	//2. 方法的名字 printChar
	//3. 方法的形参 (int row, int col, char c)
	//4. 方法体 , 循环
	public void printChar(int row, int col, char c) {
		for(int i = 0;  i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}