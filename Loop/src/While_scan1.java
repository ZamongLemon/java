import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* 
		 	���빮�� �� 2���� ������ �ϰ� �˴ϴ�. 
		 	����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� Scanner ����
		 */

		Scanner scan_num = new Scanner(System.in);
		int e =0;
		int sum = 0;
		while(e<=1) {
			System.out.println("���ڸ� �Է��ϼ���.");
			sum+= scan_num.nextInt();
			e++;
		}
		System.out.println("�� : "+sum);
		scan_num.close();
	}

}
