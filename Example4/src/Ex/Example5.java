package Ex;

public class Example5 {

	public static void main(String[] args) {
		/*
		 	Ư������ 
		 	abstract �� �̿��Ͽ� ������ 8�� ����� ��� ���� ������� return�� �޾� main���� ���
		 */
		multiple m = new multiple();
		System.out.println("8���� �� �� : "+m.multi(8));
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
