import java.util.Scanner;
public class ArrayReduce {
	//定义一个main方法
	public static void main(String[] args) {
		/*
		要求：实现动态的给数组缩减元素效果，实现对数组缩减。
		有一个数组{1，2，3，4，5，6}，可以将该数组进行缩减，
		提示用户是否继续缩减，每次缩减最后一个元素
		当只剩下一个元素时，提示，不能再缩减


		思路分析
		1. 定义初始数组 int[] arr = {1,2,3,4,5,6}
		2. 定义一个新的数组 int[] arrNew = new int[arr.length - 1];
		3. 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
		4. 让 arr 指向 arrNew; arr = arrNew;那么，原来的arr数组就被销毁
		5. 创建一个Scanner对象可以接收用户输入
		6. 因为用户什么时候退出不确定，使用 do-while + break来控制
		*/
		Scanner myScanner = new Scanner(System.in);
		//初始化数组
		int[] arr = {1,2,3,4,5,6};

		do {
			if(arr.length == 1) {
				System.out.println("不能再缩减了！");
				break;
			}else{
				int[] arrNew = new int[arr.length - 1];
				// 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
				for(int i = 0; i < arrNew.length; i++) {
					arrNew[i] = arr[i];
				}
				//让 arr 指向 arrNew
				arr = arrNew;
				//输出arr
				System.out.println("=====缩减后的arr的元素情况为=====");
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + "\t");
				}
				System.out.println("\n请确认是否继续缩减 y/n");
				char key = myScanner.next().charAt(0);
				if(key == 'n') {//如果为n退出循环
					break;
				}
			}
		}while(true);
		System.out.println("您已退出缩减！");
	}
}