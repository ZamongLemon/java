package Ab2;

public interface app_data1 {
	String a = null ; // �ʵ忡 �ڷ����� ����ִ� ���� ����� ��� ������ �ȵ�
	int b = 0;
	public void user_join(); // ���� ������ method�� this ��� ����
	default void aaa() { //default���� this ����� ���� (���� ���� ���)
		//System.out.println(this.a);
	}
	
}
