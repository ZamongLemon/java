import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요");
		int num = input.nextInt();
		
		// %는 값을 나누면서 나머지 값을 확인하는 수식
		if(num%2 ==0){
			System.out.println("짝수입니다");
		}else{
			System.out.println("홀수입니다");
		}
		
		input.close();
	}
}
