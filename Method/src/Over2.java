
public class Over2 extends main2 {	
	
	public static void main(String[] args) {
		//��� ���
		Over2 ov = new Over2();
		ov.abc();
		ov.abc2();
	}

}

class main2 extends main3{
	public void abc() {
		System.out.println("�ܺ� �޼ҵ� Ŭ����");
	}
}
class main3{
	public void abc2() {
		System.out.println("�ܺ� �޼ҵ� Ŭ����2");
	}
}