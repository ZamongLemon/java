
public class Class1 {

	public static void main(String[] args) { //일반 main함수
		Adata a = new Adata();
		Bdata b = new Bdata();
		
		System.out.println(a.aa);
		System.out.println(b.aa);

		// Cdata안의 변수 자료형을 선언함 => 현재 기본함수에서 값만 입력한 뒤 객체값을 받아 산술식으로 계산 /인스턴스
		Cdata c = new Cdata();
		c.aa= 10;
		c.bb = 30;
		c.cc=c.aa+c.bb;
		System.out.println(c.cc);
	}

}

//aa 는 각각의 다른 클래스에 있기 때문에 중복되지 않습니다.
class Adata{
    String aa = "홍길동";

}

class Bdata{
	String aa = "이순신";
}
class Cdata{
	//해당 Cdata의 클래스에는 자료형에 대한 변수만 선언합니다.
	//계산수식은 함수가 없는 상황이므로 수식 또는 sysout을사용하지 못함
	int aa;
	int bb;
	int cc;
}
