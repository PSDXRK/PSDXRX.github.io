//细节演示
public class ContinueDetail {
	//定义一个main方法
	public static void main(String[] args) {
		lable1:
		for(int i = 0; i < 4; i++) {//其中 i j 只在当前循环域被定义，在循环外可以再次定义
			lable2:
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					continue;//结束本次循环，继续执行 lable2 层循环
					//continue lable1;//等价于break;
				}
				System.out.println("j=" + j);
			}
		}
		//输出0-9（除了2）四次
		lable3:
		for(int i = 0; i < 4; i++) {
			lable4:
			for(int j = 0; j < 10; j++) {
				if(j == 2) {
					break;//结束本层 lable4 循环，之后执行 lable3 层循环
				}
				System.out.println("j=" + j);
			}
		}
		//输出01四次
	}
}