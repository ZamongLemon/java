import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = {5,10,15,20,25,30,35};
		//foreach 문을 사용할때는 인덱스 번호가 필요없이 사용할 경우
		//for, do while문은 인덱스 번호가 필요할 때 
		// 인덱스번호 [0][1][2]
		for(int f : arr ) { // int f 가 순차적으로 data 배열값을 받아서 저장
			if(f%2==0) {
		//	System.out.println(f);
			}
		}
		/*
		String pay[] = {"무통장입금", "신용카드","휴대폰","상품권","쿠폰"};
		Scanner scan = new Scanner(System.in);
		System.out.println("결제하고자 하는 형태를 선택해 주세요.");
		String pm = scan.next();
		for(String z: pay) { // 배열 데이터가 문자이므로 받는 변수 형태또한 문자형을 사용해야 합니다.
			if(z.equals("휴대폰")) {
				System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
			}else {
				System.out.println(pm+"(으)로 결제진행 됩니다.");
			}
		}
		scan.close();
		*/
		/*
		 	응용문제
		 	{"햄버거","피자","치킨","커피"} 
		 	주문하고자 하는 음식을 선택해 주세요.
		 	해당 질문은 총 4번을 물어보게 됩니다.
		 	단,"주문종료"라고 입력시 그 즉시 주문은 종료되며, 주문내역을 출력하시면 됩니다.
		 */
		String food[] = {"햄버거","피자","치킨","커피"};
		String[] orderedList = new String[4];
		Scanner scan_food = new Scanner(System.in);
		int c=0;
		for(int i=0 ; i < 4 ; i++) {
			System.out.println("주문하고자 하는 음식을 선택해 주세요.");
			String temp = scan_food.next();
			if(temp.equals("주문종료")) {
				break;
			}else {
				int k =0;
				while(k<food.length) {
					if(temp.equals(food[k])) {
						orderedList[c] = temp;
						c++;
					}
					k++;
				}

			}
		}
		for(String ordered : orderedList) {
			if(ordered!=null) {
			System.out.printf("%s ",ordered);
			}else {
				break;
			}
		}
		scan_food.close();
	}
}
