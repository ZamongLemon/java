import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scan_int = new Scanner(System.in);
		System.out.println("������ ���ڸ� �ϳ� �Է��ϼ���.");
		int num = scan_int.nextInt();
		
		if(num <0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
		}else {
			int i = 1;
			do {
				System.out.println(num+"*"+i+"="+num*i);
				i++;
			}while(i < 10);
		}
		
		scan_int.close();
	}
}
