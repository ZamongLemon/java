import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner scan_int = new Scanner(System.in);
		System.out.println("구구단 숫자를 하나 입력하세요.");
		int num = scan_int.nextInt();
		
		if(num <0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
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
