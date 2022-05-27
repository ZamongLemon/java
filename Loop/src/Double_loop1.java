import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY-M-dd");
		System.out.println(date.format(today));
		SimpleDateFormat time = new SimpleDateFormat("hh:m:ss a");
		System.out.println(time.format(today));
		
		//format: 규격화된 형태로 값을 표현할때 사용하게 됩니다.
		
		//응용문제 
		/*
		 * 3개의 상품
		 	바코드로 상품을 입력시켜 주세요. 금액을 입력 "할인%를 입력해주세요:" 라는 문구와 함께 
		 	해당 할인 숫자를 입력하면 최종금액이 변경되어 출력되도록 합니다.
		  
		*/
		double money=0 ;
		Scanner scan_num = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("상품가격을 입력해주세요.");
			money+=(double)scan_num.nextInt();
		}
		System.out.printf("총 상품가격 : %.0f 원입니다.\n",money);
		System.out.println("할인 %를 입력해주세요: ");
		double discount = scan_num.nextInt();
		discount = 1-discount/100; 
		money *= discount;
		
		System.out.printf("최종금액 %.0f 원입니다.",money);
		
		
	}

}
