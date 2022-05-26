
public class If_dowhile1 {
	
	public static void main(String[] args) {
		/*
			응용문제 구구단 6단
		*/
		int n = 1;
		do {
			if(n*6 >= 35) {
				System.out.printf("%d ",n*6);
			}		
			n++;
		}while(n<10);

		System.out.println("\n-------------------------------------");
		
		// 응용문제 14 ~ 27 숫자중 짝수값만 더하여 최종 결과값 출력 
		int k = 14 ,sum=0;
		do {
			if(k%2==0) {
				sum+=k;
			}
			k++;
		}while(k<28);
		System.out.printf("%d ",sum);

		System.out.println("\n-------------------------------------");
		
		
	}

}
