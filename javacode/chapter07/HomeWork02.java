import java.util.Scanner;
public class HomeWork02 {
	//编写一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入要查找的元素名");
		String findName = myScanner.next();
		String[] arry = {"大毛", "二毛", "三毛","老王"};
		A02 a02 = new A02();
		int index = a02.find(arry,findName);
		System.out.println("查找到的索引为： " + index);

	}
}
//题目：编写类A01,定义方法find，实现查找某字符串数组中的元素查找，并返回索引，
//      如果找不到返回 -1
class A02 {
	public int find(String[] arry, String name) {
		for(int i = 0; i < arry.length; i++) {
			if(name.equals(arry[i])) {
				return i;
			}
		}
		return -1;
	}
}