
public class Var {

	public static void main(String[] args) {
		// 변수 : 지속적으로 변하는 수
		/*
		  
			1. 선언방식 - 변수만 선언
			2. 변수 + 값을 같이 선언
		
		*/
		
		//String 문자 자료형 
		String a1; // a1 변수명 지정 

		a1 = "홍길동입니다.";		
		// =: 값을 좌변에 넘겨주는 기호 , ==:값이 같음 을 의미하는 기호 
		System.out.println(a1);
		//변수명을 만든 후 값을 지정하여 대입하는 형태 
		
		/*
		 * 2. 변수+값을 같이 선언하는 방식
		 */
		
		String b1="이순신 입니다.";
		System.out.println(b1);
		
		/* 변수확인 사항 */
		a1 = "이순신 입니다.";//기존의 데이터는 삭제되고, 새로운 값으로 재설정됨
		System.out.println(a1);

	}

}
