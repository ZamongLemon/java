import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ����ڰ� �� 3���� ���ڸ� �Է�
		 * 3���� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		 */
		
		Scanner scan_num = new Scanner(System.in);
		int a=0;
		long ans=1;//long �� �Է½� ���� ������� - �� ������ ���
		long temp;
		do {
			System.out.println("���ڸ� �Է��ϼ���.");
			temp= scan_num.nextInt();
			ans *=temp;
			a++;
		}while(a<3);
		System.out.println("���� �� : "+ans);
		scan_num.close();
	}
	

}
