
public class if3 {
	public static void main(String[] args) {
		
		// boolean : true, false로 구분됩니다.
		boolean ck=true;
		if (ck) {
			System.out.println("회원가입이 진행 됩니다.");			
		}else {
			System.out.println("이용약관에 동의하셔야만 진행 됩니다.");
		}
		
		String name="park",pass="a1234";
		// && : 한가지 조건이상 모두 맞을경우 
		// || : 한가지 조건이상 에서 한개라도 맞을 경우
		if(name=="park" && pass=="a1234") {
			System.out.println("로그인 하셨습니다.");			
		} else {
			System.out.println("ID 및 PW를 확인하세요");
		}
		
		if(name == "park" || name == "kim"){
			System.out.println("회원이 확인 되었습니다.");
		}else {
			System.out.println("확인된 아이디가 없습니다.");
		}
	
	}
	
}
