import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		int port = 9091;
		Scanner scan_Server = new Scanner(System.in);
		ServerSocket ss = null;
		try {
			ss=new ServerSocket(port);
			System.out.println("서버 연결 대기중");
			Socket sc = ss.accept();
			InputStream is = sc.getInputStream();
			OutputStream os = sc.getOutputStream();
			System.out.println("Connected");
			while(true) {
				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data,0,n);
				System.out.println(message);
				
				System.out.println("입력할 내용");
				String serverToC = "server :"+scan_Server.nextLine();
				os.write(serverToC.getBytes());
			
				os.flush();
			}
		}catch(Exception e) {
			System.out.println("Failed");
		}finally {
			scan_Server.close();
		}

	}

}
