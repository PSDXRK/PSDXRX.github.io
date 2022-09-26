//数组练习
public class ArrayExercise {
	//定义一个main方法
	public static void main(String[] args) {
		//创建一个char类型的26个元素数组，分别放置'A'-'Z'.使用for 循环
		//访问所有元素并打印出来。提示 char 类型数据运算'A'+1->'B'
		/*
		思路分析
		1.定义一个 数组 char[] chars = new char[26]
		2.因为 'A' + 1 = 'B' ；类推 所以使用for 循环来赋值
		3.使用for 循环访问所有元素
		 */
		char[] chars = new char[26];
		for(int i = 0; i < chars.length; i++) {//循环26次
			//chars 是 char[]
			//dhars[i] 是 char类型
			chars[i] = (char)('A' + i);//'A'+i 是 int ，需要强制转换
		}
		//循环输出
		System.out.println("======chars数组======");
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}