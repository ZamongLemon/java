import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		// Ŭ���� + �޼ҵ� + �迭
		String users[] = { "ȫ�浿", "�̼���", "������" };
		Scanner scan_name = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		String name = scan_name.next();
		arrays.check_user(users, name);
		scan_name.close();
		/*
		 * ���빮�� ����ڰ� �ڽ��� �̸��� �Է��մϴ�. ����� �̸��� �ش� class�� ������ ��ϵ� ����� ���� �� ������ ��������� Ȯ���ϴ�
		 * �ڵ带 �ۼ��Ͻÿ�. ��ϵ� ������ϰ�� "������ �Ǿ� �ֽ��ϴ�." �� ���� ������ϰ�� "�̰����� �Դϴ�."
		 */
	}

}

class arrays {
	
	public static void check_user(String[] a, String name) {
		boolean c=false;
		String msg=""; // �޼ҵ�� �ش簪�� �����Ҷ� ����ִ� ���� ��Ȯ�ϰ� �����ϼž� �մϴ�.
		// String "" or null       int =0
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(name)) {
				msg ="������ �Ǿ� �ֽ��ϴ�.";
				c=true;
				break;
			}
		}
		if (!c) {
			msg="�̰����� �Դϴ�.";
		}
		arrays ar = new arrays();
		ar.message(msg);

		
	}
	public void message(String m) {
		System.out.println(m);
	}
	
}
