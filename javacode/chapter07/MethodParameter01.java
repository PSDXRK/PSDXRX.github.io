//成员方法的传参机制
//1. 基本数据类型的传参机制
//重要结论：基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参

public class MethodParameter01 {
	//编写main方法
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//创建AA对象 名字 obj
		AA obj = new AA();
		obj.swap(a,b);//调用swap
		//解读这里的 a b 是main方法中的，所以不会与 swap 中的 a b 冲突
		//所以 a b 还是main方法中的值
		System.out.println("main方法  a=" + a + " b=" + b);//a=10 b=20
	}
}

class AA {
	public void swap(int a, int b) {
		System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);//a=10 b=20
		//完成了 a 和 b 的交换
		int temp = a;
		a = b;
		b = temp;
		System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);//a=20 b=10
	}
}