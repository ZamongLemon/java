
public class Score2 {
	String[][] datas = {
		 	{"������","�̰���","���","������","������"},
		 	{"80","78","92","67","40"},
		 	{"40","80","80","92","100"},
		 	{"95","30","55","90","65"},
		 	{"20","80","100","95","30"}	
		 	};
	private String name;
	private String subject;
	private String sign = "false";
	private String score= "100��";
	private int index = 0;
	public void data(String name,String subject) {
		this.name = name;
		this.subject = subject;
		int ea = datas[0].length;
		int w =0;
		while(w<ea) {
			if(this.subject==null && this.name!=null) {
				if(this.name.equals(datas[0][w])) {
					this.sign = "true";
					this.index = w;
				}
			}
			w++;
		}
		if(this.sign =="true" && this.subject!= null) {
			switch(this.subject){
			case "����" -> this.score = datas[1][this.index];
			case "����" -> this.score = datas[2][this.index];
			case "����" -> this.score = datas[3][this.index];
			case "����" -> this.score = datas[4][this.index];
			case "��ü" -> this.score = datas[1][this.index]+","+
						 datas[2][this.index]+","+
						 datas[3][this.index]+","+
						 datas[4][this.index];			
			}
		}
	}
	public String gtdata() {
		if(this.sign.equals("true")&& this.subject==null){
			return this.sign;
		}
		else if(this.sign.equals("true") && this.subject!=null){
			return this.score;
		}
		return null;
		
	}
}
