
public class For1 {

	public static void main(String[] args) {
		/*
		 * ������ 2~3�� ���
		*/
		/*
		int f=2,ff;//�ݺ����� ����� ���������� �̸� �Ͽ���
		for ( f = 2 ; f <4 ;f++ ) { //ū �ݺ��� 2~3���� 
			for( ff = 1 ; ff<10 ; ff++) {//���� �ݺ��� 1~9����
				System.out.println(f+ " * " + ff + " = " + f*ff ); //���� �ݺ����� �۵��Ҷ����� ���
			}
		
			System.out.println("==============");
		}
		*/
		/* ���빮��
		 * ������ 5~7�ܱ��� ����� �ϵ� 4������ ���������� ������ ���ı��� ����Ͻÿ�
		 * 5*1 ~ 7*4
		 * �ش������� �� �հ�
		 */
		int sum = 0;
		for ( int i  = 5 ; i <8 ;i++ ) { 
			for( int j = 1 ; j<5 ; j++) {
				System.out.println(i+ " * " + j + " = " + i*j ); 
				sum+=i*j;
			}
		
			System.out.println("==============");
		}
		System.out.println("�� �հ� : "+sum);
		System.out.println("==============");
		
	}

}
