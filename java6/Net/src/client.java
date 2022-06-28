import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip = "192.168.1.163";
		int port = 8009;
		Socket sc = null;
		Scanner scan_msg = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			sc = new Socket(ip,port);
			scan_msg = new Scanner(System.in);
			os = sc.getOutputStream();
			is = sc.getInputStream();
		
		while(true) {
			System.out.println("입력할 내용을 적어주세요.");
			String clientToS = "client : "+scan_msg.nextLine();
			os.write(clientToS.getBytes());
			os.flush();			
			byte[] gotmsg = new byte[1024];
			int k = is.read(gotmsg);
			String gm = new String(gotmsg,0,k);
			System.out.println(gm);
		}
		
		}catch(Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e.getMessage());
				System.out.println("access error occured");
			}
			
		}finally {
			scan_msg.close();
		}
	}

}
