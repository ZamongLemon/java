package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/* ����ڰ� �ݾ��� �Է��մϴ�.
			Ƚ���� 8��
			0~n���� �Է°���
			�ش� �Է��� ��� ������ ���� �հ踦 ��� ��Ű�ÿ�.
		
		*/
		Scanner scan_int = new Scanner(System.in);
		ArrayList<Integer> prices = new ArrayList<>();
		String price="";
		int sum=0;
		while(true) {//���ѷ���
	 		System.out.println("�ݾ��� �Է��ϼ���");
	 		price = scan_int.next();
	 		try {	//����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
	 		int num = Integer.parseInt(price);
	 		sum+=num;
	 		prices.add(num);	
	 		if(prices.size()==8) {break;} // 8������ �ԷµǸ� ���ѷ��� ��������
	 		}catch(Exception e){ // ������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
	 			System.out.println("�ش� �Է»����� �����Դϴ�.");	 		
	 		}
	 	}
		
		
		scan_int.close();
		System.out.println("�� �Աݾ��� " +sum+ "���Դϴ�.");
	}

}
