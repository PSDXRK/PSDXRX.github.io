//练习
public class Text {
	//编写一个main方法
	public static void main(String[] args) {
		//text1 逻辑与
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6) {
			//x先赋值为5和6进行比较，再自增为6
			//y先自增为6，再和6进行比较
			//所以为：5==6 & 6==6，即false & true => false
			x = 11;
		}
		System.out.println("x=" + x + " y=" + y);//6 6

		//text2 短路与
		int a = 5;
		int b = 5;
		if(a++ == 6 && ++b == 6) {
			//x先赋值为5和6进行比较，再自增为6
			//显然a++ == 6 -->false,因为是短路与，
			//所以&&后面不再进行判断和执行
			a = 11;
		}
		System.out.println("a=" + a + " b=" + b);//6 5

		//text3 逻辑或
		int q = 5;
		int w = 5;
		if(q++ == 5 | ++w == 5) {
			//q先赋值为5和5进行比较，再自增为6
			//w先自增为6，再和5进行比较
			//所以是5==5 | 6==6，即true | false -->true
			q = 11;

		}
		System.out.println("q=" + q + " w=" + w);//11 6

		//text4 短路或
		int r = 5;
		int t = 5;
		if(r++ == 5 || ++t == 5) {
			//r先赋值为5和5进行比较，再自增为6
			//显然r++ == 5 -->true,因为是短路或，
			//所以||后面不再进行判断和执行
			r = 11;

		}
		System.out.println("r=" + r + " t=" + t);//11 5

		//text5 复合题
		boolean c = true;
		boolean d = false;
		short z = 46;
		if((z++ == 46) && (d = true)) z++;
		if((c = false) || (++z == 49)) z++;
		System.out.println("z=" + z);//50



	}
}