package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*
		 	���빮�� ArrayList Ȥ�� LinkedList ���߿� ���ϴ� �޼ҵ带 �����Ͻø� �˴ϴ�
		 	2���迭 �ش� ������ ���� ���� ���Ͽ� ¦������ Ȧ������ �Ǻ��Ͻÿ�.
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
			System.out.println(sum + "�� Ȧ��");
		}else {
			System.out.println(sum + "�� ¦��");
		}
	}

}
