
public class Example1 {

	public static void main(String[] args) {
		/*
		 	�迭+�⺻(Ŭ����)�޼ҵ幮��
		 	1���迭�� ������ ���� ���� �ֽ��ϴ�.
		 	�迭����Ʈ 22 33 44 55 66 77 88 99 �̸�
		 	�ش� ��ü ���� ��� ���� �� �հ谪�� ������ �޼ҵ�� 
		 	ó�� �ǵ��� �մϴ�. ��, �ݺ����� ������ do~while������ �ۼ� �մϴ�.
		 */

		int[] ar = {22,33,44,55,66,77,88,99};
		Example1 ex1 = new Example1();
		ex1.calcSum(ar);
		ex1 = null;
		
	}
	
	void calcSum(int[] arr) {
		int n=0,sum=0;
		do {
			sum+=arr[n];
			n++;
		}while(n<arr.length);
		
		System.out.println("���� "+sum+" �Դϴ�.");
	}
	

}
