//使用 for 循环完成下面的案例
//请编写一个程序，可以接收一个整数,表示层数（totalLevel），
//打印出金字塔。(Stars.java) [化繁为简, 先死后活
import java.util.Scanner;
public class Star {
	public static void main(String[] args) {
		/*
		*
	   * *
	  *   *
	 *     *
	*********
		思路分析
		化繁为简
		1.先打印一个矩形
		******
		******
		******
		******
		******
		for(int i = 1; i <= 5; i++) {
			System.out.println("******");
		}
		2.打印半个金字塔
		*     //第一层有一个*
		**    //第二层有两个*
		***   //第三层有三个*
		****  //第四层有四个*
		***** //第五层有五个*
		for(int i = 1; i <= 5; i++) {//i表示层数
			for(int j = 1; j <= i; j++) {//j表示*个数
				System.out.print("*");
			}
			System.out.println("");//println默认加换行
		}
		3.打印整个金字塔
		*      //第1层有1个*  2*1-1 有4=(总层数-1)个空格
	   ***     //第2层有3个*  2*2-1 有3=(总层数-2)个空格
	  *****    //第3层有5个*  2*3-1 有2=(总层数-3)个空格
	 *******   //第4层有7个*  2*4-1 有1=(总层数-4)个空格
	*********  //第5层有9个*  2*5-1 有0=(总层数-5)个空格
		for(int i = 1; i <= 5; i++) {//i表示层数
			//在输出*前还有输出 空格 对应空格 = 总层数-当前层
			for(int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			//控制打印每层*的个数
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");//println默认加换行
		}
		4.打印空心金字塔
		*      //第1层有1个*  当前行的第一个位置是*，最后一个位置也是*
	   * *     //第2层有2个*  当前行的第一个位置是*，最后一个位置也是*
	  *   *    //第3层有2个*  当前行的第一个位置是*，最后一个位置也是*
	 *     *   //第4层有2个*  当前行的第一个位置是*，最后一个位置也是*
	*********  //第5层有9个*  全部输出*
		先死后活
		1.将总层数变量话
		2.引入Scanner对象
		 */
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入金字塔的层数");
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= totalLevel; i++) {//i表示层数
			//在输出*前还有输出 空格 对应空格 = 总层数-当前层
			for(int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}
			//控制打印每层*的个数
			for(int j = 1; j <= 2 * i - 1; j++) {
				//当前行的第一个位置是*，最后一个位置也是* 其他位置空格
				//最后一行全部输出
				if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");//println默认加换行
		}
	}
}
