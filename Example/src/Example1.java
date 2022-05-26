import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		   응용문제 
		   while문으로 코드를 작성하며 , 프로세서는 다음과 같습니다.
		   사용자가 상품을 전체 선택하였습니다.
		   첫번째 질문은 "7000 결제하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면 최종결제금액에 추가됨
		   2라고 입력시 최종 결제금액에 추가되지 않음
		   총 질문횟수 4번 마지막에 최종 결제금액이 나오도록 코드작성
		 */
		
		Scanner scan_num = new Scanner(System.in);
		int temp,sum=0,i=0;
		while(i<4) {
			System.out.println("7000 결제하시겠습니까?");
			temp = scan_num.nextInt();
			if(temp ==1) 
			{
				sum+=7000;
			}
			i++;			
		}
		System.out.println("최종 결제금액 : " + sum);
		
		scan_num.close();

	}

}
