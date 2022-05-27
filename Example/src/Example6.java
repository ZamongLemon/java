
public class Example6 {

	public static void main(String[] args) {
		/*
		  1~10 순차적용되는 반복문
		  단, 1~5까지는 모든 값을 곱하고, 6~10까지는 모든 값을 더합니다.
		  해당 두개의 값을 비교하여 더한값이 큰지 곱한값이 큰지를 출력
		 */
		int a=1,b=0;
		for (int i = 1 ; i <= 10; i++) {
			if(i<=5) {
				a*=i;
			}
			else {
				b+=i;
			}
		}	
		if(a>b) {
			System.out.println("1~5까지 곱한 값이 더 큽니다.");
		}else if(a<b) {
			System.out.println("6~10까지 더한 값이 더 큽니다.");
		}else {
			System.out.println("같습니다.");
		}

	}

}
