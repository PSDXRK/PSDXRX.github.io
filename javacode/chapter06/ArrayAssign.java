//���鸳ֵ����
//1) �����������͸�ֵ�����ֵ���Ǿ�������ݣ������໥��Ӱ��
//2) ������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ
public class ArrayAssign {
	//����һ��main����
	public static void main(String[] args) {
		//�����������͸�ֵ����ֵ��ʽΪֵ����
		//n2�ı仯������Ӱ�쵽n1��ֵ
		int n1 = 10;
		int n2 = n1;

		n2 = 90;
		System.out.println("n1=" + n1);//10
		System.out.println("n2=" + n2);//90

		//������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ����ֵ��ʽΪ���ø�ֵ
		//��һ����ַ��arr2�仯��Ӱ�쵽arr1
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;//��arr1����arr2
		arr2[0] = 10;

		//����arr1��ֵ
		System.out.println("======arr1��Ԫ��======");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");//10,2,3
		}
		System.out.println();
		System.out.println("======arr2��Ԫ��======");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");//10,2,3
		}
	}
}