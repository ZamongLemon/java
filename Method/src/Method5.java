
public class Method5 {

	public static void main(String[] args) {
		cdb c = new cdb();
//		c.d1 = "홍길동";
//		c.data2();
//		cdb.d3= c.d1;
//		cdb.data1();
//		cdb.d3= "이순신";
//		cdb.data1();
//		cdb.d3="유관순";
//		System.out.println((c.data3()));

		// c.d2 = "강감찬"; //private로 선언한 객체이므로 main class 에서 로드 못함
		c.data2("강감찬");
		
	}

}
class cdb{
	String d1 = null; // void, 자료형 메소드 로드 가능
	private String d2="" ;
	public static String d3; // 다 사용가능
	
	public static void data1() {// static 자료형 외에는 로드 불가능
		//System.out.println(d3);
		//System.out.println(this.d2);
		// static 에는 this 사용 불가능
	}
	public void data2(String str){
		this.d2 = str;
		System.out.println(this.d2);
	}
	public String data3(){
		String a = this.d2;
		return a;
	}
}
