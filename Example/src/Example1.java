
public class Example1 {

	public static void main(String[] args) {
		/*
		 	배열+기본(클래스)메소드문제
		 	1차배열에 다음과 같이 값이 있습니다.
		 	배열리스트 22 33 44 55 66 77 88 99 이며
		 	해당 전체 값을 모두 더한 총 합계값을 별도의 메소드로 
		 	처리 되도록 합니다. 단, 반복문은 무조건 do~while문으로 작성 합니다.
		 */

		int[] ar = {22,33,44,55,66,77,88,99};
		Example1 ex1 = new Example1();
		ex1.calcSum(ar);
		ex1 = null;
		
	}
	
	void calcSum(int[] arr) {
		int n=0,sum=0;
		do {
			sum+=arr[n];
			n++;
		}while(n<arr.length);
		
		System.out.println("합은 "+sum+" 입니다.");
	}
	

}
