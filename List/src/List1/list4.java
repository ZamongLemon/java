package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
	 	Integer[] numberdata1 ={3,6,9,12,15};
	 	LinkedList<Integer> ln =new LinkedList<>(Arrays.asList(numberdata1));
	 	System.out.println(ln);
	 	
	 	Scanner scan_int = new Scanner(System.in);
	 	LinkedList<Integer> list = new LinkedList<>();
	 	String user;	 	
	 	//for(;;) ���ѷ��� 
	 	while(true) {//���ѷ���
	 		System.out.println("���ڸ� �Է��ϼ���");
	 		user = scan_int.next();
	 		try {	//����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
	 		int num = Integer.parseInt(user);
	 		list.add(num); 		
	 		System.out.println(list);
	 		if(list.size()>5) {break;} // 5������ �ԷµǸ� ���ѷ��� ��������
	 		}catch(Exception e){ // ������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
	 			System.out.println("�ش� �Է»����� �����Դϴ�.");	 		
	 		}
	 	}
	 	scan_int.close();
	 	
	 	
	}
}
