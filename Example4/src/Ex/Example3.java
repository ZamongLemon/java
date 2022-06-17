package Ex;

import java.util.*;

public class Example3 {
	/*
	 	응용문제
	 	가입된 회원정보중 현재 데이터에서 포인트가 많은 순서대로 사용자 이름을 정렬하여 출력합니다.
	 	
	 	모든 회원의 포인트 총 합을 구하시오
	 */
	public static void main (String[] args) {
	points poi = new points();
	poi.callDB();
	//poi.sorting();
	System.out.printf("포인트 %,d 입니다.",poi.sumPoint());
	}
	

	
}

abstract class db2{
	public abstract void callDB();
	public ArrayList<String[]> datas =null;
	public abstract void sorting();
	public abstract int sumPoint();
}
class points extends db2{
	public int sumPoint() {
		int sum = 0;
		for(int i = 0 ; i < this.datas.size() ; i++) {
			sum += Integer.parseInt(this.datas.get(i)[6]);
		}
		return sum;
	}
	
	
	@Override
	public void sorting() {
		for(int i =0 ; i < this.datas.size()-1 ; i++ ) {
			for(int j = i+1 ; j <this.datas.size(); j++) {
				if(Integer.parseInt(this.datas.get(i)[6]) < Integer.parseInt(this.datas.get(j)[6])) {
					String[] temp = this.datas.get(i);
					this.datas.set(i, this.datas.get(j));
					this.datas.set(j, temp);
				}		
			}
		}		
		for(int i = 0 ; i < this.datas.size() ; i++) {
			System.out.println(this.datas.get(i)[0]);
		}
	}
	


	@Override
	public void callDB()
	{

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
	    if(datas ==null) {
	    	datas = new ArrayList<>();
	    }
	    for(String[] t : users) {
	    	datas.add(t);
	    	}
		}
}
