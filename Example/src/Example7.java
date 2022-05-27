import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		  사용자가 다음 질문에 확인하여 값을 입력 후 해당 결과를 출력하는 프로세서 작성
		  "첫번째 입력값 단 (1~10까지) 입니다.";
		  "두번째 입력값 단 (1~10까지) 입니다.";
		  "세번째 입력값 단 (1~10까지) 입니다.";
		  "마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오."
		  해당 산술기호에 맞게 수식을 적용하여 최종값을 출력시키기		  
		 */
		
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		String p;
		
		System.out.println("첫번째 입력값 단 (1~10까지) 입니다.");
		a = scan.nextInt();
		System.out.println("두번째 입력값 단 (1~10까지) 입니다.");
		b = scan.nextInt();
		System.out.println("세번째 입력값 단 (1~10까지) 입니다.");
		c = scan.nextInt();		
		System.out.println("마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오.(+,-,*,/)");
		p = scan.next();
		int ans=a;
		if(p.equals("+")) {		
			ans += b+c;
		}else if(p.equals("-")) {
			ans -= b+c;
		}else if(p.equals("*")) {
			ans *= b*c;
		}else if(p.equals("/")) {
			ans /= b;
			ans /= c;
		}
		System.out.println(ans);
		
		
		scan.close();
	}

}
