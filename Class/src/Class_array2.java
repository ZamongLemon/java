import java.util.Random;
//import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("0~10까지 숫자를 하나 선택하세요;");
//		int num = sc.nextInt();
		
		//memories m = new memories();
		memories m = new memories();
//		m.ms(num);
		m = null; // 해당 인스턴스를 비움
		m = new memories();
		m.rd();
	}

}
class memories {
	public void ms(int num) {
		//랜덤 메소드 사용법 Math.random() 기본자료형은 double
//		double a =Math.random();
		int b = (int)(Math.random()*10);//0~10 double -> int 변경	
		if(num==b) {
			System.out.println("당첨");
		}else{
			System.out.println("다음 기회에");
		}
		
		
	}
	
	public void rd() {
		System.out.println("test2");
		Random r = new Random(); // random 객체 생성 및 인스턴스 적
		int w = 0;
		while(w<6) {
			System.out.println(r.nextInt(45)+1); // 0~9까지 r.nextint 사용
			w++;			
		}
		
	}
	
}
