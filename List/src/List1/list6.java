package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>(); // 자료형이 없는 상태

		int w = 0;
		while(w<5) {
			System.out.println("데이터를 입력 해주시기 바랍니다.");
			list.add(scan.next());
			w++;
		}
		int ww =0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww); // 배열자료가 숫자+문자 형태로 구성이 되어 있는경우 Object를 매개타입으로 설정
				int numbers = Integer.parseInt(k.toString());//해당 매개를 문자화 하여 정수로 바꿀수 있는지 체크
				total+=numbers;
			}
			catch(Exception aa) {//배열의 타입이 숫자가 아닌 경우 예외처리
				
			}
			ww++;
		}while(ww<list.size());
		System.out.println("입력한 모든 배열의 숫자 합은: " + total + " 입니다.");
		scan.close();

	}

}
