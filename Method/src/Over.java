
public class Over {

	public static void main(String[] args) {
		cd c = new cd();
		c.display("���γ��� ���");//�����ε�
		c.display(); // �������̵�
		
		
	}

}

// overloading ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
// override �θ� Ŭ�������� ��ӹ��� ���� �޼ҵ带 ����ϴ� ���� ����
class pt{
	public void display() {
		System.out.println("�ܺ� ���� ��");
	}
	public void aaaa() {
		System.out.println("��");
	}
}
class cd extends pt{
	//aaaa()�޼ҵ尡 Override annotation�� ����Ϸ��� �θ� class ���� �����ؾ���
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	
	
	@Override // ���� �߻��� Ȯ�� (�������̵忡�� ����)
	public void display() {
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display();//�θ� �ִ� ���� �Ӽ� �޼ҵ� ���� �����ö� super�� ��� 
	}
	public void display(String msg) {
		System.out.println(msg);
	}

}