import java.io.*;

//���� ���� (write)
public class file4 {

	public static void main(String[] args) throws IOException,Exception {
		//filewriter : ���� �����͸� ���Ͽ� ���� class
		try {
			
			String user[] = {"ȫ�浿40","������60","������100","������300"};
			FileWriter fw= new FileWriter("C:\\Java5\\File_Stream\\src\\array.txt");
			//true�� ����ϸ� �ʱ�ȭ���� �ʰ� �ڿ� �̾
			for(String t : user) {
				fw.write(t+"\n");				// ����, ������ ���� ���Ͽ� ����
			}

			fw.close();
		}catch(Exception e) {
			System.out.println("E");
		}
		
	}
}
