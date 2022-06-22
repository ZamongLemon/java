import java.io.*;
import java.nio.charset.Charset;

//BufferReader output
public class file7 {
// read() 글자 하나 읽음 , readLine()줄을 읽음,next() 하나읽음 , nextLine()줄 하나 읽음
	public static void main(String[] args) throws IOException{
		String address="C:/Java5/File_Stream/src/buffer.txt";
		try {
			
			FileReader fr = new FileReader(address,Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);
			// buffer 는 속도가 빠른 대신 사용시 변수 혹은 배열로 받은 후 활용 
			//BufferedReader : Temp : 임시저장소 효율적으로 보다 빠르게 가져올 수 있음
			//Buffer는 최초 값을 출력하였을 경우 무조건 다음 line을 출력하게됨
			//조건문 사용시에도 작동 , 주의해야함
			String p ;
			while( (p = bf.readLine() ) !=null)// 해당 임시 저장소에서 저장된 내용중 한줄을 로드 
				System.out.println(p);
			fr.close(); 
			//데이터 문서의 라인갯수를 확인

		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
