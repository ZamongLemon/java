import java.util.ArrayList;
import java.util.Arrays;

//중복 아이디 체크 시스템 만들기 : awt5_abstract 함께 사용

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
	private String cid = null ; //awt에서 넘어온 인수
	private String return_id = null;// awt로 값을 전달하는 전역변수 : null이면 사용가능 , id값이 전달되면 중복
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
			msg.setText("ID : "+ this.return_id+"가 등록됐습니다.");
		}else {
			msg.setText("중복된 ID입니다.");
		}
		System.out.println(this.db);
	}
	@Override
	public void dataload() {
		String[] user_data={"hong","lee","park","jong","kim"};
		this.db = new ArrayList<>(Arrays.asList(user_data));
		
	}
}