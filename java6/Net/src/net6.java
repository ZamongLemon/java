
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//client
	public static void main(String[] args) throws Exception{
		System.out.println("클라이언트");
		String ip ="127.0.0.1";
		int port = 8080;
		try{
			Socket sc = new Socket(ip,port); // 접속할 서버 ip, port
			System.out.println("서버에 연결 되었습니다.");	
			String cmsg = "안녕하세요.";
			//클라이언트에서 서버로 메세지를 보내는 통로
			OutputStream os = sc.getOutputStream();
			//서버에서 보낸 값을 받는 통로
			InputStream is = sc.getInputStream();
			//클라이언트에서 적용한 메세지를 byte형식으로 전송
			os.write(cmsg.getBytes());
			os.flush();
			//서버에서 회신된 내용을 byte로 받아 출력
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			is.close();
			
			os.close();
			sc.close();
			
		}catch(Exception e) {
			System.out.println("서버연결 실패");
		}
		
	}
}
