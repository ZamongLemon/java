package Ab;

// abstract와 interface 의 차이점 및 공통점 
public class method_2 {
	
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.box3("t");
	}
}
//중요 abstract와 interface는 모두 static은 사용할 수 있음

abstract class test{ // abstract 에는 default를 사용하지 않음
	// 필드에 자료형을 생성할 수 있음
	String nn;
	public abstract void box();
	public static void box2() {
		System.out.println("test");
	}
}


class loadinter implements method_2inter,method_2inter2{ // interface는 다중상속 가능
	public String names() {
		return null;
	}
	
}