
public class Datatype {

	public static void main(String[] args) {
		//String : 문자 "" 무조건 사용
		
		// 정수형 자료들 
		String a = "1234" ;
		System.out.println(a);
		
		byte b = 127; //byte : -128 ~ 127
		System.out.println(b);
		
		short c = 32767; // short : -32,768 ~ 32767
		System.out.println(c);
		
		int d = 2147483647; // int : -2,147,483,648 ~ 2,147,483,647
		System.out.println(d);
		
		long e = 999999999945699L; // long L 사용시 기본메모리할당에서 추가 적용시 가용범위 늘어남 
		System.out.println(e);

		// 정수형 끝
		// 실수형 
		float z =  3.5f; // 3.24234234+38 (f를 사용해야함)
		System.out.println(z);
		double k = 44.5178; // 1.784+308(d를 사용 /비사용 가능 )
		System.out.println(k);
	}

}
