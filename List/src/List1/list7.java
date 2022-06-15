package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*
		 	응용문제 ArrayList 혹은 LinkedList 둘중에 원하는 메소드를 구현하시면 됩니다
		 	2차배열 해당 데이터 값을 ㅁ두 더하여 짝수인지 홀수인지 판별하시오.
		 */
		Integer data[][]= {{10,20,30,40,50,60,70},{3,6,9,12,15,17,19}};
		
		ArrayList<Integer[]> intList = new ArrayList<>(Arrays.asList(data)); 
		int sum =0;
		for(Integer[] i : intList) {
			for(Integer j : i) {
				sum+=j;
			}
		}
		if(sum%2==1) {
			System.out.println(sum + "은 홀수");
		}else {
			System.out.println(sum + "은 짝수");
		}
	}

}
