//do while语句快速入门
//基本语法:
// 循环变量初始化
// do {
// 		循环体（多条语句）;
// 		循环变量迭代；
// }while(循环条件);
// 说明：
// (1) do while是关键字
// (2) do while循环也有四要素,只是四要素放的位置不一样
// (3) 先执行，再判断，也就是说，一定会至少执行一次
// (4) 最后有一个分号
// (5) while 和 do while 的区别：要账
// while 是先问还不还钱，不还就打，再问，再打一直循环直到还钱就结束
// do while 是上来就打一顿，再问还不还，不还就再打，再问一直循环直到还钱结束
public class DoWhile {
	public static void main(String[] args) {
		//输出10句话
		int i = 1;//循环变量初始化
		do {
			System.out.println("何辉凡牛逼" + i);//循环执行语句
			i++;//循环变量迭代
		} while(i <= 10);//循环条件
		System.out.println("i=" + i);
	}
}