public class HomeWork01 {
	//编写一个main方法
	public static void main(String[] args) {
		double[] arry = {1.2,3.6,6.7,9.0,2.5,-2,5};
		A01 a = new A01();
		Double res = a.max(arry);
		if(res != null) {
			System.out.println("arry的最大值为： " + a.max(arry));
		} else {
			System.out.println("arry的输入有误,数组不能为null，或{}");
		}
	}
}
//编写类A01，定义方法max,实现求某个double数组的最大值，并返回
class A01 {
	public Double max(double[] arry) {
		//保证arry至少有一个元素,或者不为null
		if(arry != null && arry.length > 0) {
			double max = arry[0];
			for(int i = 1; i < arry.length; i++) {
				if(arry[i] > max) {
					max = arry[i];
				}
			}
			return max;
		} else {
			return null;
		}
	}
}