
public class Example5 {

	public static void main(String[] args) {
		/*
		 	2���迭 + �⺻ Ŭ���� �޼ҵ� ����
		 	��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�.
		 	
		 	user_list : {"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 	user_level : {"gold","vip","guest","gold","vip","vip","guest"};	
		 *
		 */
		
		String[][] user_Data = {{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
				{"gold","vip","guest","gold","vip","vip","guest"}};				
		Example5 ex5 = new Example5();
		ex5.getVip(user_Data);
		ex5= null;

	}
	
	void getVip(String[][] data) {
		int i = 0;
		System.out.print("������ : ");
		do {
			if(data[1][i].equals("vip")) {
				System.out.printf("%s, ",data[0][i]);
			}
			i++;
		}while(i<data[0].length);
		
	}
}
