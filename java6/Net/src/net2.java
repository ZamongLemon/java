import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;
import java.util.Scanner;


//TCP(연결 프로토콜), UDP(사용자 데이터 프로토콜) 전송속도가 느림(1:1은 빠름)
/*
  port
  80 : WEB	(http://)
  21 : FTP	(파일전송시 사용)
  22 : SSH - linux , unix (파일전송, 서버접속)
  23 : TELNET - window
  443 : WEB (https://)
  25 : SMTP : (메일 서버) 메일 보내기
  110 : POP3 (메일 받기) 문자, 파일 받기 서버 비동기화
  143 : IMAP (메일 받기) :: 서버 동기화
  
  SNMP : UDP 전용 (문자발송시스템) VPN 
 */
public class net2 {
	public static void main(String[] args) throws Exception{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");//네트워크 경로
		String img_Address = sc.nextLine();
		URL u = new URL(img_Address);
		URLConnection con = u.openConnection();
		int imgsize = con.getContentLength();
	//	System.out.println(imgsize);
	//	String imgtype = con.getContentType();
	//	System.out.println(imgtype);
	//	long date = con.getDate(); //파일 로드 날짜 
	
		
		//openstream url에만 사용
		InputStream is = u.openStream(); //url로부터 파일을 읽어올때 사용
		BufferedInputStream bi = new BufferedInputStream(is);//빠르게
		byte[] data = new byte[1024];//1kb로 해당 파일을 조각냄
		FileOutputStream fo = new FileOutputStream("copy.mp4"); // 저장방식
		int imgdata;
		int cnt = 0;
		while((imgdata = bi.read(data))!= -1){
			fo.write(data,0,imgdata); //조각난 파일을 붙여넣기
			cnt+=imgdata;
			System.out.println("다운로드중..."+ (cnt*100)/imgsize +"%" );
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
