import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//socket 통신 server,client 메세지,파일전달 (양방향)
//http 통신 image, 동영상, 음악 사용자(요청)와 서버(응답)간의 송수신통신 (단방향)
public class net5 {
//server
	public static void main(String[] args){
		System.out.println("Server Connect");
		int port = 8080;//오픈할 포트 번호 셋팅 (절대 중복된 포트를 사용하면 안됨)
		//String msg = "Success Connect!!";
		try {
			ServerSocket ss = new ServerSocket(port); //ServerSocket : 오픈시킬 포트를 적용
			
			//연결을 지속, 유지하기 위해서는 serversocket은 절대 재로드를 해선 안됨
			while(true) {
			System.out.println("연결 대기중");
			Socket sc = ss.accept(); //accept() : 클라이언트가 들어오는 것을 대기하는 역할을 하게함
			System.out.println("호스트 통신 연결 성공");
			// 서버에서 보낸값을 받기 위한 통로
			InputStream is = sc.getInputStream();			
			// 클라이언트로 값을 보내는 통로
			OutputStream os = sc.getOutputStream();
			byte data[] = new byte[1024];// 받는값을 byte로
			int n = is.read(data);//해당 값을 읽음
			String msgclient = new String(data,0,n);//해당 값을 배열로 확인하여 이관
			System.out.println(msgclient); //이관된 값 출력
			String aws = "반갑습니다.";//서버에서 보내는 메세지
			os.write(aws.getBytes());//클라이언트로 보내기 위한
			os.flush();
			is.close();
			os.close();
			sc.close();
			ss.close();
			}
					
		}catch(Exception e) {
			System.out.println("Failed");
		}
	}

}
