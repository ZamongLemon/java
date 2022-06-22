import java.io.IOException;
import java.nio.file.*;
import java.util.*;

//files로 모든 내용을 배열로 전송
public class file8 {

	public static void main(String[] args) throws IOException {
		String address="C:/Java5/File_Stream/src/buffer.txt";
		List<String> data;
		try {
			data = Files.readAllLines(Paths.get(address));//전체 내용을 한번에 모두 읽음
			System.out.println(data);
//			byte[] d2 = Files.readAllBytes(Paths.get(address)); 
			//메모리 할당이 많고 한글 패킷을 맞춰야함
		}catch(Exception e) {
			
		}
	}

}
