import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		// ��ĳ�ʿ� �Բ� do while ������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷� �ۼ�
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("���ϴ� ������ �ܼ��� �Է��ϼ���.");
		int num = scan_num.nextInt();
		
		short i = 1;
		do {
			System.out.printf("%d ",i*num);	
			i++;
		}while(i <10);

		scan_num.close();
	}

}
