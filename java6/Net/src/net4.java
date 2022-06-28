import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {

	public static void main(String[] args) throws Exception {
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		//Stream을 사용하면 read만 사용(byte),Reader readLine(String)
		//flush() 사용시 BufferedOutputStream
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);
		byte html[] = new byte[1024];
		//FileOutputStream fs = new FileOutputStream("game.html");
		BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("game.html"));
		int s = 0;
		while((s = bs.read(html)) != -1) {//Stream은 read에 byte 배열명을 입력
			os.write(html,0,s);;
		}
		
		bs.close();
		os.flush();
		os.close();

	}

}
