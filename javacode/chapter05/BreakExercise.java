//课堂练习1
public class BreakExercise {
	//定义一个main函数
	public static void main(String[] args) {
		//1-100 以内的数求和，求出 当和 第一次大于 20 的当前数
		/*
		思路分析
		1.循环 1-100 ，求和 sum
		2.当 sum > 20时，记录下当前数，然后break
		 */
		int sum = 0;
		int n = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 20) {
				System.out.println("和>20时，当前数 i=" + i);
				n = i;
				break;
			}
		}
		System.out.println("和>20时，当前数为" + n);
	}
}