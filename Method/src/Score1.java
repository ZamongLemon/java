import java.util.Scanner;

public class Score1 {

	static String[] msg =
			{"�˻��� ������ �л����� �Է����ּ���.","�˻��� ������� �Է��ϼ���.[��ü,����,����,����,����]"};
	
	public static void main (String[] args) {

		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = text.next(); // �л��� �Է�
		sc.data(name,null); //Score2�� �޼ҵ�� ����� �� ���� ����
		
		String check =sc.gtdata();
		if(check.equals("true")) {
			System.out.println(msg[1]);
			String subject= text.next();//�����Է�
			sc.data(name,subject);
			String score = sc.gtdata();
			if(subject.equals("��ü")) {
				System.out.println("���� ���� ���� ���� ���� ������ " + score+ "�Դϴ�.");
				
			}else {
				System.out.println("���������� : " + subject + " " + score +"���Դϴ�." );
			}
		}else {
			System.out.println("�ش� ����ڴ� �������� �ʽ��ϴ�.");
			System.exit(0);;
		}
		
		text.close();
		
		System.gc();
	}
}
