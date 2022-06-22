/*
 	응용문제. 해당 사용자가 영화제목을 검색합니다.
 	영화제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력하게 됩니다.
 	Scanner "검색할 영화 제목을 입력하세요"
 */
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Example1 {

	public static void main(String[] args) throws IOException{
		Scanner scan_Movie = new Scanner(System.in);
		String address_Movie = "C:/Java5/File_Stream/src/movie_db.txt";
		scan_Movie scM = new scan_Movie();
		scM.setDB(address_Movie);
		System.out.println("검색할 영화제목을 입력해주세요.");
		String title = scan_Movie.nextLine();
		System.out.println(scM.findMovie(title));
		
		scan_Movie.close();
	}

}
class scan_Movie{
	List<String> movie_Data;
	public void setDB(String address) {
		try {
		this.movie_Data = Files.readAllLines(Paths.get(address));
		}catch(Exception e) {	
		}
	}
	
	
	public String findMovie(String movie_Name) {
		String msg ="검색한 영화는 확인되지 않습니다.";
		for(String t : movie_Data) {
			if(t.indexOf(movie_Name) != -1) {
				msg = t;
			}
		}		
		return msg;
	}
	
}
