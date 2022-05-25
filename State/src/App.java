
public class App {

	public static void main(String[] args) {
		short a = 25+31*4+12, b= 15*3+9+14;
		if(a<b) {
			System.out.println("a = "+a);
		}else if (a>b) {
			System.out.println("b = "+b);
		}else {
			System.out.println("a==b");
		}

	
		/* 해당값을 2진수로 짝수 홀수로 확인하기 */
		int c = b%2 ; // %기호로 사용시 0 또는 1로 나머지 값이 출력 됩니다.
		System.out.println(c);
		if(c==0){
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	
	}
}
