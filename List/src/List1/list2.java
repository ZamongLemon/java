package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 	���빮�� 
		 	�޸�� �����ʹ� ��� �����ؾ� �մϴ�.
		 	�� ������
		 	{"�����","������","��â��","�ڵ���","�̰���","�����","������"}
		 	
		 	���
		 	�����,������
		 */
		String[] data1 = {"�����","������","��â��","�ڵ���","�̰���","�����","������","��","��","��","��"};
		ArrayList<String> data2 = new ArrayList<>(Arrays.asList(data1));
		
		int j = 0;
		while(j < data2.size()) {
			if(data2.get(j).equals("�����")||data2.get(j).equals("������")) {
				j++;
			}else {
				data2.remove(j);
			}
		}
		System.out.println(data2);
		
		/*
		  ¦���� ��� ����
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
