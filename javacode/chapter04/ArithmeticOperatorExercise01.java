//��ϰһ

public class ArithmeticOperatorExercise01 {
	//��дһ��main����
	public static void main(String[] args) {
		int i = 1;
		i = i++;//����ʹ����ʱ������(1) temp=i (2) i=i+1 (3) i=temp
		System.out.println("i=" + i);// 1

		int j = 1;
		j = ++j;//����ʹ����ʱ������(1) j=j+1 (2) temp=j (3) j=temp
		System.out.println("j=" + j);// 2

		//������ϰ
		int i1 = 10;
		int i2 = 20;
		int k = i1++;
		System.out.println("k=" + k);//10
		System.out.println("i2=" + i2);//20
		k = --i2;
		System.out.println("k=" + k);//19
		System.out.println("i2=" + i2);//19



	}
}