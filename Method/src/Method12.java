
public class Method12 {

	public static void main(String[] args) {
		
		
		bbox2 bb2 = new bbox2();
		bb2.b2("�̼���");
		bbox bb = new bbox();
		System.out.println(bb.user_info);
		System.out.println(bb2.abc());
	}

	
}

class bbox{ //�⺻ �ܺ� class1 main���� �ʿ��� ������ üũ 
	protected String user_info;
	private String user_pw;
	public String user_rpw;
	public bbox(){
		this.user_info = "ȫ�浿";
		this.user_pw ="abcd";
		this.user_rpw = this.user_pw.replace("abcd", "0x5d323dfd");
	}
	public void b() {
		System.out.println(user_pw);
	}
	public String abc() {
		String email = "hong@nate.com";
		return email;
	}
}
class bbox2 extends bbox{ //bbox �� ���� ��� ������ bbox2�� �����ϰԵ�
	// �� , private�� �µ� ���� �������� ����
	
	public void b2(String nm) { // main Ŭ�������� bbox2�� �ε� �� �ش� ���� �μ����� �����Ͽ� 
		// bbox class �� �ʵ���� user_info�� �����ϰԵǴ� ����
		this.user_info = nm;
		System.out.println(this.user_info);
		System.out.println(this.user_rpw);
	}
}