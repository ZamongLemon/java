import java.io.IOException;
import java.nio.file.*;
import java.util.*;

//files�� ��� ������ �迭�� ����
public class file8 {

	public static void main(String[] args) throws IOException {
		String address="C:/Java5/File_Stream/src/buffer.txt";
		List<String> data;
		try {
			data = Files.readAllLines(Paths.get(address));//��ü ������ �ѹ��� ��� ����
			System.out.println(data);
//			byte[] d2 = Files.readAllBytes(Paths.get(address)); 
			//�޸� �Ҵ��� ���� �ѱ� ��Ŷ�� �������
		}catch(Exception e) {
			
		}
	}

}
