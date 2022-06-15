
public class oop5 {
	//abstract
	// 인수값으로 추상 메소드 값을 넘김
	public static void main(String[] args) {
		abclass l1 = new load1();	
		l1.datain(20, 30);
		l1.call();
		abclass l2 = new load2();
		l2.datain(20,30);
		l2.call();
	}

}
abstract class abclass{
	int data1,data2;
	public void datain(int d1,int d2) { // 기본 추상 메소드 이며, 모든 에디터를 인수값 받아서 this로 처리 
		//외부클래스에는 선언하지 않음
		this.data1 = d1; 
		this.data2 = d2;
	}	
	public abstract void plus(); //각각의 class에 기본으로 plus 메소드 무조건 들어가야함
	public void call() {
		this.plus();
	}
}

class load1 extends abclass{
	@Override
	public void plus() { 
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
	public void avg() {
		System.out.println("홍길동");
	}
	public void call() {
		this.plus();
	}
}
class load2 extends abclass{
	
	@Override
	public void plus() {
		int prod = this.data1*this.data2;
		System.out.println(prod);
		this.avg();
	}
	public void avg() {
		System.out.println("홍길동");
	}
}