
public class Class4 {

	public static void main(String[] args) {
		
		//Member �ν��Ͻ��� �ʵ尪�� �ε��� -> agree ��� �ʵ� ��������� ����
		Member mb = new Member(); // ��ü : Member �ν��Ͻ� : mb new Member() :�޸𸮿� �ν��Ͻ����� �����Ͽ� ����� �� �ֵ��� ��
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25* mb.user_agree;
		System.out.println(total);
		final int agree = mb.user_agree; //Member �ν��Ͻ� �ʵ尪�� �ε��� -> agree ��� �ʵ� ��������� ����
		mb.user_agree = 80;	
		System.out.println(mb.user_agree);
		System.out.println(agree);
		/*
		   �Ϲ� Ŭ���� �޼ҵ� �κ�
		   �Ϲ� Ŭ���� �޼ҵ� ���� ������ ��ü �� �ν��Ͻ��� ���� �ʿ䰡 �����ϴ�.
		   static ��ü�� �޸� �ν��Ͻ��� ����Ѵٴ� ��
		 */
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		coupon.events();
		
		Member.memver_event();
		
		
	}

}


class Member{ //Ŭ���� 
	String user_name; //���� �ʵ��
	int user_age;
	int user_level;
	int user_agree=6; // ���� �ʵ�� �ʵ尪�� ����;
	public static void memver_event() {
		coupon.events();// Ŭ������ ���� �޼ҵ带 �ٷ� ȣ�Ⱑ��
		//��, events ��� �޼ҵ忡 ���� �ʵ� �� ���� �ʵ尪�� class�� �����ϰ� �Ǹ� ��ü+�ν��Ͻ��� �����ؾ� �ε尡 ��
	}
	
}
/*

	�ϳ��� Project�� ���� �ٸ� package�� �ѹ� ����� Class���� �ٸ� ������ ����Ͻ� �� �����ϴ�.


*/
class coupon{
	public static void events() {
		int cp = 30;
		System.out.println(cp);
	}
}