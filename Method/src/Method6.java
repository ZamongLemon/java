
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
	public String checks(String key_get) {// 해당 클래스에서 적용되는 key 값
		this.key = key_get;
		String msg = null;
		if(key.equals("a1234567")) { // 해당 키값(private)과 외부 class에서 넘어오는 인수값과 비교
			if(userid.equals("hong")) {
				msg = "데이터값을 확인중에 있습니다.";			
			}else {
				msg = "해당 데이터값을 확인하지 못합니다.";
			}	
		}else { // 외부 class에서 올바른 키값이 전달되지 않을 경우
			msg = "error";
		}
		return msg; // 최종결과에 대한 return으로 회신
	}
}