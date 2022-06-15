package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 	응용문제 
		 	휴면고객 데이터는 모두 삭제해야 합니다.
		 	고객 데이터
		 	{"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"}
		 	
		 	결과
		 	정재욱,하윤성
		 */
		String[] data1 = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성","윤","이","최","박"};
		ArrayList<String> data2 = new ArrayList<>(Arrays.asList(data1));
		
		int j = 0;
		while(j < data2.size()) {
			if(data2.get(j).equals("정재욱")||data2.get(j).equals("하윤성")) {
				j++;
			}else {
				data2.remove(j);
			}
		}
		System.out.println(data2);
		
		/*
		  짝수를 모두 삭제
		 */
		
		Integer[] intarr = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> intar = new ArrayList<>(Arrays.asList(intarr));
		int k = 0 ; 	
		while(k< intar.size()) {
			if(intar.get(k)%2==1) {
				k++;
			}else {
				intar.remove(k);
			}		
		}
		System.out.println(intar);
		

	}

}
