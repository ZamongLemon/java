
public class If_for2 {
	
	public static void main(String[] args) {
		// 1~100 �� 80�̻� ���
		
		for(int i = 1 ; i<101 ; i ++) {
			if(i>=80) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n-------------------------------------");
		
		//200~300 ������ ���� �� 240������ ���ڸ� ���
		
		for(int j = 200 ; j < 301 ; j++) {
			if(j<=240) {
				System.out.print(j+" ");
			}
		}

		System.out.println("\n-------------------------------------");

		final int a= 3;
		int w;
		for(w = 1 ; w<11;w++) {
			if(w%a==0) {
				System.out.printf("%d ",w);
			}
			
		}
		
		System.out.println("\n-------------------------------------");
		//���빮�� ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10�̻� ���ڸ� ����մϴ�.
		final int t = 2;
		int p = 0;
		for (int k = 1 ; k<10 ; k++ ) {
			p = k*t;
			if(p>=10) {
				System.out.printf("%d ",p);
			}
		}
		
		/*
		 * ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�
		 * 
		 *  18 36 54 72
		 */
		System.out.println("\n-------------------------------------");
		
		for (int m = 1 ; m < 75 ; m++) {
			if(m%18==0) {
				System.out.printf("%d ",m);
			}
		}
		
		/*
		 	���빮�� ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �ۼ�
		 	6 14 17 19
		 */
		System.out.println("\n-------------------------------------");
		
		for (int u = 1 ; u< 21 ; u++) {
			if(u==6 || u== 14 || u ==17 || u==19 ) {
				System.out.printf("%d ",u);
			}
		}
		
		
	}
}
