public class CharDetail {

	//编写一个main方法
	public static void main(String[] args) {

		//在Java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		//要输出对应的数字，可以 (int)字符
		char c1 = 97;
		System.out.println(c1);//输出a，因为 a 对应的Unicode就是97

		char c2 = 'a';
		System.out.println((int)c2);//输出 a 对应的 数字，即97

		char c3 = '何';
		System.out.println((int)c3);//输出 何 对应的数字，即20309

		char c4 = 20309;
		System.out.println(c4);//输出 何 ，因为 何 对应的Unicode码是20309

		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码。
		
		System.out.println('a' + 10);//输出 a 的Unicode码 97再加上10，即97+10=107，输出107

		//课堂小测试
		char c5 = 'b' + 1;//98+1==> 99
		System.out.println((int)c5);//99
		System.out.println(c5);//99->对应的字符->ASCII编码表(规定好的)==> c


	}
}