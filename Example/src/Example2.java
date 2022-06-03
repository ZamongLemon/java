import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		
		 	 배열 기본 클래스 메소드 문제
		 	 
		 	 product: {"수박","참외","사과","배","딸기","키위","바나나","망고"}
		 	 중참외 배 키위 를 삭제
		 	 
		 	 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성
		 */
		
		String[] product = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		String[] delete = {"참외","배","키위"};		
		Example2 ex2 = new Example2();
		ex2.sorting(product, delete);
		ex2=null;
	}
	
	void sorting (String[] fruits,String[] del) {
		int count=0;
		for(int i= 0 ; i < fruits.length ; i++) {
			for(String name : del) {
				if(fruits[i].equals(name)) {
					fruits[i]="0";
					count++;
					break;
				}
			}
		}
		String[] newProduct = new String[fruits.length-count];
		int j=0,k=0;
		do {
			if(!fruits[j].equals("0")) {				
				newProduct[k]=fruits[j];
				k++;
			}
			j++;
		}while(j<fruits.length);	
		System.out.println(Arrays.toString(newProduct));
	}

}
