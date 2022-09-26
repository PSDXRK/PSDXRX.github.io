//成员方法传参机制
//2. 引用数据类型的传参机制
//重要结论：引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参
public class MethodParameter02 {
	//编写main方法
	public static void main(String[] args) {
		//测试
		B b = new B();
		int[] arr  = {1, 2, 3};
		b.test100(arr);//调用方法
		System.out.println("main方法的arr数组");
		//遍历数组
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}//200 2 3
		System.out.println();

		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		//测试题，如果test200 执行的是 p = null ,下面的结果是 10
		//测试题，如果test200 执行的是 p = new Person();....,下面输出的是 10
		System.out.println("main 的p.age=" + p.age);//10000
	}
}
class Person {
	String name;
	int age;
}
class B {
	//B 类中编写一个方法 test100，可以接收一个数组，在方法中修改该数组，
	//看看原来的数组是否变化？  会变化
	public void test100(int[] arr) {
		arr[0] = 200;//修改
		//遍历数组
		System.out.println("test100方法的arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}//200 2 3
		System.out.println();	
	}

	//B 类中编写一个方法 test200，可以接收一个 Person(age,sal)对象，
	//在方法中修改该对象属性，看看原来的对象是否变化？  会变化
	public void test200(Person p) {
		// p.age = 10000;//修改对象属性
		// 思考1
		//p = null;
		//System.out.println("test200 的p.age=" + p.age);//报错，因为p置空,就没有相应的地址空间
		//而main方法中的p还是指向对应的地址空间，不受影响
		
		//思考2
		p = new Person();//创建了一个新对象，指向了新的地址空间
		p.name = "tom";
		p.age = 99;
	}
}