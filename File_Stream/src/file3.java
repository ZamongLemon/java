import java.io.*;
import java.nio.charset.Charset;
//IOException +Exception
public class file3 {

	public static void main(String[] args) throws Exception {
		//file f = new file();

	}
}

class file{
	FileReader fr = null;
	public file() throws IOException,Exception {
		try{
			this.fr = new FileReader("C:\\Java5\\File_Stream\\src\\data.dat",Charset.forName("euckr"));
			this.word();
		
		}catch (IOException k ) {
			if(k.getMessage() != null) {
				System.out.print(k);
			}
		}catch(Exception k2) {
			
		}
	}
	public void word() throws Exception{
		try {int w;
			while((w = this.fr.read()) != -1) {
				 System.out.print((char)w);
			}
			
			this.fr.close();
		}catch(Exception f) {
			
		}}
}