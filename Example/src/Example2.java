import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
			���빮��2
			����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�, �����ܿ� ���� ���� ����Ͽ� ¦������ Ȧ�������� ���
			
		*/
		
		Scanner scan_num = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int temp = scan_num.nextInt();
		int sum=0,i=1;
		while(i<10) {
			sum+=temp*i;
			i++;
		}
		if(sum%2 ==0) {
			System.out.println("���� ¦���Դϴ�.");
		}else{
			System.out.println("���� Ȧ���Դϴ�.");
		}
		scan_num.close();
	}

}


