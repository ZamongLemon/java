package swing1;

import java.util.*;
public class swing2 {
	public static void main(String[] args) {
		//ArrayList, LinkedList(배열값)
		//Map ( 배열키, 배열값)
		//Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인
		//키값을 절대 중복시키지 않음, 같은 키를 사용시 마지막의 것으로 갱신
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 난수코드 
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");
		System.out.println(m.get("kang"));
		m.put("park", "박혁거세"); // 비어있는키 사용 가능하나 의미없음
		System.out.println(m.get("park"));
		System.out.println(m);
		
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("age", 32 );
		m2.put("level", 5);
		System.out.println(m2.get("age"));
		System.out.println(m2.keySet());//키만
		System.out.println(m2.values());//값만
		System.out.println(m2.containsKey("age"));
		
		
	}

}
