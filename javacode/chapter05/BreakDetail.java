//break相关细节
//1.break语句出现在多层嵌套的语句中出现时，可以通过标签指明要终止的是哪
//2.标签的基本使用
//lable1:{.....
//lable2:	{ ......
//lable3:		{ ......
//				  break;
//				}
//			}
//		 }
//解读
//break语句可以指定推出哪层
//lable1是标签，名字由程序员指定
//break后指定到哪个lable就退出哪个
//在实际开发中，尽量不要使用标签
//如果没有指定break默认退出最近的循环体
public class BreakDetail {
	public static void main(String[] args) {
		lable1:
		for(int j = 0; j < 4; j++) {
		lable2:
			for(int i = 0; i < 10; i++) {
				if(i==2) {
					//break;//等价break lable2
					break lable1;//退出lable1层循环
				}
				System.out.println("i=" + i);
			}
		}
	}
}