import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//socket ��� server,client �޼���,�������� (�����)
//http ��� image, ������, ���� �����(��û)�� ����(����)���� �ۼ������ (�ܹ���)
public class net5 {
//server
	public static void main(String[] args){
		System.out.println("Server Connect");
		int port = 8080;//������ ��Ʈ ��ȣ ���� (���� �ߺ��� ��Ʈ�� ����ϸ� �ȵ�)
		//String msg = "Success Connect!!";
		try {
			ServerSocket ss = new ServerSocket(port); //ServerSocket : ���½�ų ��Ʈ�� ����
			
			//������ ����, �����ϱ� ���ؼ��� serversocket�� ���� ��ε带 �ؼ� �ȵ�
			while(true) {
			System.out.println("���� �����");
			Socket sc = ss.accept(); //accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ������ �ϰ���
			System.out.println("ȣ��Ʈ ��� ���� ����");
			// �������� �������� �ޱ� ���� ���
			InputStream is = sc.getInputStream();			
			// Ŭ���̾�Ʈ�� ���� ������ ���
			OutputStream os = sc.getOutputStream();
			byte data[] = new byte[1024];// �޴°��� byte��
			int n = is.read(data);//�ش� ���� ����
			String msgclient = new String(data,0,n);//�ش� ���� �迭�� Ȯ���Ͽ� �̰�
			System.out.println(msgclient); //�̰��� �� ���
			String aws = "�ݰ����ϴ�.";//�������� ������ �޼���
			os.write(aws.getBytes());//Ŭ���̾�Ʈ�� ������ ����
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
