import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();
		Member2 mb2 = new Member2(); //static�� ���� �Լ� �̹Ƿ� ��ü �� �ν��Ͻ��� ����
		mb2.lists(); //�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��
		
		Member2.list3("������",12346);
		
		/*
		 	���빮�� for_in��� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
		 	���α׷� ����� ������ ���� ������ �մϴ�.
		 	"����Ͻ� ������ ���� �ϳ��� �Է��� �ּ���."
		 	[���] - �ش� �޼ҵ忡�� ����� ����ؾ���
		 	���� ����ڰ� 3���� �Է½� 
		 	3*1=3 ... 3*9 =27 ���
		 */
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���� �ϳ��� �Է��� �ּ���");
		int n =scan_num.nextInt();
		multp.for_in(n);
		scan_num.close();
		
	}
	

}
class Member2{ 

	public void lists() { //�޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ����
		String a = "ȫ�浿";
		System.out.println(a);
	}
	public static void lists2() {
		String a = "�̼���";
		System.out.println(a);
	}
	public static void list3(String nm,int pw) {
		//nm�� �޼ҵ忡�� ���� �޴� ���� �ٷ� ����� ��� 
		String user_name= nm;
		int user_pw = pw; //�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���޹޴� ����
//		int user_point;
		if(user_name.equals("������")&& user_pw==123456){
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
		}else if(!user_name.equals("������")){
			System.out.println("��ȸ���Դϴ�.");
		}else if(user_pw!=123456) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}

	}
}
class multp{
	public static void for_in(int n) {
		System.out.println("============");
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(" "+ n + " * " + i + " = " + n*i);
		}
		System.out.println("============");
	}
	
}
