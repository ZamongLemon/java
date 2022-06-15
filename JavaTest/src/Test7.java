import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan_color = new Scanner(System.in);
		System.out.println("빨강,주황,노랑,초록 중의 하나를 입력하십시오.");
		String color = scan_color.next();
		
		switch(color) {
		case "빨강"->color = "red";
		case "주황"->color = "orange";
		case "노랑"->color = "yellow";
		case "초록"->color = "green";
		default -> color = "해당 단어는 번역이 되지 않습니다.";
		}
		System.out.println(color);
		scan_color.close();
		
	}

}
