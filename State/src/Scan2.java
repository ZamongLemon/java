import java.util.Scanner;
public class Scan2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String mid = a.next();
		System.out.println(mid);
		
		if(mid.equals("kim") || mid.equals("hong")) {
			//���ڿ� ���´� scanner�̿�� equals��� �Լ��� ���ؼ� ��
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}else {
			System.out.println("Ȯ�ε��� �ʽ��ϴ�.");
		}
		
		a.close();
		

	}

}