import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		// 스캐너와 함께 while 문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램 작성
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("원하는 구구단 단수를 입력하세요.");
		int num = scan_num.nextInt();
		
		short i = 1;
		while(i <10) {
			System.out.printf("%d ",i*num);	
			i++;
		}

		scan_num.close();

	}

}
