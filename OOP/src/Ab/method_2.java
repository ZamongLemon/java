package Ab;

// abstract�� interface �� ������ �� ������ 
public class method_2 {
	
	public static void main(String[] args) {
		loadinter ld = new loadinter();
		ld.box3("t");
	}
}
//�߿� abstract�� interface�� ��� static�� ����� �� ����

abstract class test{ // abstract ���� default�� ������� ����
	// �ʵ忡 �ڷ����� ������ �� ����
	String nn;
	public abstract void box();
	public static void box2() {
		System.out.println("test");
	}
}


class loadinter implements method_2inter,method_2inter2{ // interface�� ���߻�� ����
	public String names() {
		return null;
	}
	
}