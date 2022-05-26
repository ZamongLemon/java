
public class For1 {

	public static void main(String[] args) {
		/*
		 * 구구단 2~3단 출력
		*/
		/*
		int f=2,ff;//반복문에 사용할 변수선언을 미리 하였음
		for ( f = 2 ; f <4 ;f++ ) { //큰 반복문 2~3까지 
			for( ff = 1 ; ff<10 ; ff++) {//작은 반복문 1~9까지
				System.out.println(f+ " * " + ff + " = " + f*ff ); //작은 반복문이 작동할때마다 출력
			}
		
			System.out.println("==============");
		}
		*/
		/* 응용문제
		 * 구구단 5~7단까지 출력을 하되 4까지만 연속적으로 나오는 수식구를 출력하시오
		 * 5*1 ~ 7*4
		 * 해당결과값의 총 합계
		 */
		int sum = 0;
		for ( int i  = 5 ; i <8 ;i++ ) { 
			for( int j = 1 ; j<5 ; j++) {
				System.out.println(i+ " * " + j + " = " + i*j ); 
				sum+=i*j;
			}
		
			System.out.println("==============");
		}
		System.out.println("총 합계 : "+sum);
		System.out.println("==============");
		
	}

}
