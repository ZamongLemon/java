package Ex;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
	
	public static void main(String[] args) {
		// �ܺ� class �� ��� ���� ���μ����� �ۼ��Ͻÿ�.
		/*
		 	2���� �迭 ������, 2���� �迭�� �ϳ��� �迭�� ��ħ
		 	��� �ߺ��� ���� �ϳ��� ó�� 
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
