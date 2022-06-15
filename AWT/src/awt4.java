public class awt4 {

	public static void main(String[] args) {
		
		decorate de = new decorate();
		de.view();

	}

}

class decorate extends awt4_class{
	
	@Override
	public String btn_push(int t){
		String msg ="";
		for(int i = 1 ; i < 10 ; i++) {
			msg+=t+"*"+i+"="+i*t+"\n";
		}

		return msg;
	}
}