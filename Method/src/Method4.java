import java.util.Arrays;

public class Method4 {
	public static void main(String[] args) {
		//return 에 값 2개 사용하기 
		
		per p = new per();
		String info = p.userInfo();
		String[] info2 = info.split(",");
		
		System.out.println(Arrays.toString(info2));
		
		/* return 에 값 2개 사용할대 split또는 배열 활용*/
		
		String[] myinfo = p.userInfo2();
		System.out.println(Arrays.toString(myinfo));
		
	}

}

class per {
	public String userInfo(){
		String user_name ="홍길동";
		String user_id = "hong";
		String user_info = user_name +","+user_id;
		return user_info;
	}
	public String[] userInfo2(){
		String user_name ="홍길동";
		String user_id = "hong";
		return new String[]{user_name,user_id}; // 해당 한개 이상의 값을 return으로 보낼 경우 
	}
	
}
