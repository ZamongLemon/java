import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 	응용문제 9
		 	A학생에 대한 성적을 입력받고 평균점수가 나오는 프로그램을 제작합니다.
		 	"점수를 입력하세요."라는 문구는 총 5번이 나오게 되며, 모든 점수는 합산하여 출력합니다.
		 */
		/*Scanner scan_point = new Scanner(System.in);
		
		int e=0,sum=0;
		do {
			System.out.println("점수를 입력하세요.");
			sum+= scan_point.nextInt();
			e++;
		}while(e<5);
		System.out.println("점수 합계 : "+sum);*/
		
		/*추가. 합산 후 점수에 대한 평균값을 출력하시오.
		 	   "해당 점수의 평점은 : "이라고 출력.
		 	   평점 40점 이하 : "불합격입니다."출력.
		 	   평점 40점 이상 : "합격입니다." 출력.*/
		
		/*Scanner scan_point = new Scanner(System.in);
		
		int e=0,sum=0;
		do {
			System.out.println("점수를 입력하세요.");
			sum+= scan_point.nextInt();
			e++;
			
		}while(e<5);
		System.out.println("점수 합계 : "+sum);
		if(sum/5 > 40){
			System.out.println("평균점수는 : " + sum/5 + "입니다. 합격입니다.");
			
		}else if(sum/5 < 40) {
			System.out.println("평균점수는 : " + sum/5 + "입니다. 불합격입니다.");
			
		}*/
		/*추가."입력하실 과목 수를 적어주세요 : "라고 출력후,
		 	  입력한 과목수만큼 반목문이 적용되며, 평균값에 과목수가 반영되어야 한다.
		 */
		Scanner scan_point = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요 :");
		int c = scan_point.nextInt();
		
		int e=0,sum=0;
		do {
			System.out.println("점수를 입력하세요.");
			sum+= scan_point.nextInt();
			e++;
			
		}while(e<c);
		System.out.println("점수 합계 : "+sum);
		if(sum/c > 40){
			System.out.println("평균점수는 : " + sum/c + "입니다. 합격입니다.");
			
		}else if(sum/c < 40) {
			System.out.println("평균점수는 : " + sum/c + "입니다. 불합격입니다.");
			
		}
		
		scan_point.close();
	}

}
