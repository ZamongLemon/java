import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		/*
		Scanner scan_id = new Scanner(System.in);
		System.out.println("ID�� �Է��ϼ���.");
		String id = scan_id.next();// id �Է�
		
		Scanner scan_pass = new Scanner(System.in);
		System.out.println("PW�� �Է��ϼ���.");
		String pw = scan_pass.next();// pw�Է�
		
		scan_id.close();
		scan_pass.close();
		*/
		//ȸ������ ���̵�� jung,su
		//�н����� jung - j1234 , su - ssh
		//�ش� ���̵� ���� �������� "���Ե��� ���� ����� �Դϴ�." ���
		//PW�� Ʋ����� "ȸ�������� �ٽ� Ȯ���ϼ���."
		//������� "�α��� �Ǽ̽��ϴ�."
		
		Scanner scan_id = new Scanner(System.in);
		System.out.println("ID�� �Է��ϼ���.");
		String id = scan_id.next();
		
		Scanner scan_pw = new Scanner(System.in);
		System.out.println("PW�� �Է��ϼ���.");
		String pw = scan_pw.next();
		
		if(!id.equals("jung") && !id.equals("su")) {
			System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}else {
			if(id.equals("jung") && pw.equals("j1234")) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}else if (id.equals("su") && pw.equals("ssh")){
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}else{
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
			}				
						
		}
		scan_id.close();
		scan_pw.close();
	}

}
