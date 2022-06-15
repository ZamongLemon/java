
public class Over {

	public static void main(String[] args) {
		cd c = new cd();
		c.display("메인내용 출력");//오버로딩
		c.display(); // 오버라이드
		
		
	}

}

// overloading 새로운 메소드를 정의하는 것을 말합니다.
// override 부모 클래스에서 상속받은 기존 메소드를 사용하는 것을 말함
class pt{
	public void display() {
		System.out.println("외부 내용 값");
	}
	public void aaaa() {
		System.out.println("ㅅ");
	}
}
class cd extends pt{
	//aaaa()메소드가 Override annotation을 사용하려면 부모 class 에서 선언해야함
	@Override
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	
	
	@Override // 문제 발생시 확인 (오버라이드에만 적용)
	public void display() {
		System.out.println("자식 클래스 값으로 변경");
		super.display();//부모에 있는 고유 속성 메소드 값을 가져올때 super를 사용 
	}
	public void display(String msg) {
		System.out.println(msg);
	}

}