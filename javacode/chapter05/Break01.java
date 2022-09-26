//break快速入门
//break 语句用于终止某个语句块的执行，
//一般使用在 switch 或者循环[for , while , do-while]
public class Break01 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i == 4) {
				break;//退出循环
			}
			System.out.println("i=" + i);
		}
		System.out.println("退出循环，继续执行~");
	}
}