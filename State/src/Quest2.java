import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		System.out.println("1�� �Է½� �Ա�, 2�� �Է½� ��� �Դϴ�.");
		Scanner i = new Scanner(System.in);
		int k = i.nextInt();

		int asset = 100000;
		if (k == 1) {
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
			Scanner input = new Scanner(System.in);
			int c_input = input.nextInt();
			System.out.printf("�ܾ� %d �� �Դϴ�.", asset + c_input);

			input.close();
		} else if (k == 2) {
			System.out.println("����� �ݾ��� �Է��ϼ���.");
			Scanner output = new Scanner(System.in);
			int c_output = output.nextInt();
			if (asset >= c_output) {
				System.out.printf("�ܾ� %d �� �Դϴ�.", asset - c_output);
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			
			output.close();
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}

		i.close();
	}

}
