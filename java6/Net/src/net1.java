import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
//UnknownHostException host���� Ȯ�κҰ� ���ä�
	public static void main(String[] args) throws UnknownHostException {
		try {
			//InetAddress : IPnetwork Address
			// getByName : ������ �������ּ� 
			InetAddress ia = InetAddress.getByName("localhost");
			
//			System.out.println(ia.getHostName()); // ������
			System.out.println(ia.getHostAddress());//dns�� ����� ip
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
