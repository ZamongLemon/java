
public class Example6 {

	public static void main(String[] args) {
		/*
		  1~10 ��������Ǵ� �ݺ���
		  ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
		  �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū�� ���Ѱ��� ū���� ���
		 */
		int a=1,b=0;
		for (int i = 1 ; i <= 10; i++) {
			if(i<=5) {
				a*=i;
			}
			else {
				b+=i;
			}
		}	
		if(a>b) {
			System.out.println("1~5���� ���� ���� �� Ů�ϴ�.");
		}else if(a<b) {
			System.out.println("6~10���� ���� ���� �� Ů�ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}

	}

}
