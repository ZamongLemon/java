
public class Method2 {

	public static void main(String[] args) {
		
		// default package�� ����� �ش� class �� ȣ��
		// package�� �������� ��� ��ܿ� package�� ���� 
//		tests ts = new tests();
//		tests.a2++;
//		System.out.println(tests.a2);

		info i = new info();
		/*// error //
		System.out.println(info.data1(20));
		System.out.println(i.data2(20));	
		*/

		String result = i.data4("������");
		System.out.println(result); //data4 return ���� result ������ �޾Ƽ� ó�� 
				
	}
}

class info{
	public static void data1(int abc) {
		int z = abc + 20;
		System.out.println(z);
	}

	public void data2(int abc) {
		int z = abc + 20;
		System.out.println(z);

	}
	public int data3(int abc) {

		int z = abc + 20;
		return z;
	}
	
	public String data4(String abc) {
		
		String z = abc+"�� ȯ���մϴ�.";
		return z;
	}
}