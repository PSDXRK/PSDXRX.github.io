//&& 和 & 案例演示
public class LogicOperator01 {
	//编写一个main方法
	public static void main(String[] args) {
		//&& 和 & 案例演示
		//
		// && 短路与
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}

		// & 逻辑与
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}

		//区别
		int a = 4;
		int b = 9;
		//对于 &&（短路与）而言，如果第一个条件为false，后面条件不再判断（执行）
		if(a < 1 && ++b <50) {
			System.out.println("ok300");//不输出
		}
		System.out.println("a=" + a + " b=" + b);//++b没有执行 4 9
		//对于 & (逻辑与) 而言,如果第一个条件为false,后面的条件仍然会判断（执行）
		if(a < 1 & ++b < 50) {
			System.out.println("ok400");
		}
		System.out.println("a=" + a + " b=" + b);//++b执行了 4 10

		//在实际开发中。我们基本用 &&（短路与）效率更高

	}
}