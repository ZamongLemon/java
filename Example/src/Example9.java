import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 	���빮�� 9
		 	A�л��� ���� ������ �Է¹ް� ��������� ������ ���α׷��� �����մϴ�.
		 	"������ �Է��ϼ���."��� ������ �� 5���� ������ �Ǹ�, ��� ������ �ջ��Ͽ� ����մϴ�.
		 */
		/*Scanner scan_point = new Scanner(System.in);
		
		int e=0,sum=0;
		do {
			System.out.println("������ �Է��ϼ���.");
			sum+= scan_point.nextInt();
			e++;
		}while(e<5);
		System.out.println("���� �հ� : "+sum);*/
		
		/*�߰�. �ջ� �� ������ ���� ��հ��� ����Ͻÿ�.
		 	   "�ش� ������ ������ : "�̶�� ���.
		 	   ���� 40�� ���� : "���հ��Դϴ�."���.
		 	   ���� 40�� �̻� : "�հ��Դϴ�." ���.*/
		
		/*Scanner scan_point = new Scanner(System.in);
		
		int e=0,sum=0;
		do {
			System.out.println("������ �Է��ϼ���.");
			sum+= scan_point.nextInt();
			e++;
			
		}while(e<5);
		System.out.println("���� �հ� : "+sum);
		if(sum/5 > 40){
			System.out.println("��������� : " + sum/5 + "�Դϴ�. �հ��Դϴ�.");
			
		}else if(sum/5 < 40) {
			System.out.println("��������� : " + sum/5 + "�Դϴ�. ���հ��Դϴ�.");
			
		}*/
		/*�߰�."�Է��Ͻ� ���� ���� �����ּ��� : "��� �����,
		 	  �Է��� �������ŭ �ݸ��� ����Ǹ�, ��հ��� ������� �ݿ��Ǿ�� �Ѵ�.
		 */
		Scanner scan_point = new Scanner(System.in);
		System.out.println("�Է��Ͻ� ���� ���� �����ּ��� :");
		int c = scan_point.nextInt();
		
		int e=0,sum=0;
		do {
			System.out.println("������ �Է��ϼ���.");
			sum+= scan_point.nextInt();
			e++;
			
		}while(e<c);
		System.out.println("���� �հ� : "+sum);
		if(sum/c > 40){
			System.out.println("��������� : " + sum/c + "�Դϴ�. �հ��Դϴ�.");
			
		}else if(sum/c < 40) {
			System.out.println("��������� : " + sum/c + "�Դϴ�. ���հ��Դϴ�.");
			
		}
		
		scan_point.close();
	}

}
