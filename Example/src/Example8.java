import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	응용문제8 
		 	PW = a1234
		 	사용자가 PW를 입력, 3회이상 실패시 
		 	"패스워드 횟수제한으로 가까운 지점에 방문하셔야합니다." 출력
		 	단, 패스워드가 맞을경우 "로그인 되었습니다.라고 출력되어야 합니다.
		*/
		String pw= "a1234",getPW="";
		Scanner scan_pw = new Scanner(System.in);
		boolean log = false;
		for(int i = 0 ; i < 3; i++) {
			System.out.println("패스워드를 입력하세요.");
			getPW= scan_pw.next();
			
			if(getPW.equals(pw)) {
				System.out.println("로그인 되었습니다.");
				log = true;
				break;
			}
			
		}
		
		if(!log) {
			System.out.println("패스워드 횟수제한으로 가까운 지점에 방문하셔야 합니다.");
		}
		scan_pw.close();

	}

}
