
public class Class3 {
	
	public static void main(String[] args) {
		//�ڷ��� (��������)
		
		// int -> double �� ��ȯ
		int c = 35;
		double d = (double)c;
		System.out.println(d);
		
		//String -> int 
		String x = "35";
		String x2 = "156";
//		int z = Integer.valueOf(x);//valueOf �޼ҵ�(�޼ҵ��Լ�) ->parseInt
		int total = Integer.parseInt(x) +Integer.parseInt(x2);
		System.out.println(total);
		//->�������� ���ڷ� ��ȯ�Ͽ� ������ ó��
		
		// long ���� long.parselong �����
		String j = "123456789";
		String j2 = "123456789";
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//����(char) -> ���� (String)
		char p = 'p';
		String f = String.valueOf(p);
		System.out.println(f);

	}

	
}
