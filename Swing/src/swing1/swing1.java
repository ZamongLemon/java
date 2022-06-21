package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class
		//float, char, byte , long , short (기본타입)
		// wrapper class : Byte, Integer, Long , Double
		Integer a = 20; // new Integer (박싱)
		Integer b = 20;// unboxing
		if ( a==b) {
			System.out.println(a+b);
		}
		
		Integer no = 99; //자동 언박싱
		//		int aa = no; //자동 언박싱
		Integer bb = no.intValue(); // 언박싱
		System.out.println(bb);
		
		/*
		 	박싱과 박싱을 비교할 때는 equals를 사용해야만 비교가 이루어짐 
		 */
		
	}

}
