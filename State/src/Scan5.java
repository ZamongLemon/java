import java.util.Scanner;

public class Scan5 {
	public static void main(String[] args) {
		byte a = 20;
		if (a < 10) {
			System.out.println("10 이상의 숫자를 입력하세요");
		} else if (a >= 10 && a <= 22) { // 조건문에 범위를 설정
			System.out.println("당첨입니다.");
		} else {
			System.out.println("범위 밖의 숫자입니다.");
		}

		// 1~45까지 숫자 하나를 입력하세요
		// 0을 입력 : 숫자입력이 잘못 되었습니다.
		// 45보다 큰 숫자 입력 : 숫자는 1~45까지만 입력 가능합니다.

		Scanner t = new Scanner(System.in);
		System.out.println("1~45사이의 숫자 하나를 입력하세요.");
		int n = t.nextInt();

		if (n <= 0) {
			System.out.println("숫자 입력이 잘못되었습니다.");
		} else if (n>45){
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		} else {
			if (n == 7 || n == 12 || n == 14) {
				System.out.println("당첨입니다.");
			} else {
				System.out.printf("다음기회에 참여하세요.");
			}
		} 

		t.close();
	}

}
