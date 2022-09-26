public class StringToBasicDetail {

	//编写一个main方法
	public static void main(String[] args) {

		//在将String转换成基本数据类型时，要确保String类型能够转换成有效的数据
		//比如我们可以把"123"，转换成一个整数，但是不能把"hello"转换成一个整数
		//如果格式不正确，就会抛出异常，程序就会终止
		String str = "hello";
		//转成int
		int n1 = Integer.parseInt(str);//编译不会报错但运行会异常退出
		System.out.println(n1);

	}
}
