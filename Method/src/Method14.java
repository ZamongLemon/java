
public class Method14 {

	public static void main(String[] args) {
//		Mbc m = new Mbc();
//		Mbc m2 = new Mbc("이순신");
//		m =null;
//		m2 = null;
	}

}

class Mbc{
	
	public Mbc() { // 인수 없는 생성자
		System.out.println("구조1");
		test();
	}
	public Mbc(String user) { // 인수 있는 생성자
		System.out.println("user");
		test(user);
	}
	public void test() { // 인수 없는 메소드
		System.out.println("메소드");
		total();
	}
	public void test(String user) { // 인수 있는 메소드 오버라이딩
		System.out.println(user);
		total();
	}
	public static void total() {
		System.out.println("시스템 종료");
	}
}

