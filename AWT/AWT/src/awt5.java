import java.util.ArrayList;
import java.util.Arrays;

//�ߺ� ���̵� üũ �ý��� ����� : awt5_abstract �Բ� ���

public class awt5 {
	/*
	  String[] user_data={"hong","lee","park"};
	 */
	
	
	public static void main(String[] args) {
		
		callawt ca = new callawt();
		ca.design();
	}

}

class callawt extends awt5_abstract{
	private String cid = null ; //awt���� �Ѿ�� �μ�
	private String return_id = null;// awt�� ���� �����ϴ� �������� : null�̸� ��밡�� , id���� ���޵Ǹ� �ߺ�
	private ArrayList<String> db = null;
	@Override
	public String signok() {
		if(this.db.stream().filter(k -> k.equals(cid)).findFirst().orElse(null)==null) {
			return this.return_id = this.cid;
		}
		return null;
	}
	@Override
	public void idcheck(String id) { 
		this.return_id = null;
		this.cid = id;
		if(this.db==null) {
			dataload();			
		}
		if(signok()!=null) {
			this.db.add(this.return_id);
			msg.setText("ID : "+ this.return_id+"�� ��ϵƽ��ϴ�.");
		}else {
			msg.setText("�ߺ��� ID�Դϴ�.");
		}
		System.out.println(this.db);
	}
	@Override
	public void dataload() {
		String[] user_data={"hong","lee","park","jong","kim"};
		this.db = new ArrayList<>(Arrays.asList(user_data));
		
	}
}