public class VarDetail {

	//编写一个main方法
	public static void main(String[] args) {
		//变量必须先声明，后使用，即有顺序
		int a = 50;
		System.out.println(a);//输出50
		//该区域的数据/值可以在同一类型范围内不断变化（此处都是int类型）
		//a = "jack";//错的
		a = 88;//对的
		System.out.println(a);//输出88
		//变量在同一个作用域内不能重名
		//int a = 77;//这是错的，前面已经定义了int a 所以不可以重复
		//相当于在一个教室里有两个人叫张三，但是在不同教室里都有一个张三就不要紧


	}
}
class Dog {
	public static void main(String[] args) {
		int a = 666;//此处的a是在另一个作用域内所以可以，相当于另一个的张三
	}
}