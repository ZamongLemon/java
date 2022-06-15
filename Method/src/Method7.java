
public class Method7 {
	
	static String a;
	public static void main(String[] args) {
		apink ap = new apink("홍길동",25,"test@test.com",-1000);
		System.out.println(ap.data3());
		System.out.println(ap.data());
		
	}
}

class apink{//private선언은 class필드에서 생성해야함
	
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public apink(String nm1,int age2,String email3, int point4) { // private 안에서 선언하지 못함
		this.nm = nm1;
		this.email = email3;
		
		if(point4<0) {
			this.point = 0;
		}else {
			this.point = point4;
		}
	}
	
	public void names() {
		if(this.nm =="홍길동") {
			this.nm = "hong";
			String[] e = this.email.split("@"); // 이메일중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			this.email_cp = e[1];
		}
		
		System.out.println(email_cp);
	}
	public String data() {
		names();
		return this.nm;//return은 함수 마지막에 사용
	}
	public int data2() {
		//getter 형태
		return this.age;
	}
	public String data3() {
		return this.email;
	}
	public int data4() {
		return this.point;
	}
}