//自动类型转换细节
public class AutoConvertDetail {

	//编写一个main方法
	public static void main(String[] args) {
		//细节1：有多种类型的数据是混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		//float d1 = n1 + 1.1;
		//错误，因为 进行混合运算时，1.1 是double类型，容量最大
		//所以 n1 自动转换为double类型，所以结果为double > float
		double d1 = n1 + 1.1;//对的
		float d2 = n1 + 1.1f;//对的
		System.out.println(n1);//10
		System.out.println(d1);//11.1
		System.out.println(d2);//11.1
		
		//细节2：当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，
		//就会报错，反之会进行自动类型转换
		//int n2 = 1.1;//错误 double -> int 无法自动实现
		
		
		//细节3:（byte, short）和 char 之间不会相互自动转换
		//当把数赋给 byte 时，(1)先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;//对的，在-128~127范围内
		//int n2 = 1;n2是int
		//byte b2 = n2;//错误，原因：如果是变量赋值，判断类型
		//char c1 = b1;//错误，原因：byte不能自动转换成char
		
		
		//细节4：byte, short, char  他们三者可以计算，在计算时首先转换为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错的，b2 + s1 => int
		int n3 = b2 + s1;//对的
		//byte b4 = b2 + b3;//错的，b2 + b3 =>int
		//只要是 byte short char 参与的计算都会首先转换为int类型，不论是单独还是混合运算
		

		//细节5：Boolean 不参与转换
		boolean pass = true;
		//int num20 = pass;//错误，boolean不参与类型自动转换
		
		
		//细节6:自动提升原则：表达式结果的类型自动提升为 操作数 中最大类型
		//看一道题
		byte b4 =1;
		short s3 = 100;
		int num30 = 1;
		double num40 = 1.1;
		//float num50 = b4 + s3 + num30 + num40;//错误 double不能赋值给float
		double num60 = b4 + s3 + num30 + num40;//对的
		System.out.println(b4 + s3 + num30 + num40);//输出103.1，结果自动提升为double类型


	}
}