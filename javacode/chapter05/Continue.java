//continue快速入门
//1) continue 语句用于结束本次循环，继续执行下一次循环。
//2) continue 语句出现在多层嵌套的循环语句体中时，可以通过标签指明
//要跳过的是哪一层循环 , 这个和前面的标签的使用的规则一样
public class Continue {
	//定义一个main方法
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.println("i=" + i);
		}
	}
}