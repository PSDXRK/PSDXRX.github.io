//数组赋值机制
//1) 基本数据类型赋值，这个值就是具体的数据，而且相互不影响
//2) 数组在默认情况下是引用传递，赋的值是地址
public class ArrayAssign {
	//定义一个main方法
	public static void main(String[] args) {
		//基本数据类型赋值，赋值方式为值拷贝
		//n2的变化，不会影响到n1的值
		int n1 = 10;
		int n2 = n1;

		n2 = 90;
		System.out.println("n1=" + n1);//10
		System.out.println("n2=" + n2);//90

		//数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
		//是一个地址，arr2变化会影响到arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//把arr1赋给arr2
		arr2[0] = 10;

		//看看arr1的值
		System.out.println("======arr1的元素======");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");//10,2,3
		}
		System.out.println();
		System.out.println("======arr2的元素======");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");//10,2,3
		}
	}
}