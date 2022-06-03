
public class Example7 {

	public static void main(String[] args) {
		/*
		  다차원 배열로 생성 + 외부 class 및 메소드 사용
		  {"홍길동","합격"},{"이순신","합격"},{"강감찬","불합격"},{"김유신","합격"},{"유관순","불합격"},{"장보고","불합격"};
		  다차원 배열 형태이며 해당 값중 합격자만 출력되도록 합니다.
		  배열값을 외부 클래스 안의 메소드에서 처리되도록 합니다.
		 */
			passOrfail pf = new passOrfail();			
			pf.pass();
			pf = null;
	}
}

class passOrfail{
	String[][] data =
		{{"홍길동","합격"},
		 {"이순신","합격"},
		 {"강감찬","불합격"},
		 {"김유신","합격"},
		 {"유관순","불합격"},
		 {"장보고","불합격"}};	
	void pass() {
		int i=0;
		System.out.print("합격자는 : ");
		while(i<data.length) {
			if(data[i][1].equals("합격")) {
				System.out.printf("%s " ,data[i][0]);
			}
			i++;
		}
		System.out.println("입니다.");		
	}
}

