
public class Method13 {

	public static void main(String[] args) {
		// extends : inherit(���)
		// �θ� Ŭ���� �����ڿ� �μ����� �����ϸ� �ڽ�Ŭ�������� �ε带 ����
		// �� �ڽ� Ŭ�������� �μ����� ���� ������ ��밡��
	//	mth1 m1 = new mth1();
	//	mth2 m2 = new mth2(50);
		
		
	}
}


class mth1{
	public int no;
	public mth1() {
		this.no = 20;
		System.out.println(this.no);
	}

}
class mth2 extends mth1{
	public mth2(int z) {
		this.no = z;
		System.out.println(this.no);
	}	
}