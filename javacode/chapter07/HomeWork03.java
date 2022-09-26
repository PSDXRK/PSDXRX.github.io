/*自己想法

import java.util.Scanner;
public class HomeWork03 {
	//编写一个main方法
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("请输入书的价格");
		int price = myScanneer.nextInt();
		Book book = new Book();
		System.out.println("更改后的书价格为：" + book.updatePrice(price));
	}
}
//题目：编写类Book，定义方法updatePrice,更改某本书的价格，具体：
//     如果价格 > 150，则更改为150，如果价格 > 100则更改为100，否则不变
class Book {
	public int updatePrice(int price) {
		if(price > 100 && price <=150) {
			price = 100;
			return price;
		} else if(price > 150) {
			price = 150;
			return price;
		}else{
			return price;
		}
	}
}
*/
//老师方法
public class HomeWork03 {
	//编写一个main方法
	public static void main(String[] args) {
		Book b = new Book("星河大帝", 200);
		b.info();
		b.updatePrice();//更新价格
		System.out.println("===============更新后==========");
		b.info();
	}
}
//题目：编写类Book，定义方法updatePrice,更改某本书的价格，具体：
//     如果价格 > 150，则更改为150，如果价格 > 100则更改为100，否则不变
/*
	分析：
	1.类名 Book
	2.属性 price, name
	3.方法名 updatePrice
	4.形参 （）
	5.返回值 void
	6.提供一个构造器
 */
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		//如果方法中，没有price局部变量，this.price等价price
		if(price > 150) {
			price = 150;
		} else if(price > 100 && price <=150) {
			price =100;
		}
	}
	//显示书籍情况
	public void info() {
		System.out.println("书名=" + this.name + "\t价格=" + this.price);
	}
}