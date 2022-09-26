//  演示 | 和 || 的使用
public class LogicOperator02 {
	//编写一个main方法
	public static void main(String[] args) {
		// ||(短路或) 和 |(逻辑或) 案例演示
		//
		// ||（短路或）
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}

		// |（逻辑或）
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}

		//区别
		int a = 4;
		int b = 9;
		//对于 ||（短路或）而言，如果第一个条件为true，后面条件不再判断（执行）
		if(a < 5 || ++b <50) {
			System.out.println("ok300");//ok300
		}
		System.out.println("a=" + a + " b=" + b);//++b没有执行 4 9
		//对于 | (逻辑或) 而言,不管是否为true,后面的条件仍然会判断（执行）
		if(a < 5 | ++b < 50) {
			System.out.println("ok400");//ok400
		}
		System.out.println("a=" + a + " b=" + b);//++b执行了 4 10

		//在实际开发中。我们基本用 ||（短路|）效率更高

	}
}