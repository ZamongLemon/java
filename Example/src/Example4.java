import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 	배열생성 기본클래스 메소드 문제
		 	사용자가 다음 질문에 값을 입력하게 됩니다.
		 	"학습 학생 이름을 입력해 주세요."
		 	배열 데이터 5개
		 	별도의 메소드에서 해당 사용자 입력값을 배열로 구성하여 출력.
		 	
		 */	
		Scanner scan_name = new Scanner(System.in);
		int e=0;String name ="";String list_name="";
		while(e<5){
			System.out.println("학급 학생 이름을 입력해주세요.");
			name =scan_name.next();
			list_name+=name+" ";
			e++;
		}
		getName(list_name);
		scan_name.close();
	}
	
		
	public static void getName(String student) {
	
		String userin[] = student.split(" ");		
		System.out.println(Arrays.toString(userin));
		
	}
	static String[] lists = new String[5];

}
