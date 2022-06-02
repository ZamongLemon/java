package box; //package는 main java를 실행시키면 함께 실행되는 java file 로드 형태

public class Class1 {

	public static void main(String[] args) { //main package 중에서 실행되는 최초의 java file에만 적용합니다.
		Class2 c2 = new Class2();
		Adata a = new Adata();//Class2.java에 별도의 Adata클래스를 로드함
		System.out.println(c2.names);
		System.out.println(a.names);
		

	}

}
