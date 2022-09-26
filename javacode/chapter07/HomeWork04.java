public class HomeWork04 {
	//编写一个mian方法
	public static void main(String[] args) {
		A03 a03 = new A03();
		int[] arr = {1,3,5,7,8};
		int[] newArr = a03.copyArr(arr);
		//遍历newArr，验证
		System.out.println("========返回的 newArr 元素情况如下========");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
	}
}

/*
	题目：
		编写类A03，实现数组的复制功能copyArr，输入旧数组，返回新数组，元素和旧数组一样
 */
//分析
//1. 类名 A03
//2. 方法名 copyArr
//3. 返回值 
//4. 形参（int[] arr1 , int[] arr2)
class A03 {
	public int[] copyArr(int[] oldArr) {
		//在堆中，创建了一个长度为 oldArr.length 的数组
		int[] newArr = new int[oldArr.length];
		//遍历 oldArr 数组，将元素拷贝到 newArr 
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}