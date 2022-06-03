
public class Example5 {

	public static void main(String[] args) {
		/*
		 	2차배열 + 기본 클래스 메소드 문제
		 	등록된 고객중 vip 고객만 리스트를 출력하시오.
		 	
		 	user_list : {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 	user_level : {"gold","vip","guest","gold","vip","vip","guest"};	
		 *
		 */
		
		String[][] user_Data = {{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"},
				{"gold","vip","guest","gold","vip","vip","guest"}};				
		Example5 ex5 = new Example5();
		ex5.getVip(user_Data);
		ex5= null;

	}
	
	void getVip(String[][] data) {
		int i = 0;
		System.out.print("결과출력 : ");
		do {
			if(data[1][i].equals("vip")) {
				System.out.printf("%s, ",data[0][i]);
			}
			i++;
		}while(i<data[0].length);
		
	}
}
