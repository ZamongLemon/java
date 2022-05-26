import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		/* 
		 	응용문제 총 2번의 질문을 하게 됩니다. 
		 	사용자가 숫자를 입력하여 두 수의 합을 구하는 Scanner 제작
		 */

		Scanner scan_num = new Scanner(System.in);
		int e =0;
		int sum = 0;
		while(e<=1) {
			System.out.println("숫자를 입력하세요.");
			sum+= scan_num.nextInt();
			e++;
		}
		System.out.println("합 : "+sum);
		scan_num.close();
	}

}
