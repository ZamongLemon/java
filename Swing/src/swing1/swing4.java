package swing1;

import java.util.HashMap;

public class swing4 {
	public static void main(String[] args) {
		String[][] data = { 
				{"d1","123456"},
				{"d1","456789"},
				{"d2","홍길동"},
				{"d2","이순신"},
				{"d3","hong@naver.com"},
		};
		HashMap<String,String> m = new HashMap<>();
		System.out.println(data[0][0]);//key
		System.out.println(data[0][1]);//value
		for(int i =0 ; i < data.length ; i++) {
			if(!m.containsKey(data[i][0])) {
				m.put(data[i][0], data[i][1]);
			}else {
				m.put(data[i][0]+i, data[i][1]);
			}
		}
		System.out.println(m);
	}

}
