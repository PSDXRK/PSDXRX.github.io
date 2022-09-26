//递归：
//简单的说: 递归就是方法自己调用自己,每次调用时传入不同的变量.
//递归有助于编程者解决复杂问题,同时可以让代码变得简洁
public class Recursion01{
	//编写一个main方法
	public static void main(String[] args) {

		T t1 = new T();
		t1.test(4);//输出什么? n = 2 n = 3 n = 4
		t1.test02(4);//输出什么？ n = 2
		int res = t1.factorial(5);//1*2*3*4*5 = 120
		System.out.println("5的阶乘 res=" + res);//120

	}
}

class T {
	//分析(详见笔记递归调用机制)
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);
	}
	//与方法test对比
	public void test02(int n) {
		if(n > 2) {
			test02(n - 1);
		} else {
			System.out.println("n=" + n);
		}
	}
	//factorial 阶乘 见笔记内存图
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

}