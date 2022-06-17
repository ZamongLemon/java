package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 	응용문제. 사용자가 직접 숫자를 입력 받습니다. Scanner
		 	단,사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 	총 숫자 입력은 7번이며, 입력한 숫자를 오름차순으로 정렬합니다.
		 	
		 	최종적인 출력은  6,22,37,44,45,80,100
		 	추가옵션 > 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
		 	
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
			 System.out.println("정수를 입력하세요.");
			 String temp = scan_num.next();
			 try {
				 int tempInt = Integer.parseInt(temp);
				 
				 if(tempInt%2 ==0) {
				 this.listNum.add(tempInt);				 
				 }else {
					 this.listNumOdd.add(tempInt);
				 }
			 }catch(Exception e){
				 System.out.println("정수를 입력하셔야 합니다.");
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
