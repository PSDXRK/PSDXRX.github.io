//编程，保存两本书名，用 + 拼接，看效果。保存两个性别，用加号拼接看效果
//保存两本书的价格，用加号拼接，看效果
public class Homework03 {
	//编写一个main方法
	public static void main(String[] args) {
		//编程，保存两本书名，用 + 拼接，看效果
		String book1 = "《哈利波特》";
		String book2 = "《龙族》";
		String s3 = book1 + book2;
		System.out.println(s3);

		//保存两个性别，用加号拼接看效果
		//性别是单个字符 应该用char保存
		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2);//得到 男 字符码值 + 女 字符码值
		String s1 = c1 + "";
		String s2 = c2 + "";
		String gender = s1 + s2;
		System.out.println(gender);

		//保存两本书的价格，用加号拼接，看效果
		double price1 = 20.50;
		double price2 = 30.98;
		System.out.println(price1 + price2);


	}
}