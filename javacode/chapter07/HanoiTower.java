import java.util.Scanner;
public class HanoiTower {
	//编写一个main方法
	public static void main(String[] args) {

		Tower tower = new Tower();
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入汉诺塔盘子数量！");
		int panNum = myScanneer.nextInt();
		tower.move(panNum, 'A', 'B', 'C');
	}
}

class Tower {
	/*
		汉诺塔：汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。
		大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序
		摞着 64 片圆盘。大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一
		根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
	 */
	
	//方法
	//num 表示盘子个数 a,b,c分别表示三个塔
	public void move(int num, char a, char b, char c) {
		//如果只有一个盘 num = 1
		if(num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以看成两个，最下面和是上面所有盘（num-1)
			//(1)先移动上面所有盘到 b 借助 c
			move(num - 1, a, c, b);
			//(2)把最下面的盘，移动到 c
			System.out.println(a + "->" + c);
			//(3)再把 b塔的所有盘，移动到c 借助 a
			move(num - 1, b, a, c);
		}
	}
}