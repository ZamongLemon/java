import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// 다음 이용약관에 대한 동의 프로그램
		// 동의항목 전체 3가지 모두 true 가 적용되어야 진행
		// 사용자에게 "동의항목에 동의하시겠습니까?" 출력
		// 동의 항목중 한가지라도 동의하지않을경우 "모두 동의하셔야지만 진행됩니다."출력
		// 모두 동의할경우 "회원가입이 완료되었습니다."출력
		Scanner scan_bool = new Scanner(System.in);
		boolean a=false,b=false,c=false;
		int temp=0;
		for(int i = 0; i < 3 ; i ++) {
			System.out.println("동의항목에 동의하시겠습니까? 동의시(1) ");
			temp=scan_bool.nextInt();
			if(i==0 && temp==1) {
				a=true;
			}else if(i==1 && temp==1) {
				b=true;
			}else if(i==2 && temp==1) {
				c=true;
			}
		}
		
		if(a&&b&&c) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("모두 동의하셔야만 진행됩니다.");
		}
		scan_bool.close();
		

	}

}
