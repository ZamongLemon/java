
public class If_for {

	public static void main(String[] args) {
//		final int a = 1; // final 을 사용시 변수> 상수로 변경
//		System.out.println(a);
//		final String name = "홍길동";
//		System.out.println(name);

		final int ct = 15; // 고정값
		int f; // 반복문
		boolean ok = false; // 조건에 대한 true, false로 구분
		for (f = 1; f < 11; f++) {
			if (f == ct) {// 반복문 값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인 됩니다.");
				ok = true; // 조건에 대한 값을 변경합니다.
			}
		}
		if (!ok) {// 반복문이 끝났음에도 조건이 만족되지 않는경우 메시지를 출력하는 코드
			System.out.println("확인되지 않는 숫자입니다.");
		}
		/*
		 * 총 20번의 값을 반복 그중 홀수값만 출력
		 */
		System.out.println("----------------------------------------------");
		String odd = "", even = "";
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 1) {//만약에 홀수 값일 경우 odd 변수에 지속적으로 값을 추가하게 됩니다.
				odd += i + " "; // 추가할경우 " " 빈공간을 활용하여 정리 
			} else { 
				even += i + " ";
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
