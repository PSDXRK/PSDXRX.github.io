public class ForceConvert {

	//编写一个main方法
	public static void main(String[] args) {

		//演示强制类型转换
		//自动类型转换的逆过程，将容量大的数据转换成容量小的数据
		//使用时要加上强制转换符（），但可能造成精度降低或者溢出
		int n1 = (int)1.9;//将 1.9 强制转换成 int 型，变成 1
		System.out.println("n1=" + n1);//1,造成精度损失

		int n2 = 2000;
		byte b1 = (byte)n2;//将 int 型 n2 强制转换成 byte 型
		System.out.println("b1=" + b1);//-48，造成数据溢出
	}
}