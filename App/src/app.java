
public class app {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c;
		// 사칙연산 기호 : + - * /
		// c= a+b;
		// c= a-b;
		// c= a*b;
		c = b / a;
		System.out.println(c);

		String a1 = "홍길동 ", b1 = "환영합니다";
		String c1;
		c1 = a1 + b1;
		// 문자 형태일때 +는 문자+문자열로 표현할 수 있습니다.
		System.out.println(c1);

		/*
		 * 응용문제 다음과 같이 출력되는 코드를 완성하시오. 홍길동님 적립금은 50000 입니다. 단, 홍길동과 50000의 값은 지속적으로 변화할
		 * 수 있습니다.
		 * 
		 */

		String name = "홍길동", s1 = "님 적립금은 ", s2 = " 입니다.";
		int cash = 50000;
		String answer = name + s1 + cash + s2;
		System.out.println(answer);

		/*
		 * 응용문제 아마존에서 상품을 구매했습니다. 장바구니에 담은 상품의 가격을 모두 더해서 총 결제금액이 출력되도록 하시오. 단, $ 환율로
		 * 출력되어야 합니다. 8.25,4.02,3.71
		 */

		float mer1 = 8.25f, mer2 = 4.02f, mer3 = 3.71f;
		float total = mer1 + mer2 + mer3;
		System.out.println("총 결제금액 $ " + String.format("%.2f", total) + "입니다.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // 연산형태의 자료형 또한 있는 코드
		System.out.println(aw);

	}

}
