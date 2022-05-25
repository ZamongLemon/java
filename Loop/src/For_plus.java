
public class For_plus {

	public static void main(String[] args) {
		//1~10까지 모든 숫자를 합한 결과값을 출력하시오
		
		int f;
		int total=0;
		for(f = 1 ; f < 11;f++) { // total 변수값에 반복값을 지속적으로 증가시킴 
			total += +f;
		}
		System.out.println("총합계 :"+total);
		//+=(더하기 할당기호) -=(빼기 할당기호) *=(곱셈할당기호) /=(나눗셈할당기호)
		// b=b-f == b-=f
		
		/*
		 * 전체 값은 500 총 8회동안 반복되면서 한번 반복할 때 마다 12씩 감소하도록 하여 최종 값을 출력하시오
		 */
		int sum = 500;
		int k = 8;
		while(k >0) {
			sum-=12;
			k--;
		}
		System.out.println("최종 값:"+sum);
	}

}
