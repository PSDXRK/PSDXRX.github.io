//控制结构作业
/*
1.某人有100000元，没经过一个路口，需要缴费，规则如下
1）当现金>50000时，每次交5%
2）当现金<=50000时，每次交1000
编程计算该人可以经过多少次路口
 */
public class Homework01 {
	//定义一个main方法
	public static void main(String[] args) {
		//方法一（自己写的）
		double cash = 100000;
		int num = 0;
		while(cash > 50000) {
			cash = cash*0.95;
			num++;
		}
		while(cash <=50000){
			if(cash < 1000){
				break;
			}
			cash = cash - 1000;
			num++;
		}
		System.out.println("100000元钱能过" + num + "次路口");
		System.out.println("你还剩" + cash + "元钱");

		//方法二
		double money = 100000;
		int count = 0;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				count++;
			}else if(money >=1000) {
				money -= 1000;
				count++;
			}else {
				break;
			}
		}
		System.out.println("100000元钱能过" + count + "次路口");
		System.out.println("你还剩" + money + "元钱");
	}
}