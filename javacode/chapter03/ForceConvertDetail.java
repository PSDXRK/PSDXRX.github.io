public class ForceConvertDetail {

	//编写一个main方法
	public static void main(String[] args) {

		//演示强制类型转换
		//细节1：强制转换符号只针对最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//double --> int 会报错
		int y = (int)(10*3.5+6*1.5);//对的，用了（）提升优先级
		System.out.println(y);//44  35.0 + 9.0 = 44.0(double) --> 44(int)

		//细节2：char 类型可以保存 int 的常量值，但不能保存 int 的变量值，需要强转
		char c1 = 100;//ok char 类型可以保存 int 的常量值
		int m = 100;//ok
		//char c2 = m;//错误 char不能保存 int 的变量值
		char c3 = (char)m;//ok
		System.out.println(c3);//100对应的字符 d


	}
}