package Ex;

public class Example5 {

	public static void main(String[] args) {
		/*
		 	특강문제 
		 	abstract 를 이용하여 구구단 8단 결과를 모두 더한 결과값을 return을 받아 main에서 출력
		 */
		multiple m = new multiple();
		System.out.println("8단의 총 합 : "+m.multi(8));
	}

}

abstract class multiplytable{
	public abstract int multi(int t);
}
class multiple extends multiplytable{
	@Override 
	public int multi(int t) {
		int sum = 0;
		for(int i = 1 ; i < 10 ;i++) {
			sum+= i*t;
		}
		return sum;
	}
}
