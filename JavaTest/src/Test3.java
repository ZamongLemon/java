import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan_int = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan_int.nextInt();
		String msg = "";
		if(num > 60 ) {
			msg = "�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.";
		}else {
			if(num%2 ==0) {
				msg = "�ش� ���ڴ� ¦���Դϴ�.";
			}else {
				msg = "�ش� ���ڴ� Ȧ���Դϴ�.";
			}
		}
		System.out.println(msg);
		scan_int.close();
	}
}
