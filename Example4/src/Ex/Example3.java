package Ex;

import java.util.*;

public class Example3 {
	/*
	 	���빮��
	 	���Ե� ȸ�������� ���� �����Ϳ��� ����Ʈ�� ���� ������� ����� �̸��� �����Ͽ� ����մϴ�.
	 	
	 	��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�
	 */
	public static void main (String[] args) {
	points poi = new points();
	poi.callDB();
	//poi.sorting();
	System.out.printf("����Ʈ %,d �Դϴ�.",poi.sumPoint());
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
	    		 {"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
	    		 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
	    		 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
	    		 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
	    		 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
	    		 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
	    		 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
	    		 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
	    		 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
	    		 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
	    		 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}
	    		};
	    if(datas ==null) {
	    	datas = new ArrayList<>();
	    }
	    for(String[] t : users) {
	    	datas.add(t);
	    	}
		}
}
