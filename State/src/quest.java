import java.util.Scanner;

public class quest {

	public static void main(String[] args) {
		// ����ڰ� �Է��Ͽ� ���ǿ� �´� �޽����� ���
		// ù��° ���ڰ��� �Է�
		// �ι�° ���ڰ��� �Է�
		// ù��° ���ڰ� * �ι�° ���ڰ� <100 �϶� "100�̸��� ������Դϴ�." 100 >= "�ش� ���� 100�̻� �Դϴ�."
		Scanner scan_num1 = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = scan_num1.nextInt();

		Scanner scan_num2 = new Scanner(System.in);
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan_num2.nextInt();

		int answer = num1 * num2;

		if (answer < 100) {
			System.out.println("�ش簪�� 100 �̸��Դϴ�.");
		} else {
			System.out.println("�ش簪�� 100 �̻��Դϴ�.");
		}

		scan_num1.close();
		scan_num2.close();
	}

}
