import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// ���� �̿����� ���� ���� ���α׷�
		// �����׸� ��ü 3���� ��� true �� ����Ǿ�� ����
		// ����ڿ��� "�����׸� �����Ͻðڽ��ϱ�?" ���
		// ���� �׸��� �Ѱ����� ��������������� "��� �����ϼž����� ����˴ϴ�."���
		// ��� �����Ұ�� "ȸ�������� �Ϸ�Ǿ����ϴ�."���
		Scanner scan_bool = new Scanner(System.in);
		boolean a=false,b=false,c=false;
		int temp=0;
		for(int i = 0; i < 3 ; i ++) {
			System.out.println("�����׸� �����Ͻðڽ��ϱ�? ���ǽ�(1) ");
			temp=scan_bool.nextInt();
			if(i==0 && temp==1) {
				a=true;
			}else if(i==1 && temp==1) {
				b=true;
			}else if(i==2 && temp==1) {
				c=true;
			}
		}
		
		if(a&&b&&c) {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("��� �����ϼž߸� ����˴ϴ�.");
		}
		scan_bool.close();
		

	}

}
