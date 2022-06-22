/*
 	���빮��. �ش� ����ڰ� ��ȭ������ �˻��մϴ�.
 	��ȭ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����ϰ� �˴ϴ�.
 	Scanner "�˻��� ��ȭ ������ �Է��ϼ���"
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
		System.out.println("�˻��� ��ȭ������ �Է����ּ���.");
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
		String msg ="�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.";
		for(String t : movie_Data) {
			if(t.indexOf(movie_Name) != -1) {
				msg = t;
			}
		}		
		return msg;
	}
	
}
