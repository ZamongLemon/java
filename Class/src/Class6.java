import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		
		String pay = "계좌이체";
		if(pay.equals("신용카드")) {
			da.pay1();
		}
		else {
			da.pay2(pay); // 메소드에 객체값을 태워서 전달 (객체값은 무한대)
		}
		
		
		agrees ag = new agrees();
		Scanner scan_text = new Scanner(System.in);
		System.out.println("동의하시면 '동의함' 을, 동의하지 않으신다면 '동의안함'을 기입해주십시오.");
		String agree = scan_text.next();
		ag.process(agree);
		scan_text.close();
	}

}
class datalist{
	/* static 메소드를 활용하는 형태 : 여러 package에서 해당 메소드를 자주 사용해야 하는 부분에서는 static을 이용하여 사용

	// static(정적 메소드) : 오버라이딩을 사용할 수 없음
	// void만 사용(동적 메소드) : 오버라이딩을 사용할 수 있습니다.
	// 오버라이딩 예제 
	
	 	class a{
	 	void 메소드
	 	}
	 	class b extend a {
	 	void 메소드
	 	}
	 	
	 */
	public void array_data(int num){//static 없는 메소드
		
		int w = 1;
		while(w<9) {
			System.out.println(num*w);
			w++;
		}
	}
	public void pay1() {
		System.out.println("신용카드로 결제 진행합니다.");
	}
	public void pay2(String pm) {
		System.out.println(pm+"로 결제 진행합니다.");
	}
}
/* 응용문제 해당 로드할 class명은 agrees라는 이름을 가지고 있습니다.
	main 메소드에서 사용자가 "동의함","동의하지 않음" 을 입력하게 됩니다.
	동의함으로 입력될경우 "회원가입이 진행됩니다."라는 메시지를 출력하고, 동의안함 을 입력시 "동의를 하셔야 진행됩니다."라고 출력하도록 하시오.
	단,agrees 클래스 안에 void 메소드 한개 또는 두개를 선택하여 코드를 제작하시오.
*/

class agrees{
	void process(String ag) {
		if(ag.equals("동의함")) {
			System.out.println("회원가입이 진행됩니다.");
		}
		else if(ag.equals("동의안함")) {
			System.out.println("동의를 하셔야 진행됩니다.");
		}else {
			
			System.out.println("기입이 잘못되었습니다.");
		}
	}

	
}

