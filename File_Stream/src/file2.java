import java.io.*;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		
		try{
			FileReader fr = new FileReader("C:\\Java5\\File_Stream\\src\\welcome.txt",Charset.forName("utf8"));
			//System.out.println(fr.getEncoding());//인코더 형식을 확인 FileReader
			int a1;
			String t ="";
			while((a1 = fr.read()) !=-1) {//루프
				t+= (char)a1;
			}
			System.out.println(t);
			fr.close();
		}catch(IOException e){
			if(e.getMessage()!= null) {
				System.out.println(e);
			}
			
		}finally {
			
		}
		

	}

}
