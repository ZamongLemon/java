
public class oop3 {
// multi thread(멀티 쓰레드) : start, run, sleep, setStop
// 멀티 쓰레드 : CPU의 코어수와 관계있음
	public static void main(String[] args) {
		//쓰레드 (Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말합니다.
		// Multi Thread (멀티 쓰레드) : 프로세서 내부에서 두가지 이상의 작업을 동시사용
		// 쓰레드 -> 음악
		// 멀티 쓰레드 -> 음악, 유튜브 , 문서 (멀티 태스킹)
		
		Thread my = new mythread(); // 부모 메소드 = 자식 메소드
		//기존 사용형태 : 자식 메소드 = 자식 메소드
		my.start();
		Thread t2 = new test2();
		t2.start(); // Thread 메소드에 기본 run을 작동하기 위한 start 명령어
		int ct=1;
		while(ct<=10) {
			System.out.println("내부 클래스 :" + ct);
			ct++;
		}

	}

}

class mythread extends Thread{
	//Thread : jvm 기본으로 탑재된 메소드 (Thread 는 단독으로 사용하지 않음 , extends를 통해)
	@Override
	public void run() { //run이란 : 멀티메소드 기본 실행 메소드
		for (int i =1 ; i <= 10 ; i++) {
			System.out.println("외부 클래스 : " + i);
		}
	}
}
class test2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("외부 클래스2 : " + i);
		}
	}
}
