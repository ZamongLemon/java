
public class Class7 {

	public static void main(String[] args) {
		// Class�� �⺻ �޼ҵ� ��ü �ʵ尪 ����
		String mid = "hong";
		String name = "ȫ�浿";
		java1 jv1 = new java1(mid,name);
		jv1.java2();

	}

}

class java1{
	//java1 class�� main ���� ��ü���� �� �ν��Ľ��� �����ϸ� �ٷ� �۵��ϴ� class �⺻ �޼ҵ� �Դϴ�.
	public java1(String a, String b) { // Ŭ������ �⺻���� ����ϴ� �޼ҵ�
		
		System.out.println(a+b);
		java2();
	}
	public void java2() {
		System.out.println("test");
	}
}