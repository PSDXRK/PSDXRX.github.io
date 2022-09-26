//for循环细节演示
public class ForDetail {
	public static void main(String[] args) {
		//细节(1) 循环条件是返回一个布尔值的表达式
		//传统规范写法
		//for(循环变量初始化；循环条件；循环变量迭代) {
		//	循环操作（可以多条语句）；
		//	}
		//	其中的循环初始变量只能在for循环域中使用，不能在外面使用
		for(int i = 1;i <= 10;i++){
			System.out.println("何辉凡牛逼" + i);
		}
		//System.out.println(i);//错误，i 为for循环中的变量，不可在循环外使用

		//细节(2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，
		//但是两边的分号不能省略
		int i = 1;//循环变量初始化 
		for( ; i <= 10 ; ){
			System.out.println("何辉凡再次牛逼" + i);
			i++;//循环变量迭代
		}
		System.out.println("i=" + i);//对的输出 11
		//补充
		// for( ;;) {//表示一个无限循环，死循环
		// 	System.out.println("ok");
		// }
		// Ctrl + c 可以退出死循环（Windows终端里）
		

		// 细节(3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，
		// 循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。
		int count = 3;
		for(int a = 0,b = 0; a < count; a++,b += 2) {
			System.out.println("a=" + a + " b=" + b);
		}
	}
}