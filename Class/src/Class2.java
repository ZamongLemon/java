public class Class2 {
	//package를 사용하지 못함 (default라서)
	
	public static void main(String[] args) {
		// 별도의 클래스 지정 후 함수를 이용하여 값을 전달받기
		
		inject.oksign(); // static void 사용시 동적할당 없이 사용가능
		inject.test();
		members.user("이순신");//괄호안의 데이터 (인자값)
		members.calc(5, 10);//members 클래스 안의 calc라는 일반함수에 5와 10을 인자값으로 대입
	}
	
}
class inject{
	// public static void : 가장 기본이되는 일반 함수를 뜻합니다.
	public static void oksign() {
		String user="홍길동";
		System.out.println(user);
	}
	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa+bb;
		System.out.println(cc);
	}
	
	
}
class members{
	public static void user(String t){
		System.out.println(t+"님 환영합니다.");
	}
	
	public static void calc(int a,int b) {// (자료형 이름,자료형 이름) 인자값 2개를 받음
		System.out.println(a*b);//계산해서 println
	}
}

