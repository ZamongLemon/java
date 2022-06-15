package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		
		/*
		 	응용문제
		 	numberdata1 ={3,6,9,12,15};
		 	numberdata2 ={2,4};
		 	
		 	3,6,9,12,15,2,4,
		 */
		
		Integer[] numberdata1 ={3,6,9,12,15},numberdata2 ={2,4};
		ArrayList<Integer> numdata = new ArrayList<>(Arrays.asList(numberdata1));
		for(int a : numberdata2) {
			numdata.add(a);
		}
		System.out.println(numdata);		
		Collections.sort(numdata);
		System.out.println(numdata);
		System.out.println(numdata.size());
		
	}

}
