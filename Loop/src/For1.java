
public class For1 {
	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입,출력 할 수 있도록 하는 문법
		//for (초기값; 범위값 ; 증감)

		for (int a = 0; a < 10; a++) {
			//System.out.println(a);	
		}
		
		int b;
		for (b = 5; b <= 10; b++) {
			//System.out.println(b);
		}
		int c;
		for (c=10 ; c > 3 ; c--) { //주의사항 c<3 0~음수까지 전부 찍혀버리는 상황이 발생함
		//	System.out.println(c);
		}
		
		
		//응용 20~27 출력
		for (int i = 20 ; i < 28 ;i++) {
		//	System.out.print(i+" ");
		}
		
		for (int j = 39 ; j > 20 ; j--) {
		//	System.out.print(j+" ");
		}
		
		// 1 ~ 10 출력
		int aa,bb=10;
		for ( aa = 1; aa <= bb; aa++) {
	//		System.out.print(aa+" ");
		}
		
		//변수 두개를 이용하여 다음 데이터 출력
		// 55~4
		
		int k,l=4;
		for(k=55 ; k>=l ; k--) {
			System.out.print(k+" ");
		}
	}
	
}
