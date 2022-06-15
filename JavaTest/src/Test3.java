import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan_int = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan_int.nextInt();
		String msg = "";
		if(num > 60 ) {
			msg = "해당 숫자는 60까지만 입력이 되어야 합니다.";
		}else {
			if(num%2 ==0) {
				msg = "해당 숫자는 짝수입니다.";
			}else {
				msg = "해당 숫자는 홀수입니다.";
			}
		}
		System.out.println(msg);
		scan_int.close();
	}
}
