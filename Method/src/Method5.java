
public class Method5 {

	public static void main(String[] args) {
		cdb c = new cdb();
//		c.d1 = "ȫ�浿";
//		c.data2();
//		cdb.d3= c.d1;
//		cdb.data1();
//		cdb.d3= "�̼���";
//		cdb.data1();
//		cdb.d3="������";
//		System.out.println((c.data3()));

		// c.d2 = "������"; //private�� ������ ��ü�̹Ƿ� main class ���� �ε� ����
		c.data2("������");
		
	}

}
class cdb{
	String d1 = null; // void, �ڷ��� �޼ҵ� �ε� ����
	private String d2="" ;
	public static String d3; // �� ��밡��
	
	public static void data1() {// static �ڷ��� �ܿ��� �ε� �Ұ���
		//System.out.println(d3);
		//System.out.println(this.d2);
		// static ���� this ��� �Ұ���
	}
	public void data2(String str){
		this.d2 = str;
		System.out.println(this.d2);
	}
	public String data3(){
		String a = this.d2;
		return a;
	}
}
