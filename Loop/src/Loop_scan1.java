import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String[] args) {
		//for�� + Scanner
		//���Ͻô� ������ �ܼ��� �Է��ϼ���

		Scanner aa = new Scanner(System.in); //�Է¿��� �ε�
		System.out.println("���Ͻô� ������ �ܼ��� �Է��ϼ���"); //����
		int bb = aa.nextInt(); //�Է��� ���� ����
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i*bb+" ");			
		}
		aa.close();
		System.out.println();
		

		
	}

}
