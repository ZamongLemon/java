import java.util.Scanner;

public class Scan7 {
	public static void main(String[] args) {
		// "�������� ��ȣ�� �Է��ϼ���."
		// ���� 220524 ����ڰ� ���� 220524�ܿ� �Է½� "������ȣ�� Ʋ���ϴ�."��� ��� 
		// ������ ������ȣ ���ڸ� �Է� �� "����Ȯ�� �Ǽ̽��ϴ�."��� ����մϴ�.
		// �� 220524�� java����� ���� ���� ����Ǵ� ������ ó���ϼ���
		
		int sc = 220524;

		Scanner t = new Scanner(System.in);
		System.out.println("�������� ��ȣ�� �Է��ϼ���.");
		int num = t.nextInt();
		
		if(num == sc) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		}else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		
		t.close();
	}
}
