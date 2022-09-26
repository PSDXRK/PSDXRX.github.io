public class FloatDetail {

	//编写一个main方法
	public static void main(String[] args) {
		//java的浮点型常量（具体值）默认为double型，声明float型需要在后面加'f'或'F'
		//float num1 = 1.1;//对不对？错误
		float num1 = 1.1F;//对的
		double num2 = 1.1;//对
		double num3 = 1.1f;//对的，小的放大的里面可以，大的不可以放小的里面

		//十进制数形式：如5.12     512.0f     .512  (必须有小数点)
		double num4 = .123;//对的，等价于0.123
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		//科学计数法形式：如 5.12e2 [5.12*10的2次方]    5.12E-2 [5.12/10的2次方]
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512

		//通常情况下，应该使用double型，因为它比float更精确
		//【举例说明】
		double num5 = 2.1234567851;
		float num6 = 2.1234567851f;
		System.out.println(num5);//输出2.1234567851
		System.out.println(num6);//输出2.1234567


		//浮点数使用陷阱：2.7 和 8.1 / 3 比较
		//看一段代码
		double num7 = 2.7;//2.7
		double num8 = 8.1 / 3;//接近2.7的小数而不是2.7（是计算机运算机制问题，不是数学的问题）
		System.out.println(num7);//输出 2.7
		System.out.println(num8);//输出 2.6999999999999997
		//得到重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心
		//看一段代码
		if( num7 == num8) {
			System.out.println("相等");//不会输出结果
		}
		//正确方法：应该是以两个数的差值的绝对值，在某个精度范围内判断
		if(Math.abs(num7 - num8) < 0.000001) {
			System.out.println("差值非常小，到我规定值，认为相等");

		}//选中后，按Ctrl+/可快速注释
		System.out.println(Math.abs(num7 - num8));//输出4.440892098500626E-16
		//细节：如果是直接查询得的小数或者直接赋值，则可以比较判断
		

	}
}