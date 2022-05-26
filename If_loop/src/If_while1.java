public class If_while1 {

	public static void main(String[] args) {
		// while문으로 10~30까지 숫자 중에서 홀수값만 출력
		int n = 10;
		while (n < 31) {
			if (n % 2 == 1 && n >= 20) {
				System.out.printf("%d ", n);
			}
			n++;
		}

		System.out.println("\n-------------------------------------");

		// 카운터 값으로 갯수 파악
		// 1~ 10까지 숫자중 짝수의 개수를 카운팅
		int count = 0, m = 1;
		while (m <= 10) {// 카운터 변수값
			if (m % 2 == 0) {// 짝수일 경우
				count++; // 조건이 맞으면 1씩 증가
			}
			m++;
		}
		// 반복문 종료시 값 출력
		System.out.println("1~10중 짝수의 갯수는 : " + count);

		System.out.println("\n-------------------------------------");

	}



}
