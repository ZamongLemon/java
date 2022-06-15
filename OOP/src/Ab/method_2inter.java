package Ab;
//interface 원래기능 메서드만 선언, 추가로 연산을 처리하는 형태의 default 추가됨
public interface method_2inter { // interface 는 method 이므로 field에 자료형을 올릴 수 없음
	public String names();
	default void setbox(String name) {//setter 
		System.out.println(name);
	}
	default void box3(String n) {//getter
		System.out.println("test");
	} // default 사용시 인터페이스에서 메소드 작성가능
	
}
interface method_2re extends method_2inter{ // interface에extends를 통해 interface를 상속가능 
	
}
