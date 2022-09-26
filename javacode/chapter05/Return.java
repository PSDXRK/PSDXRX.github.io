//return 快速入门
//当return用在方法时，表示跳出方法，用在main方法时，表示退出程序
public class Return {
	//定义一个main方法
	public static void main(String[] args) {
		//break
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("何辉凡学习" + i);
				break;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
		System.out.println("======================");
		//continue
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("何辉凡学习" + i);
				continue;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
		System.out.println("======================");
		//return
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("何辉凡学习" + i);
				return;
			}
			System.out.println("hello world");
		}
		System.out.println("go on");
	}
}