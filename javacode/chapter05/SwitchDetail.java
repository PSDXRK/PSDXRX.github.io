//switch ע��ϸ��
public class SwitchDetail {
	public static void main(String[] args) {
		//ϸ��1;
		//���ʽ�������ͣ�Ӧ�ú�case��ĳ�������һ��
		//�����ǿ����Զ�ת���ɿ����໥�Ƚϵ����ͣ�������������ַ�����������int
		
		char c = 'a';
		switch(c) {
			case 'a':
				System.out.println("ok1");
				break;
			case 'b':
				System.out.println("ok2");
				break;
			//case "hello";//�������Ͳ�ƥ�����޷��Զ�ת��
			case 20://�Եģ�char�����Զ�ת����Int 
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");

		}

		//ϸ��2��
		// switch(���ʽ)�б��ʽ�ķ���ֵ�����ǣ�
		// ��byte,short,int,char,enum[ö��]��String��
		
		//double d = 1.1;
		//switch(d) { //���󣬱��ʽ����ֵΪdouble
		//	case 1.1 :
		//		System.out.println("ok1");
		//	}
		//	
		

		//ϸ��3��
		//case�־��е�ֵ�����ǳ�����1��'a'�Ⱦ���ֵ�����߳������ʽ�����ʻ��ǳ���
		//�������Ǳ���
		char f = 'a';
		char c2 = 'c';
		switch(f) {
			case 'a' :
				System.out.println("ok1");
				break;
			//case c2 ://����.c2 �Ǳ�����c���ǳ���
			case 'c' ://�Եģ�c�ǳ���
				System.out.println("ok2");
				break;
			case 'c' + 1://�Եģ��������ʽ���ʻ��ǳ���
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");

		}


		//ϸ��4��
		//default�Ӿ��ǿ�ѡ�ģ���д�ɲ�д������û��ƥ���caseʱ��ִ��default
		//���û��default�Ӿ䣬��û��ƥ���κγ�������û�����
		


		//ϸ��5��
		//break�������ִ����һ��case��֧��ʹ��������switch���飻
		//���û��дbreak,�����˳��ִ�е�switch��β,��������break;
		char e = 'a';
		switch(c) {
			case 'a':
				System.out.println("ok1");
			case 'b':
				System.out.println("ok2");
			case 20://�Եģ�char�����Զ�ת����Int 
				System.out.println("ok3");
				break;
			default :
				System.out.println("ok4");


		}//���ok1 ok2 ok3
		System.out.println("�˳�switch,�������ִ��");

	}
}