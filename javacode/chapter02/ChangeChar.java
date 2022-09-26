//演示转义字符的使用
public class ChangeChar {

	//编写一个main方法
	public static void main(String[] args) {
		//  \t:一个制表位，实现对齐的功能
		System.out.println("北京\t天京\t上海");
		//  \n:换行符
		System.out.println("北京\n天京\n上海");
		//  \\:一个\
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		//  \\\\:两个\，即\\
		System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
        //  \":一个"
        System.out.println("老韩说：\"要好好学习java，有前途\"");
	    //  \':一个'
	    System.out.println("老韩说：\'要好好学习java，有前途\'");
	    //  \r:一个回车 (不是换行)
	    //  解读：
	    //  1.输出 何辉凡学习
	    //  2. \r表示回车，将学习后面的字调转到何那个位置并取代所在位置 
	    System.out.println("何辉凡学习\r帅气");// 帅气凡学习
	    System.out.println("何辉凡学习\r\n帅气");//帅气 何辉凡学习
	    //练习题
	    System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}