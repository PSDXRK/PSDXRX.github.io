public class Char01 {

	//编写一个main方法
	public static void main(String[] args) {
		//字符类型可以表示单个字符，
		//char是两个字节，可以存放汉字。多个字符我们用字符串string
		String name = "King";//多字符用string,要用""而不是''
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c5 = '9';
		char c4 = 97;//说明：字符类型可以直接存放一个数字
		//修改快捷键  Ctrl + d 可快速复制光标所在行并粘贴到下一行
		//Ctrl+shift+k 可快速删除整行
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//当输出c4的时候，会输出97表示的字符 =>编码的概念
		System.out.println(c5);
		System.out.println(name);


	}
}