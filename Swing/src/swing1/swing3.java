package swing1;

import java.util.*;

public class swing3 {
	// 반복문을 이용하여 키생성 및 배열값을 split 으로 분리작업
	public static void main(String[] args) {
		String data[] = {"홍길동","강감찬","이순신","유관순"};
		Map<String, String> m = new HashMap<>();
		int w = 0;
		do {
			m.put(String.valueOf(w), data[w]);
			w++;
		}while(w < data.length);
		System.out.println(m);
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			
			m2.put(names, names); //foreach 로 key , value 를 동일하게 적용 
		}
		System.out.println(m2);
		String alldata[] = {"names=홍길동","age=25","email=hong@naver.com"};
		Map<String,String> m3 = new HashMap<>();
		for(int i = 0 ; i < alldata.length ; i++) {
		String[] t = alldata[i].split("=");
		m3.put(t[0], t[1]);
		}
		System.out.println(m3);
		
	}
	

}
