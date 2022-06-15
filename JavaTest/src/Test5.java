
public class Test5 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1 ; i <= 100;i++) {
			sum+=i;
			if(sum >= 4000) {
				break;			
			}
		}
		System.out.println(sum);
	}
}
