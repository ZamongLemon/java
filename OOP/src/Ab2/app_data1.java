package Ab2;

public interface app_data1 {
	String a = null ; // 필드에 자료형을 비어있는 값을 사용할 경우 적용이 안됨
	int b = 0;
	public void user_join(); // 선언 형태의 method는 this 사용 못함
	default void aaa() { //default에는 this 사용이 가능 (값이 있을 경우)
		//System.out.println(this.a);
	}
	
}
