public class HomeWork01 {
	//��дһ��main����
	public static void main(String[] args) {
		double[] arry = {1.2,3.6,6.7,9.0,2.5,-2,5};
		A01 a = new A01();
		Double res = a.max(arry);
		if(res != null) {
			System.out.println("arry�����ֵΪ�� " + a.max(arry));
		} else {
			System.out.println("arry����������,���鲻��Ϊnull����{}");
		}
	}
}
//��д��A01�����巽��max,ʵ����ĳ��double��������ֵ��������
class A01 {
	public Double max(double[] arry) {
		//��֤arry������һ��Ԫ��,���߲�Ϊnull
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