
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//client
	public static void main(String[] args) throws Exception{
		System.out.println("Ŭ���̾�Ʈ");
		String ip ="127.0.0.1";
		int port = 8080;
		try{
			Socket sc = new Socket(ip,port); // ������ ���� ip, port
			System.out.println("������ ���� �Ǿ����ϴ�.");	
			String cmsg = "�ȳ��ϼ���.";
			//Ŭ���̾�Ʈ���� ������ �޼����� ������ ���
			OutputStream os = sc.getOutputStream();
			//�������� ���� ���� �޴� ���
			InputStream is = sc.getInputStream();
			//Ŭ���̾�Ʈ���� ������ �޼����� byte�������� ����
			os.write(cmsg.getBytes());
			os.flush();
			//�������� ȸ�ŵ� ������ byte�� �޾� ���
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			is.close();
			
			os.close();
			sc.close();
			
		}catch(Exception e) {
			System.out.println("�������� ����");
		}
		
	}
}
