package List1;

import java.util.ArrayList;
import java.util.Arrays;
public class list1 {

	public static void main(String[] args) {
		//add(�߰�),get(�����ͷε�),remove(����),size(ũ��),asList : �ε��� �迭 ����
		//add�� index ���� ������ �� �ڿ� �߰� 
		/*
		String member[] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> members = new ArrayList<>(Arrays.asList(member));
	  	System.out.println(members.size());		 
		members.add("������");
		System.out.println(members);
		members.remove(1);
		System.out.println(members);
		members.add(2,"�������");
		System.out.println(members);
		String checks = members.get(2);
		System.out.println(checks);
		*/
		// Arraylist ���� int ���� ������� �ʰ� Integer
		
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		
		num.add(0,7);
		num.remove(3);
		num.set(5, num.get(5)+20);
		System.out.println(num);
	}

}
