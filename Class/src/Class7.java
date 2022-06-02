
public class Class7 {

	public static void main(String[] args) {
		// Class에 기본 메소드 객체 필드값 전달
		String mid = "hong";
		String name = "홍길동";
		java1 jv1 = new java1(mid,name);
		jv1.java2();

	}

}

class java1{
	//java1 class를 main 에서 객체생성 및 인스탠스를 실행하면 바로 작동하는 class 기본 메소드 입니다.
	public java1(String a, String b) { // 클래스의 기본으로 사용하는 메소드
		
		System.out.println(a+b);
		java2();
	}
	public void java2() {
		System.out.println("test");
	}
}