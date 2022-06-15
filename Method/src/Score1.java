import java.util.Scanner;

public class Score1 {

	static String[] msg =
			{"검색할 데이터 학생명을 입력해주세요.","검색할 과목명을 입력하세요.[전체,국어,수학,과학,역사]"};
	
	public static void main (String[] args) {

		Score2 sc = new Score2();
		Scanner text = new Scanner(System.in);
		System.out.println(msg[0]);
		String name = text.next(); // 학생명 입력
		sc.data(name,null); //Score2에 메소드로 사용자 및 점수 전달
		
		String check =sc.gtdata();
		if(check.equals("true")) {
			System.out.println(msg[1]);
			String subject= text.next();//과목입력
			sc.data(name,subject);
			String score = sc.gtdata();
			if(subject.equals("전체")) {
				System.out.println("점수 국어 수학 과학 역사 순서로 " + score+ "입니다.");
				
			}else {
				System.out.println("점수데이터 : " + subject + " " + score +"점입니다." );
			}
		}else {
			System.out.println("해당 사용자는 존재하지 않습니다.");
			System.exit(0);;
		}
		
		text.close();
		
		System.gc();
	}
}
