import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		
		String pay = "������ü";
		if(pay.equals("�ſ�ī��")) {
			da.pay1();
		}
		else {
			da.pay2(pay); // �޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ�)
		}
		
		
		agrees ag = new agrees();
		Scanner scan_text = new Scanner(System.in);
		System.out.println("�����Ͻø� '������' ��, �������� �����Ŵٸ� '���Ǿ���'�� �������ֽʽÿ�.");
		String agree = scan_text.next();
		ag.process(agree);
		scan_text.close();
	}

}
class datalist{
	/* static �޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ� �ϴ� �κп����� static�� �̿��Ͽ� ���

	// static(���� �޼ҵ�) : �������̵��� ����� �� ����
	// void�� ���(���� �޼ҵ�) : �������̵��� ����� �� �ֽ��ϴ�.
	// �������̵� ���� 
	
	 	class a{
	 	void �޼ҵ�
	 	}
	 	class b extend a {
	 	void �޼ҵ�
	 	}
	 	
	 */
	public void array_data(int num){//static ���� �޼ҵ�
		
		int w = 1;
		while(w<9) {
			System.out.println(num*w);
			w++;
		}
	}
	public void pay1() {
		System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}
	public void pay2(String pm) {
		System.out.println(pm+"�� ���� �����մϴ�.");
	}
}
/* ���빮�� �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
	main �޼ҵ忡�� ����ڰ� "������","�������� ����" �� �Է��ϰ� �˴ϴ�.
	���������� �Էµɰ�� "ȸ�������� ����˴ϴ�."��� �޽����� ����ϰ�, ���Ǿ��� �� �Է½� "���Ǹ� �ϼž� ����˴ϴ�."��� ����ϵ��� �Ͻÿ�.
	��,agrees Ŭ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 �����Ͻÿ�.
*/

class agrees{
	void process(String ag) {
		if(ag.equals("������")) {
			System.out.println("ȸ�������� ����˴ϴ�.");
		}
		else if(ag.equals("���Ǿ���")) {
			System.out.println("���Ǹ� �ϼž� ����˴ϴ�.");
		}else {
			
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}
	}

	
}

