import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 	2차 배열이며, 2차배열 데이터는 다음과 같습니다.
		 	user_list : {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 	user_point : {"3000","1000","25000","19800","5750","5630","0"};
		 	프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요".
		 	입력한 값은 별도의 class 를 제작하여 해당 method 값으로 전달 후 출력
		 */
		Scanner scan_name = new Scanner(System.in);
		System.out.println("포인트를 검색할 고객명을 입력하세요.");
		String user_name = scan_name.next();
		getData getD = new getData();
		getD.findPoint(user_name);
		scan_name.close();
		getD=null;
	}

}
class getData{
	String[][] user_data = {{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
			{"3000","1000","25000","19800","5750","5630","0"}};
	
	void findPoint(String name) {
		String msg ="";
		boolean a = false;
		for(int i = 0 ; i< user_data[0].length;i++ ) {
			if(name.equals(user_data[0][i])) {
				msg = name+"고객님의 포인트는 : "+user_data[1][i]+"입니다.";
				a=true;
				break;
			}
		}
		if(!a) {
			msg = "존재하지않는 고객명입니다.";
		}
		System.out.println(msg);
	}
}
