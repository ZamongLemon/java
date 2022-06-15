package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
	 	Integer[] numberdata1 ={3,6,9,12,15};
	 	LinkedList<Integer> ln =new LinkedList<>(Arrays.asList(numberdata1));
	 	System.out.println(ln);
	 	
	 	Scanner scan_int = new Scanner(System.in);
	 	LinkedList<Integer> list = new LinkedList<>();
	 	String user;	 	
	 	//for(;;) 무한루프 
	 	while(true) {//무한루프
	 		System.out.println("숫자를 입력하세요");
	 		user = scan_int.next();
	 		try {	//사용자가 입력한 값에 오류가 있는지 확인하는 파트
	 		int num = Integer.parseInt(user);
	 		list.add(num); 		
	 		System.out.println(list);
	 		if(list.size()>5) {break;} // 5개까지 입력되면 무한루프 빠져나옴
	 		}catch(Exception e){ // 오류가 발생하였을 경우 작동되는 파트
	 			System.out.println("해당 입력사항은 문자입니다.");	 		
	 		}
	 	}
	 	scan_int.close();
	 	
	 	
	}
}
