import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 사용자가 총 3번의 숫자를 입력
		 * 3개의 숫자를 모두 곱하여 총 합계 수를 출력하시오.
		 */
		
		Scanner scan_num = new Scanner(System.in);
		int a=0;
		long ans=1;//long 을 입력시 최종 결과에서 - 가 나오는 경우
		long temp;
		do {
			System.out.println("숫자를 입력하세요.");
			temp= scan_num.nextInt();
			ans *=temp;
			a++;
		}while(a<3);
		System.out.println("곱한 수 : "+ans);
		scan_num.close();
	}
	

}
