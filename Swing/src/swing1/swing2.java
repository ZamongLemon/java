package swing1;

import java.util.*;
public class swing2 {
	public static void main(String[] args) {
		//ArrayList, LinkedList(�迭��)
		//Map ( �迭Ű, �迭��)
		//Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ��
		//Ű���� ���� �ߺ���Ű�� ����, ���� Ű�� ���� �������� ������ ����
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> �����ڵ� 
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");
		System.out.println(m.get("kang"));
		m.put("park", "�����ż�"); // ����ִ�Ű ��� �����ϳ� �ǹ̾���
		System.out.println(m.get("park"));
		System.out.println(m);
		
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("age", 32 );
		m2.put("level", 5);
		System.out.println(m2.get("age"));
		System.out.println(m2.keySet());//Ű��
		System.out.println(m2.values());//����
		System.out.println(m2.containsKey("age"));
		
		
	}

}
