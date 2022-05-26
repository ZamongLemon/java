
public class While_plus {

	public static void main(String[] args) {
		/*
		 	5~10까지 합계를 출력
		 */
		
		int a = 5,sum=0;// 초기값, 합계치 누적
		while(a<11) {
			sum += a;
			a++;
		}
		System.out.println(sum);
		
		// 3에서 8까지 곱한 수
		
		int b = 3 ,sumb=1;// 곱셈의 경우 1을 기본값
		while(b<9) {
			sumb *= b;
			b++;
		}
		System.out.println(sumb);
		
		
	}
}
