import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		// ��ĳ�ʿ� �Բ� while ������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷� �ۼ�
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("���ϴ� ������ �ܼ��� �Է��ϼ���.");
		int num = scan_num.nextInt();
		
		short i = 1;
		while(i <10) {
			System.out.printf("%d ",i*num);	
			i++;
		}

		scan_num.close();

	}

}
