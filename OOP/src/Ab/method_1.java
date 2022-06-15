package Ab;

public class method_1 {
	public void recall() {
		System.out.println("test");
	}
	protected static void name() {
		System.out.println("named");
	}

	public static void main(String[] args) {
		// Arrays.sort : 배열 오름차순 정렬 (숫자,한글,영문) 
		// 영문일 경우 대문자가 제일 먼저 정렬
		/*Integer number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data,Collections.reverseOrder());;
		System.out.println(Arrays.toString(number_data));
				
		String user_data[] = {"홍길동","이순신","장보고","김유신"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		
		// 변수 2개 문자,숫자
		// 가입된 사용자의 ID를 확인 후 해당 포인트 적립 기존 + 적립 포인트 결과출력
		// 출력 main class 
		// 배열 데이터 : 
		/* String member_ship[][] = {
		{"kim","park","seo","oh","lee","jang","jeong","cho","ho","hwang"},
		{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
		기존 포인트, 적립금 포인트에 대한 결과 출력
		 */
		
		mth1 mt = new ide_mth1();
		mt.setter("oh",2000);		
		System.out.println(mt.getter("oh"));	
	}



}
class ide_mth1 extends mth1{
	String member_ship[][] = {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ho","hwang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
	@Override
	public void setter(String[] data3) {}
	@Override
	public void setter(String data1, int data2) {
		int j = this.member_ship[0].length;
		for(int i = 0 ; i < j ; i++) {
			if(data1.equals(this.member_ship[0][i])){
				int temp = Integer.parseInt(this.member_ship[1][i]);
				temp += data2;
				this.member_ship[1][i] = Integer.toString(temp);
				break;
			}
		}
	}	
	@Override
	public String getter(String name) {
		String name_point="존재하지 않는 사용자입니다.";
		int j = this.member_ship[0].length;
		for(int i = 0 ; i < j ; i++ ) {
			if(this.member_ship[0][i].equals(name)) {
				name_point = name + "님의 적립 포인트는 " + this.member_ship[1][i]+ "입니다.";
				break;
			}
		}		
		return name_point;
	}
}
