//For语句快速入门
//基本语法，
//for(循环变量初始化；循环条件；循环变量迭代) {
//	循环操作（可以多条语句）；
//	}
public class For01 {
	public static void main(String[] args) {
		//说明：
		//1.for关键字，表示循环控制
		//2.for有四要素：（1）循环变量初始化（2）循环条件（3）循环操作（4）循环变量迭代
		//3.循环操作，这里可以有多条语句，也就是我们要循环执行的代码
		//4.如果循环操作（语句）只有一条语句，可以省略{}，建议不要省略
		
		//使用for循环控制输出10句话
		for(int i = 1;i <= 10;i++){
			System.out.println("何辉凡牛逼" + i);
		}
	} 
}