
public class If_for2 {
	
	public static void main(String[] args) {
		// 1~100 중 80이상만 출력
		
		for(int i = 1 ; i<101 ; i ++) {
			if(i>=80) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n-------------------------------------");
		
		//200~300 까지의 숫자 중 240이하의 숫자만 출력
		
		for(int j = 200 ; j < 301 ; j++) {
			if(j<=240) {
				System.out.print(j+" ");
			}
		}

		System.out.println("\n-------------------------------------");

		final int a= 3;
		int w;
		for(w = 1 ; w<11;w++) {
			if(w%a==0) {
				System.out.printf("%d ",w);
			}
			
		}
		
		System.out.println("\n-------------------------------------");
		//응용문제 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10이상 숫자만 출력합니다.
		final int t = 2;
		int p = 0;
		for (int k = 1 ; k<10 ; k++ ) {
			p = k*t;
			if(p>=10) {
				System.out.printf("%d ",p);
			}
		}
		
		/*
		 * 다음 결과값을 보고 해당 값이 출력 되도록 코드를 제작하시오
		 * 
		 *  18 36 54 72
		 */
		System.out.println("\n-------------------------------------");
		
		for (int m = 1 ; m < 75 ; m++) {
			if(m%18==0) {
				System.out.printf("%d ",m);
			}
		}
		
		/*
		 	응용문제 다음 결과값을 보고 해당 값이 출력되도록 코드를 작성
		 	6 14 17 19
		 */
		System.out.println("\n-------------------------------------");
		
		for (int u = 1 ; u< 21 ; u++) {
			if(u==6 || u== 14 || u ==17 || u==19 ) {
				System.out.printf("%d ",u);
			}
		}
		
		
	}
}
