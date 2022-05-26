
public class Dowhile_plus {

	public static void main(String[] args) {
		// do while : 30 - 35 까지 합계치를 출력 

		int a = 30, sum= 0;
		do {
			sum+=a;
			a++;
		}while(a<=35);
		System.out.println(sum);
		
		/* 
		 	합이 189 . 189에서  1~10까지 합계치를 뺀 총 합계
		 
		 */
		
		int sumb = 189;
		int b = 1;
		do {
			sumb -= b;
			b++;
		}while(b<11);
		System.out.println(sumb);
	
		
		
	}
	

}
