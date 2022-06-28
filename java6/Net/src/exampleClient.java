import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class exampleClient {

	public static void main(String[] args) {
		String ip = "192.168.1.152";
		int port = 9091;
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		Scanner scan_Msg = null;
		String id =null;
		String tempMsg = null;
		boolean exit = false;
		
		try {
			scan_Msg = new Scanner(System.in);
			System.out.println("id�� �Է����ּ���.");
			id = scan_Msg.nextLine();
			socket = new Socket(ip,port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			while(true) {
				scan_Msg = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���.");
				tempMsg = scan_Msg.nextLine();
				System.out.println("c");
				if(tempMsg.equals("exit")) {
					exit = true;
					tempMsg = id+ "���� �����ϼ̽��ϴ�.\n";
				}else {
					tempMsg = id+" : " + tempMsg;
				}
				
				System.out.println(tempMsg);
				os.write(tempMsg.getBytes());
				os.flush();	
				if(exit)break;


				
				byte[] gotmsg = new byte[1024];
				int k = is.read(gotmsg);
				String gm = new String(gotmsg,0,k);
				System.out.println(gm);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("failed");
			System.exit(0);
		}finally {
			System.out.println("ä���� ���� �Ǿ����ϴ�.");
			System.exit(0);
		}

	}

}
