import java.util.Scanner;

public class Scan5 {
	public static void main(String[] args) {
		byte a = 20;
		if (a < 10) {
			System.out.println("10 �̻��� ���ڸ� �Է��ϼ���");
		} else if (a >= 10 && a <= 22) { // ���ǹ��� ������ ����
			System.out.println("��÷�Դϴ�.");
		} else {
			System.out.println("���� ���� �����Դϴ�.");
		}

		// 1~45���� ���� �ϳ��� �Է��ϼ���
		// 0�� �Է� : �����Է��� �߸� �Ǿ����ϴ�.
		// 45���� ū ���� �Է� : ���ڴ� 1~45������ �Է� �����մϴ�.

		Scanner t = new Scanner(System.in);
		System.out.println("1~45������ ���� �ϳ��� �Է��ϼ���.");
		int n = t.nextInt();

		if (n <= 0) {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
		} else if (n>45){
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		} else {
			if (n == 7 || n == 12 || n == 14) {
				System.out.println("��÷�Դϴ�.");
			} else {
				System.out.printf("������ȸ�� �����ϼ���.");
			}
		} 

		t.close();
	}

}
