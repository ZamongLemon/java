import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
public class Buffer_array {

	
	public static void main(String[] args) throws IOException{
		try {
			String address="C:/Java5/File_Stream/src/buffer.txt";
			FileReader fr = new FileReader(address,Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);	
			ArrayList<String> arrays = new ArrayList<>();//ºó ¹è¿­
			String data ;
			while((data = bf.readLine()) != null)arrays.add(data);
			System.out.println(arrays);
			
			bf.close();
		}catch(Exception e) {
			
		}

	}

}
