import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	���빮��8 
		 	PW = a1234
		 	����ڰ� PW�� �Է�, 3ȸ�̻� ���н� 
		 	"�н����� Ƚ���������� ����� ������ �湮�ϼž��մϴ�." ���
		 	��, �н����尡 ������� "�α��� �Ǿ����ϴ�.��� ��µǾ�� �մϴ�.
		*/
		String pw= "a1234",getPW="";
		Scanner scan_pw = new Scanner(System.in);
		boolean log = false;
		for(int i = 0 ; i < 3; i++) {
			System.out.println("�н����带 �Է��ϼ���.");
			getPW= scan_pw.next();
			
			if(getPW.equals(pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				log = true;
				break;
			}
			
		}
		
		if(!log) {
			System.out.println("�н����� Ƚ���������� ����� ������ �湮�ϼž� �մϴ�.");
		}
		scan_pw.close();

	}

}
