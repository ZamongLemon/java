import java.io.*;
import java.util.Scanner;

public class file6 {
	public static void main(String[] args) throws IOException {
		String address="C:/Java5/File_Stream/src/db.txt";
		try {
		FileWriter fw = new FileWriter(address);
		Scanner sc = new Scanner(System.in); // ����� �����Է�
		for(int i = 0 ; i < 3 ; i ++) {//3�� �ݺ�
		System.out.println("������ �Է����ּ���");
		String notice = sc.nextLine();// �ش� �Է»����� db.txt�� �����Ŵ
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
