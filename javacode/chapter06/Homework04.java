//数组练习
import java.util.Scanner;
public class Homework04 {
	//定义一个main 方法
	public static void main(String[] args) {
		/*
		提：已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，
		    比如：[10,12,45,90],添加23后，数组为[10,12,23,45,90]
		思路分析（自己）
		1.首先定义一个数组，再进行数组扩容
		2.对数组进行冒泡排序
		 */
		// Scanner myScanner = new Scanner(System.in);
		// //初始化数组
		// int[] arr = {10, 12, 45, 90};

		// do {
		// 	int[] arrNew = new int[arr.length + 1];
		// 	// 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
		// 	for(int i = 0; i < arr.length; i++) {
		// 		arrNew[i] = arr[i];
		// 	}
		// 	System.out.println("请输入你要添加的元素");
		// 	int addNum = myScanner.nextInt();
		// 	//把4赋给arrNew最后一个元素
		// 	arrNew[arrNew.length - 1] = addNum;
		// 	//让 arr 指向 arrNew
		// 	arr = arrNew;
		// 	//输出arr
		// 	System.out.println("=====扩容后的arr的元素情况为=====");
		// 	for(int i = 0; i < arr.length; i++) {
		// 		System.out.print(arr[i] + "\t");
		// 	}
		// 	System.out.println("\n请确认是否继续添加 y/n");
		// 	char key = myScanner.next().charAt(0);
		// 	if(key == 'n') {//如果为n退出循环
		// 		break;
		// 	}
		// }while(true);
		// System.out.println("您已退出添加！");
		// //数组排序
		// int temp = 0;//用于辅助交换的变量，
		// for(int i = 0; i < arr.length - 1; i++) {//外层循环是4次
		// 	for(int j = 0; j < arr.length -1 - i; j++) {//4次--3次--2次--1次
		// 		//如果前面的数 > 后面的数，就交换
		// 		if(arr[j] > arr[j + 1]) {
		// 			temp = arr[j];
		// 			arr[j] = arr[j+1];
		// 			arr[j + 1] = temp;
		// 			//交换的本质相当于两杯水交换需要第三个杯子
		// 		}
		// 	}
		// 	System.out.println("\n===第" + (i+1) + "一轮排序===");
		// 	for(int j = 0; j < arr.length; j++) {
		// 		System.out.print(arr[j] + "\t");
		// 	}
		// }


		//老韩的方法
		//思路分析 本质是数组扩容 + 定位
		//1. 我们先确定 添加数应该插入哪个位置
		//2. 然后扩容
		//3.先死后活 引入Scanner对象
		int[] arr = {10, 12, 45, 90};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你要插入的元素");
		int insertNum = myScanner.nextInt();
		int index = -1;//index就是要插入的位置索引

		//遍历数组，如果发现 insertNum <= arr[i],说明 i 就是要插入的位置
		//使用 index 保留 index = i;
		//如果遍历完后，没有发现 insertNum <= arr[i],说明 index = arr.length
		for(int i = 0; i < arr.length; i++) {
			if(insertNum <= arr[i]){
				index = i;
				break;//找到，退出循环
			}
		}

		//判断index的值
		if(index == -1){//说明还没有找到位置
			index = arr.length;
		}
		//扩容
		//先创建一个新的数组,大小 arr.length + 1
		int[] arrNew = new int[arr.length + 1];
		//下面老师准备将arr的元素拷贝到 arrNew,并且要跳过index的位置
		for(int i = 0, j = 0; i < arrNew.length; i++) {
			if( i != index ) {//说明可以把arr的元素拷贝到arrNew
				arrNew[i] = arr[j];
				j++;
			}else {// i 这个位置就是要插入的数
				arrNew[i] = insertNum;
			}
		}

		//让arr 指向arrNew,原来的数组就成为垃圾被销毁
		arr = arrNew;
		//输出数组
		System.out.println("======插入后，arr的情况======");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
} 