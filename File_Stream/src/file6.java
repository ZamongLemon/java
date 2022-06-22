import java.io.*;
import java.util.Scanner;

public class file6 {
	public static void main(String[] args) throws IOException {
		String address="C:/Java5/File_Stream/src/db.txt";
		try {
		FileWriter fw = new FileWriter(address);
		Scanner sc = new Scanner(System.in); // 사용자 직접입력
		for(int i = 0 ; i < 3 ; i ++) {//3번 반복
		System.out.println("내용을 입력해주세요");
		String notice = sc.nextLine();// 해당 입력사항을 db.txt에 저장시킴
		fw.write(notice+"\n");
		}
		fw.close();
		sc.close();
		}
		catch(Exception z) {
			System.out.println(z.getMessage());
		}
		
	}

}
