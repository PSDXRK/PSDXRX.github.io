//冒泡排序快速入门
//冒泡排序（Bubble Sorting）的基本思想是：
//通过对待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素的值，
//若发现逆序则交换，使值较大的元素逐渐从前移向后部，
//就象水底下的气泡一样逐渐向上冒
public class BubbleSort {
	//定义一个main方法
	public static void main(String[] args) {
		//化繁为简 先死后活
		/*
			数组 [24,69,80,57,13]
			第 1 轮排序: 目标把最大数放在最后
			第 1 次比较[24,69,80,57,13]
			第 2 次比较[24,69,80,57,13]
			第 3 次比较[24,69,57,80,13]
			第 4 次比较[24,69,57,13,80]
		 */
		//将多轮循环使用外层循环包括起来即可
		//先死后活 =》 4 就是arr.leng - 1
		int[] arr = {24, 69, 80, 57, 13};
		int temp = 0;//用于辅助交换的变量，
		for(int i = 0; i < arr.length - 1; i++) {//外层循环是4次
			for(int j = 0; j < arr.length -1 - i; j++) {//4次--3次--2次--1次
				//如果前面的数 > 后面的数，就交换
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
					//交换的本质相当于两杯水交换需要第三个杯子
				}
			}
			System.out.println("\n===第" + (i+1) + "一轮排序===");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}
	}
}