package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>(); // �ڷ����� ���� ����

		int w = 0;
		while(w<5) {
			System.out.println("�����͸� �Է� ���ֽñ� �ٶ��ϴ�.");
			list.add(scan.next());
			w++;
		}
		int ww =0;
		int total = 0;
		do {
			try {
				Object k = list.get(ww); // �迭�ڷᰡ ����+���� ���·� ������ �Ǿ� �ִ°�� Object�� �Ű�Ÿ������ ����
				int numbers = Integer.parseInt(k.toString());//�ش� �Ű��� ����ȭ �Ͽ� ������ �ٲܼ� �ִ��� üũ
				total+=numbers;
			}
			catch(Exception aa) {//�迭�� Ÿ���� ���ڰ� �ƴ� ��� ����ó��
				
			}
			ww++;
		}while(ww<list.size());
		System.out.println("�Է��� ��� �迭�� ���� ����: " + total + " �Դϴ�.");
		scan.close();

	}

}
