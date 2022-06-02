import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		// 클래스 + 메소드 + 배열
		String users[] = { "홍길동", "이순신", "김유신" };
		Scanner scan_name = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scan_name.next();
		arrays.check_user(users, name);
		scan_name.close();
		/*
		 * 응용문제 사용자가 자신의 이름을 입력합니다. 사용자 이름을 해당 class로 보내서 등록된 사용자 인지 미 가입자 사용자인지 확인하는
		 * 코드를 작성하시오. 등록된 사용자일경우 "가입이 되어 있습니다." 미 가입 사용자일경우 "미가입자 입니다."
		 */
	}

}

class arrays {
	
	public static void check_user(String[] a, String name) {
		boolean c=false;
		String msg=""; // 메소드로 해당값을 전달할때 비어있는 값을 명확하게 적용하셔야 합니다.
		// String "" or null       int =0
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(name)) {
				msg ="가입이 되어 있습니다.";
				c=true;
				break;
			}
		}
		if (!c) {
			msg="미가입자 입니다.";
		}
		arrays ar = new arrays();
		ar.message(msg);

		
	}
	public void message(String m) {
		System.out.println(m);
	}
	
}
