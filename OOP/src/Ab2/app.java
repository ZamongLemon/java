package Ab2;

public class app {

	public static void main(String[] args) {
		// 자식 = 자식 -> 모두 호출 가능 
		//부모 = 자식 -> 인터페이스 기준으로 적용된 오버라이드만 호출함 (형변환)
		members mb = new members(); // 자식 class 전용
		app_data2 ap = mb; //interface 전용 (클래스 -> 인터페이스 기준)
		ap.oop();
		ap.oop2();
		
		members mb2 = (members)ap; // 인터페이스 -> 클래스 변환
		
		mb2.ced();
	
	}
	

}
/*App_data1에 강제로 자료형 선언하는 방식
class members implements app_data1{
	 
}*/

class members implements app_data2{
	
		@Override
		public void oop() {
			System.out.println("test");
		}
		@Override
		public void oop2() {
			System.out.println("test2");		
		}
		
		public void ced() {
			System.out.println("test3");
		}
		
}
