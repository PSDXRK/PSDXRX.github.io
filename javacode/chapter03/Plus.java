public class Plus {

	//编写一个main方法
	public static void main(String[] args) {
		//当左右边两边都是数值型，则作加法运算
		//当左右两边有一方是字符型，则做拼接运算
		//运算顺序，从左到右
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + 3 + "hello");
		System.out.println("hello" + 100 + 3);
	}
}
