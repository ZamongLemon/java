import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		
		 	 �迭 �⺻ Ŭ���� �޼ҵ� ����
		 	 
		 	 product: {"����","����","���","��","����","Ű��","�ٳ���","����"}
		 	 ������ �� Ű�� �� ����
		 	 
		 	 �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ�
		 */
		
		String[] product = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		String[] delete = {"����","��","Ű��"};		
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
