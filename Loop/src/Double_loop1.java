import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY-M-dd");
		System.out.println(date.format(today));
		SimpleDateFormat time = new SimpleDateFormat("hh:m:ss a");
		System.out.println(time.format(today));
		
		//format: �԰�ȭ�� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
		
		//���빮�� 
		/*
		 * 3���� ��ǰ
		 	���ڵ�� ��ǰ�� �Է½��� �ּ���. �ݾ��� �Է� "����%�� �Է����ּ���:" ��� ������ �Բ� 
		 	�ش� ���� ���ڸ� �Է��ϸ� �����ݾ��� ����Ǿ� ��µǵ��� �մϴ�.
		  
		*/
		double money=0 ;
		Scanner scan_num = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("��ǰ������ �Է����ּ���.");
			money+=(double)scan_num.nextInt();
		}
		System.out.printf("�� ��ǰ���� : %.0f ���Դϴ�.\n",money);
		System.out.println("���� %�� �Է����ּ���: ");
		double discount = scan_num.nextInt();
		discount = 1-discount/100; 
		money *= discount;
		
		System.out.printf("�����ݾ� %.0f ���Դϴ�.",money);
		
		
	}

}
