
public class Switch1 {

	public static void main(String[] args) {
		// switch-case 선택문 입력된 값 기준으로 case가 발동하여 출력값을 선택하게 됩니다.
		// default는 case에 내용중 같은 내용이 존재하지 않을경우 작동되는 문법입니다.
		int n = 3; 
		switch(n) {
		case 1: 
			System.out.println("옵션 1을 선택하셨습니다.");
			break;
		case 2: 
			System.out.println("옵션 2을 선택하셨습니다.");
			break;
		case 3: 
			System.out.println("옵션 3을 선택하셨습니다.");
			break;
		default:
			System.out.println("선택한 값이 없습니다.");
			break;
		
		}
		
		String user="이순신"; // 문자로 switch 문에 인자값 전달
		switch(user) { // 복합 case 형태입니다.
		case "이순신":
		case "이 순신":
		case "이순 신":
			System.out.println("A조입니다.");
			break;
		case "홍길동":
			System.out.println("B조입니다.");
			break;
		case "유관순":
			System.out.println("C조입니다.");
			break;
		default:
			System.out.println("나머지는 D조입니다.");
			break;
		}

	}

}
