package Ab;
//interface ������� �޼��常 ����, �߰��� ������ ó���ϴ� ������ default �߰���
public interface method_2inter { // interface �� method �̹Ƿ� field�� �ڷ����� �ø� �� ����
	public String names();
	default void setbox(String name) {//setter 
		System.out.println(name);
	}
	default void box3(String n) {//getter
		System.out.println("test");
	} // default ���� �������̽����� �޼ҵ� �ۼ�����
	
}
interface method_2re extends method_2inter{ // interface��extends�� ���� interface�� ��Ӱ��� 
	
}
