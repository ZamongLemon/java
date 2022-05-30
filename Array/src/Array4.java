
public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];//값이 없는 배열
		String m[] = {"홍길동","이순신","강감찬"}; // 값이 있는 배열
		int ct=0;
		for (String a:m) {
			if(a.equals("홍길동") || a.equals("강감찬")) {
				System.out.println(ct);
				names[ct]=a;
				ct++;
			}
		}
		
		
		

	}

}
