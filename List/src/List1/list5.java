package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/* 사용자가 금액을 입력합니다.
			횟수는 8번
			0~n까지 입력가능
			해당 입력이 모두 끝나면 최종 합계를 출력 시키시오.
		
		*/
		Scanner scan_int = new Scanner(System.in);
		ArrayList<Integer> prices = new ArrayList<>();
		String price="";
		int sum=0;
		while(true) {//무한루프
	 		System.out.println("금액을 입력하세요");
	 		price = scan_int.next();
	 		try {	//사용자가 입력한 값에 오류가 있는지 확인하는 파트
	 		int num = Integer.parseInt(price);
	 		sum+=num;
	 		prices.add(num);	
	 		if(prices.size()==8) {break;} // 8개까지 입력되면 무한루프 빠져나옴
	 		}catch(Exception e){ // 오류가 발생하였을 경우 작동되는 파트
	 			System.out.println("해당 입력사항은 문자입니다.");	 		
	 		}
	 	}
		
		
		scan_int.close();
		System.out.println("총 입금액은 " +sum+ "원입니다.");
	}

}
