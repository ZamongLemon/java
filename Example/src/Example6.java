import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 	2�� �迭�̸�, 2���迭 �����ʹ� ������ �����ϴ�.
		 	user_list : {"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 	user_point : {"3000","1000","25000","19800","5750","5630","0"};
		 	���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���".
		 	�Է��� ���� ������ class �� �����Ͽ� �ش� method ������ ���� �� ���
		 */
		Scanner scan_name = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���.");
		String user_name = scan_name.next();
		getData getD = new getData();
		getD.findPoint(user_name);
		scan_name.close();
		getD=null;
	}

}
class getData{
	String[][] user_data = {{"ȫ�浿","�̼���","������","������","�������","������","����屺"},
			{"3000","1000","25000","19800","5750","5630","0"}};
	
	void findPoint(String name) {
		String msg ="";
		boolean a = false;
		for(int i = 0 ; i< user_data[0].length;i++ ) {
			if(name.equals(user_data[0][i])) {
				msg = name+"������ ����Ʈ�� : "+user_data[1][i]+"�Դϴ�.";
				a=true;
				break;
			}
		}
		if(!a) {
			msg = "���������ʴ� �����Դϴ�.";
		}
		System.out.println(msg);
	}
}
