
public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
			c=b*a; // �������
			System.out.printf("%d ",c);
			a++;
		}
		System.out.println("");

		/* ���빮��
		 
		 	56 49 42 35 28 21
		 
		*/
		
		int t=7,u=8;
		while(u>2) {
			System.out.printf("%d,",u*t);
			u--;
		}
		System.out.println("");
		
		// ����2
		// ���� ��� ���� Ȯ�� �Ͻ��� �ش� ������� �´� �ڵ带 �ۼ��Ͻÿ�
		// 4,7,10,13,16,19,22,
		
		int w=1;
		while(w<8) {
			System.out.printf("%d,",1+3*w);
			w++;
		}
		
	}

}
