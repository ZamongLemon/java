
public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];//���� ���� �迭
		String m[] = {"ȫ�浿","�̼���","������"}; // ���� �ִ� �迭
		int ct=0;
		for (String a:m) {
			if(a.equals("ȫ�浿") || a.equals("������")) {
				System.out.println(ct);
				names[ct]=a;
				ct++;
			}
		}
		
		
		

	}

}
