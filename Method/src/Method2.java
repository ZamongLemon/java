
public class Method2 {

	public static void main(String[] args) {
		
		// default package를 사용지 해당 class 명 호출
		// package에 묶여잇을 경우 상단에 package명 선언 
//		tests ts = new tests();
//		tests.a2++;
//		System.out.println(tests.a2);

		info i = new info();
		/*// error //
		System.out.println(info.data1(20));
		System.out.println(i.data2(20));	
		*/

		String result = i.data4("ㅁㅁㅁ");
		System.out.println(result); //data4 return 값을 result 변수로 받아서 처리 
				
	}
}

class info{
	public static void data1(int abc) {
		int z = abc + 20;
		System.out.println(z);
	}

	public void data2(int abc) {
		int z = abc + 20;
		System.out.println(z);

	}
	public int data3(int abc) {

		int z = abc + 20;
		return z;
	}
	
	public String data4(String abc) {
		
		String z = abc+"님 환영합니다.";
		return z;
	}
}