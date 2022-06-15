
public class time1 {
	/*
	 	try - catch 문 예외처리기능 문법
	 */
	public static void main(String[] args) {
		for(int i= 1 ; i <= 10 ; i++) {
			try {//예외발생할 코드를 적용
				Thread.sleep(1000); //1000 = 1초
			}catch(InterruptedException e){
				
				//InterruptedException : 해당 예외발생이 되었을 경우 처리하기 위한 문법
			}
			catch(Exception e) {
				
			}
			System.out.println(i);
		}
	}

}
