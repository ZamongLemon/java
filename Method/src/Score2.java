
public class Score2 {
	String[][] datas = {
		 	{"박은경","이경훈","장운","조기현","김진수"},
		 	{"80","78","92","67","40"},
		 	{"40","80","80","92","100"},
		 	{"95","30","55","90","65"},
		 	{"20","80","100","95","30"}	
		 	};
	private String name;
	private String subject;
	private String sign = "false";
	private String score= "100점";
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
			case "국어" -> this.score = datas[1][this.index];
			case "수학" -> this.score = datas[2][this.index];
			case "과학" -> this.score = datas[3][this.index];
			case "역사" -> this.score = datas[4][this.index];
			case "전체" -> this.score = datas[1][this.index]+","+
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
