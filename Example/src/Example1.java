import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		   ���빮�� 
		   while������ �ڵ带 �ۼ��ϸ� , ���μ����� ������ �����ϴ�.
		   ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		   ù��° ������ "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ� ���������ݾ׿� �߰���
		   2��� �Է½� ���� �����ݾ׿� �߰����� ����
		   �� ����Ƚ�� 4�� �������� ���� �����ݾ��� �������� �ڵ��ۼ�
		 */
		
		Scanner scan_num = new Scanner(System.in);
		int temp,sum=0,i=0;
		while(i<4) {
			System.out.println("7000 �����Ͻðڽ��ϱ�?");
			temp = scan_num.nextInt();
			if(temp ==1) 
			{
				sum+=7000;
			}
			i++;			
		}
		System.out.println("���� �����ݾ� : " + sum);
		
		scan_num.close();

	}

}
