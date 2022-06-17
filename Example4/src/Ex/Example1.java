package Ex;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
	
	public static void main(String[] args) {
		// 외부 class 를 사용 다음 프로세서를 작성하시오.
		/*
		 	2개의 배열 데이터, 2개의 배열을 하나의 배열로 합침
		 	대신 중복된 값은 하나로 처리 
		 	db1 = {11,22,33,44,55};
		 	db2 = {8,10,11,19,44};
		 	Collections
		 */
		
	 	Integer[] db1 = {11,22,33,44,55};
	 	Integer[] db2 = {8,10,11,19,44};
		List<Integer> datas = new ArrayList<>(Arrays.asList(db1));
		datas.addAll(Arrays.asList(db2));
		Collections.sort(datas);
		/*
		int i = 0;
		while(i<datas.size()-1) {
			if(datas.get(i) == datas.get(i+1)) {
				datas.remove(i);
			}else {
				i++;
			}			
		}
		 */
		datas = datas.stream().distinct().collect(Collectors.toList());
		System.out.println(datas);
	}
	
	

}
