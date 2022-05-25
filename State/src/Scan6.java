import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		/*
		Scanner scan_id = new Scanner(System.in);
		System.out.println("ID를 입력하세요.");
		String id = scan_id.next();// id 입력
		
		Scanner scan_pass = new Scanner(System.in);
		System.out.println("PW를 입력하세요.");
		String pw = scan_pass.next();// pw입력
		
		scan_id.close();
		scan_pass.close();
		*/
		//회원가입 아이디는 jung,su
		//패스워드 jung - j1234 , su - ssh
		//해당 아이디 외의 나머지는 "가입되지 않은 사용자 입니다." 출력
		//PW가 틀릴경우 "회원정보를 다시 확인하세요."
		//맞을경우 "로그인 되셨습니다."
		
		Scanner scan_id = new Scanner(System.in);
		System.out.println("ID를 입력하세요.");
		String id = scan_id.next();
		
		Scanner scan_pw = new Scanner(System.in);
		System.out.println("PW를 입력하세요.");
		String pw = scan_pw.next();
		
		if(!id.equals("jung") && !id.equals("su")) {
			System.out.println("가입되지 않은 사용자 입니다.");
		}else {
			if(id.equals("jung") && pw.equals("j1234")) {
				System.out.println("로그인 되셨습니다.");
			}else if (id.equals("su") && pw.equals("ssh")){
				System.out.println("로그인 되셨습니다.");
			}else{
				System.out.println("회원정보를 다시 확인하세요.");
			}				
						
		}
		scan_id.close();
		scan_pw.close();
	}

}
