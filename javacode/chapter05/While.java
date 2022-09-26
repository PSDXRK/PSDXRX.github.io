//while语句快速入门
//基本语法:
// 循环变量初始化
// while(循环条件) {
// 		循环体（多条语句）;
// 		循环变量迭代；
// }
// 说明：
// 1)while循环也有四要素
// 2)只是四要素放的位置和for不一样
public class While {
	public static void main(String[] args) {
		//输出十句话
		int i = 1;//循环变量初始化
		while(i <= 10) {//循环条件
			System.out.println("何辉凡牛逼" + i);//循环体
			i++;//循环变量迭代
		}
		System.out.println("i=" + i);
	}
}