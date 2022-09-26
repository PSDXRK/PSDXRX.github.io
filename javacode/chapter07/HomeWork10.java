public class HomeWork10 {
	//编写一个mian方法
	public static void main(String[] args) {

	}
}
class Demo {
	int i = 100;
	public void m() {
		int j = i++;
		System.out.println("i=" + i);// 101
		System.out.println("j=" + j);// 100
	}
}
class Test {
	public static void main(String[] args) {//运行它 java Test
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);// 101
		System.out.println(d2.i);// 101
	}
}