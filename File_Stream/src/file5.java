import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class file5 {

	public static void main(String[] args) throws IOException{
		String address="C:/Java5/File_Stream/src/db.txt";
		try {
			FileReader fr = new FileReader(address,Charset.forName("UTF8"));
			Scanner scan = new Scanner(fr); // System.in(����ڰ� ����), FileReader:������ �ε�
			
			while(scan.hasNext())System.out.println(scan.next());//���Ϸε� �� �Է°��� result�� ���� �� ���
			
			scan.close();
		}catch (Exception e2) {
			
		}

	}

}
