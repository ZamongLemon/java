
public class Datatype {

	public static void main(String[] args) {
		//String : ���� "" ������ ���
		
		// ������ �ڷ�� 
		String a = "1234" ;
		System.out.println(a);
		
		byte b = 127; //byte : -128 ~ 127
		System.out.println(b);
		
		short c = 32767; // short : -32,768 ~ 32767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long e = 999999999945699L; // long L ���� �⺻�޸��Ҵ翡�� �߰� ����� ������� �þ 
		System.out.println(e);

		// ������ ��
		// �Ǽ��� 
		float z =  3.5f; // 3.24234234+38 (f�� ����ؾ���)
		System.out.println(z);
		double k = 44.5178; // 1.784+308(d�� ��� /���� ���� )
		System.out.println(k);
	}

}
