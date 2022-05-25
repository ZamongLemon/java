
public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
			c=b*a; // 산술연산
			System.out.printf("%d ",c);
			a++;
		}
		System.out.println("");

		/* 응용문제
		 
		 	56 49 42 35 28 21
		 
		*/
		
		int t=7,u=8;
		while(u>2) {
			System.out.printf("%d,",u*t);
			u--;
		}
		System.out.println("");
		
		// 응용2
		// 다음 결과 값을 확인 하신후 해당 결과값에 맞는 코드를 작성하시오
		// 4,7,10,13,16,19,22,
		
		int w=1;
		while(w<8) {
			System.out.printf("%d,",1+3*w);
			w++;
		}
		
	}

}
