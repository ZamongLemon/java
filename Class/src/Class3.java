
public class Class3 {
	
	public static void main(String[] args) {
		//자료형 (데이터형)
		
		// int -> double 로 변환
		int c = 35;
		double d = (double)c;
		System.out.println(d);
		
		//String -> int 
		String x = "35";
		String x2 = "156";
//		int z = Integer.valueOf(x);//valueOf 메소드(메소드함수) ->parseInt
		int total = Integer.parseInt(x) +Integer.parseInt(x2);
		System.out.println(total);
		//->문자형을 숫자로 변환하여 산술계산 처리
		
		// long 사용시 long.parselong 사용함
		String j = "123456789";
		String j2 = "123456789";
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//문자(char) -> 문자 (String)
		char p = 'p';
		String f = String.valueOf(p);
		System.out.println(f);

	}

	
}
