
public class If_dowhile1 {
	
	public static void main(String[] args) {
		/*
			���빮�� ������ 6��
		*/
		int n = 1;
		do {
			if(n*6 >= 35) {
				System.out.printf("%d ",n*6);
			}		
			n++;
		}while(n<10);

		System.out.println("\n-------------------------------------");
		
		// ���빮�� 14 ~ 27 ������ ¦������ ���Ͽ� ���� ����� ��� 
		int k = 14 ,sum=0;
		do {
			if(k%2==0) {
				sum+=k;
			}
			k++;
		}while(k<28);
		System.out.printf("%d ",sum);

		System.out.println("\n-------------------------------------");
		
		
	}

}
