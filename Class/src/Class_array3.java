import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 다음 문자배열 데이터값이 있습니다. a1 : {"홍길동","이순신","강감찬","유관순","김유신"} a2 :
		 * {"100","80","39","60","55"}
		 * 
		 * 검색하고자 하는 이름을 적어주세요. 검색하면 이순신님은 80점입니다.라고 출력
		 */

		String[][] datas = { { "홍길동", "이순신", "강감찬", "유관순", "김유신" }, { "100", "80", "39", "60", "55" } };
		Scanner scan_name = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String name = scan_name.next();
		findName findN = new findName();
		findN.find(datas, name);
		scan_name.close();
		findN=null;
	}
}

class findName {
	public void find(String[][] datas, String name) {
		boolean c = false;
		String msg = "";
		for (int i = 0; i < datas[0].length; i++) {
			if (datas[0][i].equals(name)) {
				msg = datas[0][i] + "님은 " + datas[1][i] + "점 입니다.";
				c = true;
				break;
			}
		}
		if (!c) {
			msg = "존재하지 않는 이름입니다.";
		}
		System.out.println(msg);
	}
}
