import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;
import java.util.Scanner;


//TCP(���� ��������), UDP(����� ������ ��������) ���ۼӵ��� ����(1:1�� ����)
/*
  port
  80 : WEB	(http://)
  21 : FTP	(�������۽� ���)
  22 : SSH - linux , unix (��������, ��������)
  23 : TELNET - window
  443 : WEB (https://)
  25 : SMTP : (���� ����) ���� ������
  110 : POP3 (���� �ޱ�) ����, ���� �ޱ� ���� �񵿱�ȭ
  143 : IMAP (���� �ޱ�) :: ���� ����ȭ
  
  SNMP : UDP ���� (���ڹ߼۽ý���) VPN 
 */
public class net2 {
	public static void main(String[] args) throws Exception{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է����ּ���.");//��Ʈ��ũ ���
		String img_Address = sc.nextLine();
		URL u = new URL(img_Address);
		URLConnection con = u.openConnection();
		int imgsize = con.getContentLength();
	//	System.out.println(imgsize);
	//	String imgtype = con.getContentType();
	//	System.out.println(imgtype);
	//	long date = con.getDate(); //���� �ε� ��¥ 
	
		
		//openstream url���� ���
		InputStream is = u.openStream(); //url�κ��� ������ �о�ö� ���
		BufferedInputStream bi = new BufferedInputStream(is);//������
		byte[] data = new byte[1024];//1kb�� �ش� ������ ������
		FileOutputStream fo = new FileOutputStream("copy.mp4"); // ������
		int imgdata;
		int cnt = 0;
		while((imgdata = bi.read(data))!= -1){
			fo.write(data,0,imgdata); //������ ������ �ٿ��ֱ�
			cnt+=imgdata;
			System.out.println("�ٿ�ε���..."+ (cnt*100)/imgsize +"%" );
		}
		fo.flush();
		fo.close();

		sc.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
