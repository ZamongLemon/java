public class Class2 {
	//package�� ������� ���� (default��)
	
	public static void main(String[] args) {
		// ������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���޹ޱ�
		
		inject.oksign(); // static void ���� �����Ҵ� ���� ��밡��
		inject.test();
		members.user("�̼���");//��ȣ���� ������ (���ڰ�)
		members.calc(5, 10);//members Ŭ���� ���� calc��� �Ϲ��Լ��� 5�� 10�� ���ڰ����� ����
	}
	
}
class inject{
	// public static void : ���� �⺻�̵Ǵ� �Ϲ� �Լ��� ���մϴ�.
	public static void oksign() {
		String user="ȫ�浿";
		System.out.println(user);
	}
	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa+bb;
		System.out.println(cc);
	}
	
	
}
class members{
	public static void user(String t){
		System.out.println(t+"�� ȯ���մϴ�.");
	}
	
	public static void calc(int a,int b) {// (�ڷ��� �̸�,�ڷ��� �̸�) ���ڰ� 2���� ����
		System.out.println(a*b);//����ؼ� println
	}
}

