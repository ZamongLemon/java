
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
		String text="������ȣ�� Ȯ���Ͻñ� �ٶ��ϴ�.";
		String c = mid.getText();
		if(c.equals("")) {
			text= "�Էµ��� �ʾҽ��ϴ�.";
		}else if(c.equals(pass)) {
			text = "������ �Ϸ� �Ǿ����ϴ�.";
		}
		msg.setText(text);
	}
}
