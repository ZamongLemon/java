
public class oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		System.out.println(ab.c());
		ab.ab_a();

	}

}
abstract class ab_1{ // �߻� Ŭ���� (�ܺο��� �ε尡 ���� �ȵ�) - ��ü ����(X)
	int c ;
	public void ab_a() { this.c = 123456;}  // ��� �ص� �ǰ� ���ص� ��
	public void ab_a(int a) {} // free (�μ��� �޴� �߻� �޼ҵ�)
	public abstract void ab_c(); // free���� �ڽ�Ŭ������ ����ؾ���
	public abstract int b();//�߻� �޼ҵ�
}
class ab_2 extends ab_1{
	@Override
	public void ab_a() {
		System.out.println(this.c);
	}
	@Override
	public int b() { //���� �޼ҵ� + �߻� �޼ҵ� 
		
		return 55;
	}
	@Override
	public void ab_c() {
		
	}
	public int c() {
		return 99;
	}
}

