//switch 注意细节
public class SwitchDetail {
	public static void main(String[] args) {
		//细节1;
		//表达式数据类型，应该和case后的常量类型一致
		//或者是可以自动转换成可以相互比较的类型，比如输入的是字符，而常量是int
		
		char c = 'a';
		switch(c) {
			case 'a':
				System.out.println("ok1");
				break;
			case 'b':
				System.out.println("ok2");
				break;
			//case "hello";//错误，类型不匹配且无法自动转换
			case 20://对的，char可以自动转换成Int 
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");

		}

		//细节2：
		// switch(表达式)中表达式的返回值必须是：
		// （byte,short,int,char,enum[枚举]，String）
		
		//double d = 1.1;
		//switch(d) { //错误，表达式返回值为double
		//	case 1.1 :
		//		System.out.println("ok1");
		//	}
		//	
		

		//细节3：
		//case字句中的值必须是常量（1，'a'等具体值）或者常量表达式（本质还是常量
		//而不能是变量
		char f = 'a';
		char c2 = 'c';
		switch(f) {
			case 'a' :
				System.out.println("ok1");
				break;
			//case c2 ://错误.c2 是变量，c才是常量
			case 'c' ://对的，c是常量
				System.out.println("ok2");
				break;
			case 'c' + 1://对的，常量表达式本质还是常量
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");

		}


		//细节4：
		//default子句是可选的（可写可不写），当没有匹配的case时，执行default
		//如果没有default子句，又没有匹配任何常量，则没有输出
		


		//细节5：
		//break语句用来执行完一个case分支后使程序跳出switch语句块；
		//如果没有写break,程序会顺序执行到switch结尾,除非遇到break;
		char e = 'a';
		switch(c) {
			case 'a':
				System.out.println("ok1");
			case 'b':
				System.out.println("ok2");
			case 20://对的，char可以自动转换成Int 
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");


		}//输出ok1 ok2 ok3
		System.out.println("退出switch,程序继续执行");

	}
}