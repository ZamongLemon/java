package App;

public class App1 {
//App1이라는 기본 메인 class 이며 abox, main이 공존해 있음
	
	public static void main(String[] args) {
		blue b = new blue();
		System.out.println(b.box());

	}
	public void abox() {
		System.out.println("TEST import");
	}
}
// blue는 별도의 외부 class 이며, Method11에서 직접적인 핸들링 불가능함

class blue{
	private String msg;
	public String box(){
		this.msg = "환영합니다.";
		
		return msg;
		
	}
}
