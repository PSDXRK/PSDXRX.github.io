//数组的快速入门
//数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型
//即 数组就是一组数据
public class Array01 {
	//定义一个main方法
	public static void main(String[] args) {
		// 一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
		// 请问这六只鸡的总体重是多少?平均体重是多少? 
		// 思路：
		// 定义 6 个变量 , 加起来 总体重， 求出平均体重.引出 -> 数组
		// 传统方法
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;
		// double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		// double avgWeight = totalWeight / 6;
		// System.out.println("总体重=" + totalWeight
		// + "平均体重=" + avgWeight)


		// 定义一个数组
		//1. double[] 表示 是 double 类型的数组， 数组名 hens
		//2. {3, 5, 1, 3.4, 2, 50} 表示数组的值/元素,依次表示数组的
		//第几个元素
		//
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		//遍历数组得到数组的所有元素的和，使用for
		//解读
		//1.我们可以通过 hens[下标] 来访问数组的元素
		//  下标是从 0 开始编号的 比如第一个元素就是hens[0]
		//  第二个元素就是 hens[1] 以此类推
		//2.通过for就可以循环访问 数组的元素/值
		//3.使用一个变量 totalWeight 将各个元素累积
		System.out.println("===使用数组解决===");
		//tips:可以通过 数组名.length 得到数组的大小/长度
		System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++) {
			System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight
		+ "  平均体重=" + (totalWeight/hens.length));

	}
}