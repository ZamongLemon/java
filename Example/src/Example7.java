import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		  ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� ����ϴ� ���μ��� �ۼ�
		  "ù��° �Է°� �� (1~10����) �Դϴ�.";
		  "�ι�° �Է°� �� (1~10����) �Դϴ�.";
		  "����° �Է°� �� (1~10����) �Դϴ�.";
		  "������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�."
		  �ش� �����ȣ�� �°� ������ �����Ͽ� �������� ��½�Ű��		  
		 */
		
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		String p;
		
		System.out.println("ù��° �Է°� �� (1~10����) �Դϴ�.");
		a = scan.nextInt();
		System.out.println("�ι�° �Է°� �� (1~10����) �Դϴ�.");
		b = scan.nextInt();
		System.out.println("����° �Է°� �� (1~10����) �Դϴ�.");
		c = scan.nextInt();		
		System.out.println("������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�.(+,-,*,/)");
		p = scan.next();
		int ans=a;
		if(p.equals("+")) {		
			ans += b+c;
		}else if(p.equals("-")) {
			ans -= b+c;
		}else if(p.equals("*")) {
			ans *= b*c;
		}else if(p.equals("/")) {
			ans /= b;
			ans /= c;
		}
		System.out.println(ans);
		
		
		scan.close();
	}

}
