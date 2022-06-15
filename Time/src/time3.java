

public class time3 {

	public static void main(String[] args) {	
		/*try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/

		/* 
		 	응용문제, 외부 Class가 있습니다. 단 메인 클래스에서 해당 외부 Class를 로드하면
		 	해당 method에서 즉각적으로 8초동안 로딩이 발생합니다. 
		 	8초이후에 return으로 "입금이 모두 처리되었습니다."라는 문자를 받도록 하십시오.
		 */
		
	//	Timer timer = new Timer();
	//	timer.scheduleAtFixedRate(new schedule(), 0, 8000);
		wait d = new wait();
		System.out.println(d.waitsec());
		
	}

}

class wait {
	
	public String waitsec(){
		System.out.println("처리중입니다. 잠시만 기다려주세요");
		try {
		Thread.sleep(8000);
		}catch(InterruptedException e) {}
		return "입금이 모두 처리되었습니다.";
	}
	
}

