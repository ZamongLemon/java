package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 	���빮��. ����ڰ� ���� ���ڸ� �Է� �޽��ϴ�. Scanner
		 	��,����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 	�� ���� �Է��� 7���̸�, �Է��� ���ڸ� ������������ �����մϴ�.
		 	
		 	�������� �����  6,22,37,44,45,80,100
		 	�߰��ɼ� > ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
		 	
		 */	
		sortingNum sN = new sortingNum();
		sN.getNum();
	}
}

 class sortingNum{
	 ArrayList<Integer> listNum = null;
	 ArrayList<Integer> listNumOdd = null;
	 public void getNum() {
		 if(this.listNum == null) {
			 this.listNum = new ArrayList<>();
		 }
		 if(this.listNumOdd==null) {
			 this.listNumOdd = new ArrayList<>();
		 }
		 Scanner scan_num = new Scanner(System.in);
		 int i = 0; 
		 while(i<7) {
			 System.out.println("������ �Է��ϼ���.");
			 String temp = scan_num.next();
			 try {
				 int tempInt = Integer.parseInt(temp);
				 
				 if(tempInt%2 ==0) {
				 this.listNum.add(tempInt);				 
				 }else {
					 this.listNumOdd.add(tempInt);
				 }
			 }catch(Exception e){
				 System.out.println("������ �Է��ϼž� �մϴ�.");
			 }
			 i++;
		 }		 
		 scan_num.close();
		 Collections.sort(this.listNumOdd);
		 Collections.sort(this.listNum);
		 System.out.println(this.listNumOdd);
		 System.out.println(this.listNum);
	 }
	
}
