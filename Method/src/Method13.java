
public class Method13 {

	public static void main(String[] args) {
		// extends : inherit(상속)
		// 부모 클래스 생성자에 인수값을 적용하면 자식클래스에서 로드를 못함
		// 단 자식 클래스에서 인수값을 통해 생성자 사용가능
	//	mth1 m1 = new mth1();
	//	mth2 m2 = new mth2(50);
		
		
	}
}


class mth1{
	public int no;
	public mth1() {
		this.no = 20;
		System.out.println(this.no);
	}

}
class mth2 extends mth1{
	public mth2(int z) {
		this.no = z;
		System.out.println(this.no);
	}	
}