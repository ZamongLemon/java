import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
//UnknownHostException host정보 확인불가 에ㅓㄹ
	public static void main(String[] args) throws UnknownHostException {
		try {
			//InetAddress : IPnetwork Address
			// getByName : 접속할 도메인주소 
			InetAddress ia = InetAddress.getByName("localhost");
			
//			System.out.println(ia.getHostName()); // 도메인
			System.out.println(ia.getHostAddress());//dns에 연결된 ip
//			System.out.println(ia);
			InetAddress[] ia2 = InetAddress.getAllByName("daum.net");
			System.out.println(ia2.length);
			for(InetAddress a : ia2) {
				System.out.println(a.getHostAddress());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
