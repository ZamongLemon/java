
public class Method7 {
	
	static String a;
	public static void main(String[] args) {
		apink ap = new apink("ȫ�浿",25,"test@test.com",-1000);
		System.out.println(ap.data3());
		System.out.println(ap.data());
		
	}
}

class apink{//private������ class�ʵ忡�� �����ؾ���
	
	private String nm;
	private int age;
	private String email;
	private int point;
	private String email_cp;
	
	public apink(String nm1,int age2,String email3, int point4) { // private �ȿ��� �������� ����
		this.nm = nm1;
		this.email = email3;
		
		if(point4<0) {
			this.point = 0;
		}else {
			this.point = point4;
		}
	}
	
	public void names() {
		if(this.nm =="ȫ�浿") {
			this.nm = "hong";
			String[] e = this.email.split("@"); // �̸����߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			this.email_cp = e[1];
		}
		
		System.out.println(email_cp);
	}
	public String data() {
		names();
		return this.nm;//return�� �Լ� �������� ���
	}
	public int data2() {
		//getter ����
		return this.age;
	}
	public String data3() {
		return this.email;
	}
	public int data4() {
		return this.point;
	}
}