
public class if3 {
	public static void main(String[] args) {
		
		// boolean : true, false�� ���е˴ϴ�.
		boolean ck=true;
		if (ck) {
			System.out.println("ȸ�������� ���� �˴ϴ�.");			
		}else {
			System.out.println("�̿����� �����ϼž߸� ���� �˴ϴ�.");
		}
		
		String name="park",pass="a1234";
		// && : �Ѱ��� �����̻� ��� ������� 
		// || : �Ѱ��� �����̻� ���� �Ѱ��� ���� ���
		if(name=="park" && pass=="a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");			
		} else {
			System.out.println("ID �� PW�� Ȯ���ϼ���");
		}
		
		if(name == "park" || name == "kim"){
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
	
	}
	
}
