/*�Լ��뷨

import java.util.Scanner;
public class HomeWork03 {
	//��дһ��main����
	public static void main(String[] args) {
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("��������ļ۸�");
		int price = myScanneer.nextInt();
		Book book = new Book();
		System.out.println("���ĺ����۸�Ϊ��" + book.updatePrice(price));
	}
}
//��Ŀ����д��Book�����巽��updatePrice,����ĳ����ļ۸񣬾��壺
//     ����۸� > 150�������Ϊ150������۸� > 100�����Ϊ100�����򲻱�
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
//��ʦ����
public class HomeWork03 {
	//��дһ��main����
	public static void main(String[] args) {
		Book b = new Book("�ǺӴ��", 200);
		b.info();
		b.updatePrice();//���¼۸�
		System.out.println("===============���º�==========");
		b.info();
	}
}
//��Ŀ����д��Book�����巽��updatePrice,����ĳ����ļ۸񣬾��壺
//     ����۸� > 150�������Ϊ150������۸� > 100�����Ϊ100�����򲻱�
/*
	������
	1.���� Book
	2.���� price, name
	3.������ updatePrice
	4.�β� ����
	5.����ֵ void
	6.�ṩһ��������
 */
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		//��������У�û��price�ֲ�������this.price�ȼ�price
		if(price > 150) {
			price = 150;
		} else if(price > 100 && price <=150) {
			price =100;
		}
	}
	//��ʾ�鼮���
	public void info() {
		System.out.println("����=" + this.name + "\t�۸�=" + this.price);
	}
}