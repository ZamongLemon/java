
public class Method6 {

	public static void main(String[] args) {
		

		String userid = "hong";
		String skey = "a1234567";
		insert i = new insert();
		i.userid = userid;
		String result = i.checks(skey);
		System.out.println(result);
	}

}

class insert{
	String userid= null;
	private String key = null;
	public String checks(String key_get) {// �ش� Ŭ�������� ����Ǵ� key ��
		this.key = key_get;
		String msg = null;
		if(key.equals("a1234567")) { // �ش� Ű��(private)�� �ܺ� class���� �Ѿ���� �μ����� ��
			if(userid.equals("hong")) {
				msg = "�����Ͱ��� Ȯ���߿� �ֽ��ϴ�.";			
			}else {
				msg = "�ش� �����Ͱ��� Ȯ������ ���մϴ�.";
			}	
		}else { // �ܺ� class���� �ùٸ� Ű���� ���޵��� ���� ���
			msg = "error";
		}
		return msg; // ��������� ���� return���� ȸ��
	}
}