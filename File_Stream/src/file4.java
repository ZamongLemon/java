import java.io.*;

//파일 쓰기 (write)
public class file4 {

	public static void main(String[] args) throws IOException,Exception {
		//filewriter : 문자 데이터를 파일에 쓰는 class
		try {
			
			String user[] = {"홍길동40","김유신60","강감찬100","유관순300"};
			FileWriter fw= new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt");
			//true를 사용하면 초기화하지 않고 뒤에 이어씀
			for(String t : user) {
				fw.write(t+"\n");				// 문자, 데이터 값을 파일에 적용
			}

			fw.close();
		}catch(Exception e) {
			System.out.println("E");
		}
		
	}
}
