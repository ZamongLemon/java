import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		  응용문제 3
		  사용자가 해당 값을 입력 단, 사용자가 두개의 숫자를 입력하되 
		  첫번째 숫자와 두번째 숫자 범위 안의 모든 숫자를 더해서 결과값이 나오도록 제작		
		  해당 코드는 do while문으로 작성  
		*/
		Scanner scan_num = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int a=scan_num.nextInt();
		System.out.println("두번째 숫자");
		int b=scan_num.nextInt();

		int sum = 0;
		do {
			sum+=a;
			a++;			
		}while(a<=b);
		
		System.out.printf("합은 : %d",sum);
		scan_num.close();

	}

}
