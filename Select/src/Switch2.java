import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		// ���빮�� ����ڰ� ������ ���� ������ �޽��ϴ�.
		// "1~5 �������� ���ڸ� �ϳ� �Է��� �ֽʽÿ�."
		// 1: 5�ۼ�Ʈ ���� 2: 10�ۼ�Ʈ ���� 3~4 : �ù�� ���� 5: ������ȸ��
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("1~5 �������� ���ڸ� �ϳ� �Է��� �ֽʽÿ�.");
		int num = scan_num.nextInt();
		/*
		switch(num) {
		
		case 1: 
			System.out.println("5�ۼ�Ʈ ����");
			break;
		case 2: 
			System.out.println("10�ۼ�Ʈ ����");
			break;
		case 3,4:
			System.out.println("�ù�� ����");
			break;
		case 5: 
			System.out.println("���� ��ȸ��");
			break;
		}
		*/
		// switch version up 
		String msg="";
		switch(num) {
		case 1 -> {
			msg ="5% ����";
		}
		case 2-> msg="10% ����";
		case 3,4-> msg ="�ù�� ����";
		case 5-> msg ="���� ��ȸ��";
		}
		System.out.println(msg);
		
		scan_num.close();
	
	}

}
