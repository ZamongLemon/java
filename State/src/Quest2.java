import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		System.out.println("1번 입력시 입금, 2번 입력시 출금 입니다.");
		Scanner i = new Scanner(System.in);
		int k = i.nextInt();

		int asset = 100000;
		if (k == 1) {
			System.out.println("입금할 금액을 입력하세요.");
			Scanner input = new Scanner(System.in);
			int c_input = input.nextInt();
			System.out.printf("잔액 %d 원 입니다.", asset + c_input);

			input.close();
		} else if (k == 2) {
			System.out.println("출금할 금액을 입력하세요.");
			Scanner output = new Scanner(System.in);
			int c_output = output.nextInt();
			if (asset >= c_output) {
				System.out.printf("잔액 %d 원 입니다.", asset - c_output);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
			
			output.close();
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		i.close();
	}

}
