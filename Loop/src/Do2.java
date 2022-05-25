
public class Do2 {

	public static void main(String[] args) {
		int a=1,b=9;
		do {
			System.out.print(a*b+" "); 
			a++;
		}while(a < 10);
		System.out.println();

	/* 응용문제
	 	다음 결과값을 보고 do while문으로 코드를 작성하시오
	 	35 45 55 65 75
	 
	 */
	
		int i = 0;
		do {
			System.out.print(35+i*10+" ");
			i++;
		}while(i<5);
		System.out.println();
	}
	

}
