//import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		String data[] = {"홍길동"};
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern();//equals없이 연산기호로 빠르게 검토할 수 있도록 사용
		String d = new String("홍길동");
		String e = data[0];
		if(a==b) {
			System.out.println("값이 같습니다"+"a,b");			
		}
		if(d==c) {
			System.out.println("값이 같습니다"+"c,d");
		}
		if(a==e) {
			System.out.println("값이 같습니다"+"a,e");
		}
		if(c==e) {
			System.out.println("값이 같습니다"+"c,e");
		}
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==e);
		System.out.println(c==e);
//		Scanner sc = new Scanner(System.in);
		System.out.println("input");
//		String f = sc.next();
//		if(a==f) {
//			System.out.println("값이 같습니다"+"a,f");
//		}
//		System.out.println(a==f);
//		System.out.println(c==f);
//		sc.close();
		
		//new String: 소속이 없는 자유분방한 자료형 intern() {문자, 배열값} 
	}

}
