
public class Class1 {

	public static void main(String[] args) { //�Ϲ� main�Լ�
		Adata a = new Adata();
		Bdata b = new Bdata();
		
		System.out.println(a.aa);
		System.out.println(b.aa);

		// Cdata���� ���� �ڷ����� ������ => ���� �⺻�Լ����� ���� �Է��� �� ��ü���� �޾� ��������� ��� /�ν��Ͻ�
		Cdata c = new Cdata();
		c.aa= 10;
		c.bb = 30;
		c.cc=c.aa+c.bb;
		System.out.println(c.cc);
	}

}

//aa �� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ����� �ʽ��ϴ�.
class Adata{
    String aa = "ȫ�浿";

}

class Bdata{
	String aa = "�̼���";
}
class Cdata{
	//�ش� Cdata�� Ŭ�������� �ڷ����� ���� ������ �����մϴ�.
	//�������� �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout��������� ����
	int aa;
	int bb;
	int cc;
}
