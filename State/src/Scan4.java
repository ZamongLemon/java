import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요");
		//String memo =a.next(); //next(): 스페이스 바 입력 까지만 적용
		String memo = a.nextLine();//nextLine() 스페이스바 포함 모든 입력 적용 
		System.out.println(memo);
		
		a.close(); //scanner 종료	
		
		String name = "park"; //string+숫자 = %s
		int age = 25; // 정수형 %d 소수형 %f
		// date,time %t
		// boolean %b
		//System.out.println(name+"님의 나이는 "+age+"입니다.");
		//printf: f -> format
		System.out.printf("%s님의 나이는 %d입니다.",name,age);

	}

}
