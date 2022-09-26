//数组练习
import java.util.Scanner;
public class Homework05 {
	//定义一个main 方法
	public static void main(String[] args) {

		/*
		题目：随机生成10个整数（1-100）保存到数组，
		并倒序打印以及求平均值、求最大值和最大值的下标、
		并查找里面是否有 8 
		 */
		int[] arr = new int[10];
		//(int)(Math.random() * 100) + 1 产生随机数 1-100
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}

		//随机生成10个整数（1-100）保存到数组
		System.out.println("======随机产生的arr的元素情况======");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//倒序打印
		System.out.println("======倒序排列的arr的元素情况======");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		//求最大值和最大值的下标
		int max = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("最大值为：" + max + "\n" + "最大值的下标为：" + index);

		//求平均值
		double avrNum = 0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avrNum = sum/arr.length;
		System.out.println("平均值为：" + avrNum);

		//查找里面是否有 8
		int index2 = -1;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你要查找的值");
		int searchNum = myScanner.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == searchNum) {
				index2 = i;
				break;
			}
		}
		if(index2 != -1) {
			System.out.println("随机数组里面有 " + searchNum + " 且下标为 " + index2);
		} else {
			System.out.println("随机数组里面没有 " + searchNum);
		}
	}
}