
public class Example7 {

	public static void main(String[] args) {
		/*
		  ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		  {"ȫ�浿","�հ�"},{"�̼���","�հ�"},{"������","���հ�"},{"������","�հ�"},{"������","���հ�"},{"�庸��","���հ�"};
		  ������ �迭 �����̸� �ش� ���� �հ��ڸ� ��µǵ��� �մϴ�.
		  �迭���� �ܺ� Ŭ���� ���� �޼ҵ忡�� ó���ǵ��� �մϴ�.
		 */
			passOrfail pf = new passOrfail();			
			pf.pass();
			pf = null;
	}
}

class passOrfail{
	String[][] data =
		{{"ȫ�浿","�հ�"},
		 {"�̼���","�հ�"},
		 {"������","���հ�"},
		 {"������","�հ�"},
		 {"������","���հ�"},
		 {"�庸��","���հ�"}};	
	void pass() {
		int i=0;
		System.out.print("�հ��ڴ� : ");
		while(i<data.length) {
			if(data[i][1].equals("�հ�")) {
				System.out.printf("%s " ,data[i][0]);
			}
			i++;
		}
		System.out.println("�Դϴ�.");		
	}
}

