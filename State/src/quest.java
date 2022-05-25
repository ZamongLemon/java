import java.util.Scanner;

public class quest {

	public static void main(String[] args) {
		// 사용자가 입력하여 조건에 맞는 메시지를 출력
		// 첫번째 숫자값을 입력
		// 두번째 숫자값을 입력
		// 첫번째 숫자값 * 두번째 숫자값 <100 일때 "100미만의 결과값입니다." 100 >= "해당 값은 100이상 입니다."
		Scanner scan_num1 = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scan_num1.nextInt();

		Scanner scan_num2 = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan_num2.nextInt();

		int answer = num1 * num2;

		if (answer < 100) {
			System.out.println("해당값은 100 미만입니다.");
		} else {
			System.out.println("해당값은 100 이상입니다.");
		}

		scan_num1.close();
		scan_num2.close();
	}

}
