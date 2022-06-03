import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	다음 사용자 복권 관련 프로그램을 요청하였습니다. 
		 	사용자가 총 5개의 숫자를 입력하게 됩니다.
		 	"1~46 번 사이의 숫자를 입력해 주세요." 
		 	사용자가 입력한 5개숫자를 배열로 생성. main 처리
		 	
		 	외부 class를 이용하여 PC가 직접 당첨번호 5개를 뽑아냅니다.
		 	PC가 뽑은 숫자를 배열로 생성. 외부 class method로 생성
		 	별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열데이터와 PC가 뽑은 배열 데이터를 해당 method로 전달하여 출력
		 	
		 	단, 모든 사용하는 반복문은 무조건 do while문으로 작성
		 */

		Scanner scan_num = new Scanner(System.in);
		int num[] = new int[5];
		int i = 0;
		do {
			System.out.println("1~46 번 사이의 숫자를 입력해 주세요.");
			num[i] = scan_num.nextInt();
			i++;
		}while(i<5);
		lottery lotto = new lottery();
		lotto.setLotto(num);
		lotto = null;
		scan_num.close();
	}
}
class lottery{
	int[] numbers = new int[5];
	void setLotto(int[] choosed_Numbers) {
		makeNumbers();
		printNumbers(choosed_Numbers);
	}
	void makeNumbers() {
		int i=0;
		do {
			numbers[i] = (int)(Math.random()*46)+1;
			i++;
		}while(i<5);		
	}	
	void printNumbers(int[] choosed_Numbers) {
		System.out.println("사용자가 고른 숫자 : "+ Arrays.toString(choosed_Numbers));
		System.out.println("PC가 뽑은 숫자 : "+ Arrays.toString(numbers));		
	}
}
