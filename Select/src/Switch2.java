import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		// 응용문제 사용자가 다음과 같은 질문을 받습니다.
		// "1~5 번까지의 숫자를 하나 입력해 주십시오."
		// 1: 5퍼센트 할인 2: 10퍼센트 할인 3~4 : 택배비 무료 5: 다음기회에
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("1~5 번까지의 숫자를 하나 입력해 주십시오.");
		int num = scan_num.nextInt();
		/*
		switch(num) {
		
		case 1: 
			System.out.println("5퍼센트 할인");
			break;
		case 2: 
			System.out.println("10퍼센트 할인");
			break;
		case 3,4:
			System.out.println("택배비 무료");
			break;
		case 5: 
			System.out.println("다음 기회에");
			break;
		}
		*/
		// switch version up 
		String msg="";
		switch(num) {
		case 1 -> {
			msg ="5% 할인";
		}
		case 2-> msg="10% 할인";
		case 3,4-> msg ="택배비 무료";
		case 5-> msg ="다음 기회에";
		}
		System.out.println(msg);
		
		scan_num.close();
	
	}

}
