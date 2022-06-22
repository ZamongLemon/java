import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class file5 {

	public static void main(String[] args) throws IOException{
		String address="C:/Java5/File_Stream/src/db.txt";
		try {
			FileReader fr = new FileReader(address,Charset.forName("UTF8"));
			Scanner scan = new Scanner(fr); // System.in(사용자가 직접), FileReader:파일을 로드
			
			while(scan.hasNext())System.out.println(scan.next());//파일로드 된 입력값을 result에 전달 후 출력
			
			scan.close();
		}catch (Exception e2) {
			
		}

	}

}
