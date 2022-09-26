//顺序查找快速入门
import java.util.Scanner;
public class SequenceSearch {
	//编写一个main方法
	public static void main(String[] args) {
		// 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
		// 猜数游戏：
		// 从键盘中任意输入一个名称，判断数列中是否包含此名称
		// 要求: 如果找到了，就提示找到，并给出下标
		/*
		思路分析
		1. 定义一个字符串数组
		2. 接收用户输入，遍历数组，逐一比较，如果有，则提示信息，并退出
		 */
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要查找的人名");
		String findName = myScanner.next();
		//遍历数组，逐一比较，如果有则提示并退出
		//这里有个编程思想
		/*
		要提示没找到
		不能在if语句后面加 else {System.out.println("不好意思，没找到！")}
		因为这样刚比较第一个名字不同就直接显示没找到
		可以定义一个索引/标识 int index = -1 
		如果找到名字，则 index 发生变化
		没找到则提示没找到 用一个if 语句判断 index 是否变化
		 */
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			//比较 字符串比较用 equals
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到 " + findName);
				System.out.println("下标为 " + i);
				//把 i 保存到 index
				index = i;
				break;//找到就退出
			}
		}
		//判断没找到后提示
		if(index == -1) {
			System.out.println("不好意思，没找到" + findName);
		}
	}
}