package Ex;

import java.util.*;
import java.io.*;
public class Example2 {

	public static void main(String[] args) {
		/*
		 	회원정보 DB가 있는 상황입니다.
		 	해당 정보중에서 naver.com 메일 주소를 사용하는 고객이름과 총 인원수 출력 하시오
		 	DB를 로드시 추상클래스에서 로드 되도록 합니다.
		 	{"이름","통신사","전화번호","나이","주소","email","point"};
		 */
	
		set newset = new set();
		//newset.callFile();
		newset.find("nate.com");
	}

}
abstract class db{
	public String[][] datas =null;
	public ArrayList<String[]> datas2 = null;
	public abstract void finding(String a);
	public abstract void callDB();
	protected abstract boolean findEmail(String a , int i);
}
class set extends db{
	
	public void find(String email) {
		callDB();
		finding(email);
	}
	@Override
	public void finding(String email) {
		List<String> names = new ArrayList<>();
		int k = this.datas2.size();
		for(int i = 0 ; i < k ; i++) {
			if(findEmail(email,i)) {
				names.add(this.datas2.get(i)[0]);				
			}
		}
		System.out.println("이메일 "+email+" 사용자는 " + names + " 총 "+names.size()+"명 입니다.");
	}
	@Override
	protected boolean findEmail(String email, int i ) {
		boolean b = false;
		String getEmail = this.datas2.get(i)[5].split("@")[1];
		if(getEmail.equals(email)) {
			b = true;
		}	
		return b;
	}
	
	@Override
	public void callDB(){
	
    String[][] users ={
    		 {"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
    		 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
    		 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
    		 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
    		 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
    		 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
    		 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
    		 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
    		 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
    		 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
    		 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}
    		};
    this.datas = users;
    if(datas2 ==null) {
    	datas2 = new ArrayList<>();
    }
    for(String[] t : users) {
    	datas2.add(t);
    	}
	}
	

	public void callFile() {
		try {
			String file = "C:/Users/tjoeun/Desktop/database/db.txt";
			InputStream input = new FileInputStream(file);
			  List<String> retStr = new ArrayList<String>();
			  BufferedReader in = new BufferedReader(new InputStreamReader(input,"utf8"),8192);
			  String s;
			  while ((s = in.readLine()) != null) {
				   retStr.add(s);
				  }
				  in.close();
				  ArrayList<String[]> getNew = new ArrayList<String[]>();

				  for(int i = 1 ; i < retStr.size()-2; i++) {
					  String[] temp = retStr.get(i).split(",");
					  getNew.add(temp);
					  for(int j = 0 ; j < getNew.get(i-1).length ; j++ ) {
						  String t1 = getNew.get(i-1)[j];
						  t1 = t1.replace("\"", "");
						  t1 = t1.replace("{","");
						  t1 = t1.replace("}", "");
						  t1 = t1.replace(" ", "");
						  getNew.get(i-1)[j]= t1;
					  }
			  }
				 datas = new String[getNew.size()][getNew.get(0).length];
				  for(int i = 0 ; i < datas.length ; i++) {
					  for(int j = 0 ; j < datas[0].length ; j++) {
						  datas[i][j]=getNew.get(i)[j];
					  }
				  }
		}catch(Exception e){
			System.out.println("fail");
		}
	}
	
}
