
public class Method3 {
	public static void main(String[] args) {
	
		/*
		 	응용문제. 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 	최종 계산값을 받아서 결과를 출력하시오.
		 	157, 45;
		 	157*45;
		 */
		
		int[] data = {157,45};
		
		calc calc = new calc();
		System.out.println("배열 인자의 곱 : " + calc.product(data));
		
		calc.m2();
		calc.product();
		/*
		 	다음 숫자 하나를 해당 메소드로 전달 
		 	해당 메소드에서는 다음과같이 처리
		 	숫자 3을 전달하면 3*1~3*9까지의 결과값을 더하여 sysout으로 출력되도록 하십시
		 */
		System.out.println("==============");
		System.out.println("3단의 합 : " + calc.multipletable(3));
		calc = null;
	}

}
class calc{
	int product(int[] arr) {
		int prod = 1;
		for(int i = 0 ; i < arr.length;i++) {
			prod *= arr[i];
		}
		return prod;
	}
	public void product () {	
		System.out.println("연습입니다.");
	}
	void m2() {
		int[] a = {100,200};
		System.out.println(product(a));
	}
	int multipletable(int a) {
		int sum = 0;
		for(int i = 1 ; i <10 ; i ++) {
			sum += a*i;
		}
		return sum; // return 사용시 반복문 안에 적용 x , 조건문이라도 더블 return 사용 안됨 
	}
	
	public String mb (String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";
		}else {
			msg="cancel";
		}
		return msg;
		
		/*
		 	최종적인 값을 return 시키는게 좋음
		 */
	}
}
