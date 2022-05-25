
public class For2 {
	public static void main(String[] args) {

		int a; // for문 초기값
//		int b = 2;// 연산에 사용할 변수		
//		int c;// 연산한 결과 값 사용
		for (a = 1; a < 10; a++) {
//			c = b * a; // 산술연산 작업
			// System.out.print(c+" "); // 연산된 결과값을 출력함

		}
		// 응용문제 결과값을 보고 코드를 작성하시오
		// 45 40 35 30 25 20

		for (int i = 9; i >= 4; i--) {
		//	System.out.print(i * 5 + ",");
		}
		//응용문제 결과값을 확인 후 코드를 작성하시오
		// 11,22,33,44,55,66,77,88,99
		
		for (int i = 1 ; i < 10 ; i++) {
//			System.out.print(i*11+",");
		}
		int j = 22;
		while(j>15) {
//			System.out.print(j+" ");
			j--;
		}
		
		int aa=1;
		int bb=10;
		while(aa<=bb) {
//			System.out.printf("%d ",aa);
			aa++;
		}
		
		//응용문제 변수 2개를 이용하여 범위에 맞게 값을 출력하시오
		//99~47
		
		int k = 99;
		while(k>=47) {
			System.out.printf("%d ",k);
			k--;
		}
	}
}
