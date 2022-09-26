//课堂练习
public class TernaryOperatorExercise {
	public static void main(String[] args) {
		//案例：实现三个数的最大值
		int n1 = 55;
		int n2 = 33;
		int n3 = 113;
		//思路
		//1.先得到 n1 和 n2 中最大值，保存到 max1
		//2.然后再求出 max1 和 n3 中的最大值，保存到 max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.print("最大数是：" + max2);

		//使用一条语句实现(推荐使用上面的方法，更清晰)
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.print("\n最大数是：" + max);

	}
}