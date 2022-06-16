
public class awt6 {

	public static void main(String[] args) {
	
		authentication aut = new authentication();
		aut.design();

	}

}
class authentication extends awt6_abstract{
	private String pass="";
	@Override
	public void makeNumber() {
		pass="";
		for (int i = 0 ; i < 4 ;i++){
		int t = (int)(Math.random()*10);
		pass+= Integer.toString(t);
		}
		System.out.println(pass);
	}
	@Override
	public void checkNumber() {
		String text="인증번호를 확인하시기 바랍니다.";
		String c = mid.getText();
		if(c.equals("")) {
			text= "입력되지 않았습니다.";
		}else if(c.equals(pass)) {
			text = "인증이 완료 되었습니다.";
		}
		msg.setText(text);
	}
}
