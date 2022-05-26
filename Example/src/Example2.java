import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
			응용문제2
			사용자가 입력한 숫자에 맞춰서 구구단이 작동되며, 구구단에 대한 합을 계산하여 짝수인지 홀수인지를 출력
			
		*/
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int temp = scan_num.nextInt();
		int sum=0,i=1;
		while(i<10) {
			sum+=temp*i;
			i++;
		}
		if(sum%2 ==0) {
			System.out.println("합은 짝수입니다.");
		}else{
			System.out.println("합은 홀수입니다.");
		}
		scan_num.close();
	}

}


