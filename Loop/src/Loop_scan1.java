import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for문 + Scanner
		//원하시는 구구단 단수를 입력하세요

		Scanner aa = new Scanner(System.in); //입력엔진 로드
		System.out.println("원하시는 구구단 단수를 입력하세요"); //질문
		int bb = aa.nextInt(); //입력한 내용 대입
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i*bb+" ");			
		}
		aa.close();
		System.out.println();
		

		
	}

}
