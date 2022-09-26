import java.util.Scanner;
public class ArrayAdd02 {
	//定义一个main方法
	public static void main(String[] args) {
		/*
		要求：实现动态的给数组添加元素效果，实现对数组扩容。
		1) 原始数组使用静态分配 int[] arr = {1,2,3}
		2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
		3) 用户可以通过如下方法来决定是否继续添加添加成功，是否继续？y/n

		思路分析
		1. 定义初始数组 int[] arr = {1,2,3}
		2. 定义一个新的数组 int[] arrNew = new int[arr.length + 1];
		3. 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
		4. 将 4 赋给arrNew[arrNew.length - 1] = 4;把4赋给arrNew最后一个元素
		5. 让 arr 指向 arrNew; arr = arrNew;那么，原来的arr数组就被销毁
		6. 创建一个Scanner对象可以接收用户输入
		7. 因为用户什么时候退出不确定，使用 do-while + break来控制
		*/
		Scanner myScanner = new Scanner(System.in);
		//初始化数组
		int[] arr = {1,2,3};

		do {
			int[] arrNew = new int[arr.length + 1];
			// 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			//把4赋给arrNew最后一个元素
			arrNew[arrNew.length - 1] = addNum;
			//让 arr 指向 arrNew
			arr = arrNew;
			//输出arr
			System.out.println("=====扩容后的arr的元素情况为=====");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println("\n请确认是否继续添加 y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {//如果为n退出循环
				break;
			}
		}while(true);
		System.out.println("您已退出添加！");
		//动态功能见ArrayAdd.java
	}
}