import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		  ���빮�� 3
		  ����ڰ� �ش� ���� �Է� ��, ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� 
		  ù��° ���ڿ� �ι�° ���� ���� ���� ��� ���ڸ� ���ؼ� ������� �������� ����		
		  �ش� �ڵ�� do while������ �ۼ�  
		*/
		Scanner scan_num = new Scanner(System.in);
		System.out.println("ù��° ����");
		int a=scan_num.nextInt();
		System.out.println("�ι�° ����");
		int b=scan_num.nextInt();

		int sum = 0;
		do {
			sum+=a;
			a++;			
		}while(a<=b);
		
		System.out.printf("���� : %d",sum);
		scan_num.close();

	}

}
