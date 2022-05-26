import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		// 1~100±îÁöÀÇ °öÀº?
		
		int f;
		BigInteger a= new BigInteger("1");
		for(f=1;f<=10;f++) {
			a= a.multiply(BigInteger.valueOf(f));
		}
		System.out.println(a);
	}

}
