import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = {5,10,15,20,25,30,35};
		//foreach ���� ����Ҷ��� �ε��� ��ȣ�� �ʿ���� ����� ���
		//for, do while���� �ε��� ��ȣ�� �ʿ��� �� 
		// �ε�����ȣ [0][1][2]
		for(int f : arr ) { // int f �� ���������� data �迭���� �޾Ƽ� ����
			if(f%2==0) {
		//	System.out.println(f);
			}
		}
		/*
		String pay[] = {"�������Ա�", "�ſ�ī��","�޴���","��ǰ��","����"};
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϰ��� �ϴ� ���¸� ������ �ּ���.");
		String pm = scan.next();
		for(String z: pay) { // �迭 �����Ͱ� �����̹Ƿ� �޴� ���� ���¶��� �������� ����ؾ� �մϴ�.
			if(z.equals("�޴���")) {
				System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
			}else {
				System.out.println(pm+"(��)�� �������� �˴ϴ�.");
			}
		}
		scan.close();
		*/
		/*
		 	���빮��
		 	{"�ܹ���","����","ġŲ","Ŀ��"} 
		 	�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.
		 	�ش� ������ �� 4���� ����� �˴ϴ�.
		 	��,"�ֹ�����"��� �Է½� �� ��� �ֹ��� ����Ǹ�, �ֹ������� ����Ͻø� �˴ϴ�.
		 */
		String food[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		String[] orderedList = new String[4];
		Scanner scan_food = new Scanner(System.in);
		int c=0;
		for(int i=0 ; i < 4 ; i++) {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ ������ �ּ���.");
			String temp = scan_food.next();
			if(temp.equals("�ֹ�����")) {
				break;
			}else {
				int k =0;
				while(k<food.length) {
					if(temp.equals(food[k])) {
						orderedList[c] = temp;
						c++;
					}
					k++;
				}

			}
		}
		for(String ordered : orderedList) {
			if(ordered!=null) {
			System.out.printf("%s ",ordered);
			}else {
				break;
			}
		}
		scan_food.close();
	}
}
