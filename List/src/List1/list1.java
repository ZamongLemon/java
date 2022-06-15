package List1;

import java.util.ArrayList;
import java.util.Arrays;
public class list1 {

	public static void main(String[] args) {
		//add(추가),get(데이터로드),remove(삭제),size(크기),asList : 로드할 배열 적용
		//add는 index 지정 없으면 맨 뒤에 추가 
		/*
		String member[] = {"이순신","홍길동","유관순","강감찬"};
		ArrayList<String> members = new ArrayList<>(Arrays.asList(member));
	  	System.out.println(members.size());		 
		members.add("김유신");
		System.out.println(members);
		members.remove(1);
		System.out.println(members);
		members.add(2,"세종대왕");
		System.out.println(members);
		String checks = members.get(2);
		System.out.println(checks);
		*/
		// Arraylist 에는 int 형을 사용하지 않고 Integer
		
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		
		num.add(0,7);
		num.remove(3);
		num.set(5, num.get(5)+20);
		System.out.println(num);
	}

}
