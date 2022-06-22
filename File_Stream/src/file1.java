import java.io.*;

public class file1 {

	/*
		 	I/O : inputstream,outputstream
		 	입력 스트림 : 프로그램으로 들어오는 스트림 (inputStream) : 키보드 , 마우스, HDD
		 	출력 스트림 : 프로그램에서 밖으로 나가는 부분 (outputstream) : 모니터, HDD, print
		 	Stream : input, output 사용자 처리
		 	Java.io
		 	File, FileReader < 일반  -> StreamAPI (FileInputStream)
			FileWriter -> StreamAPI (FileOutputStream)
	 */
	
	public static void main(String[] args) throws Exception {
		/*
		 	FileReader: 
		 	1.문자 데이터를 파일로부터 읽는 클래스
		 	2.파일 이름을 생성자 인수로 사용해서 FileReader객체를 생성
		 	public void abc(string a)
		 */
		String address ="C:\\Java5\\File_Stream\\src\\welcome.txt";
		try {
		FileReader fr = new FileReader(address);
		String a = "a1";
		int t;
		String x = "";
		while ((t = fr.read()) != -1) {
			x+=(char)t;
		}
		System.out.println(x);
		tests(a);
		fr.close();
		}catch(IOException e){ //IOException 에 대한 예외처리
			System.out.println(e);
		}catch(Exception z) {//Exception(일반적 에러) 에 대한 예외처리
			System.out.println(z);
		}
	}

	public static void tests(String data) throws Exception {
		Exception ex = new Exception();
		int k = Integer.parseInt(data.replaceAll("[^0-9]", ""));
		System.out.println(k);
		throw ex;
	}
}
