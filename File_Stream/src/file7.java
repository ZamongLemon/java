import java.io.*;
import java.nio.charset.Charset;

//BufferReader output
public class file7 {
// read() ���� �ϳ� ���� , readLine()���� ����,next() �ϳ����� , nextLine()�� �ϳ� ����
	public static void main(String[] args) throws IOException{
		String address="C:/Java5/File_Stream/src/buffer.txt";
		try {
			
			FileReader fr = new FileReader(address,Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);
			// buffer �� �ӵ��� ���� ��� ���� ���� Ȥ�� �迭�� ���� �� Ȱ�� 
			//BufferedReader : Temp : �ӽ������ ȿ�������� ���� ������ ������ �� ����
			//Buffer�� ���� ���� ����Ͽ��� ��� ������ ���� line�� ����ϰԵ�
			//���ǹ� ���ÿ��� �۵� , �����ؾ���
			String p ;
			while( (p = bf.readLine() ) !=null)// �ش� �ӽ� ����ҿ��� ����� ������ ������ �ε� 
				System.out.println(p);
			fr.close(); 
			//������ ������ ���ΰ����� Ȯ��

		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
