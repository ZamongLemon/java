import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan_text = new Scanner(System.in);
		System.out.println("on 혹은 off 를 입력해주세요.");
		String onoff = scan_text.next();
	
		if(onoff.equals("on")) {
			System.out.println("true");
		}else if(onoff.equals("off")) {
			System.out.println("false");
		}
		scan_text.close();
	}
}
