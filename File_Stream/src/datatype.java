//import java.util.Scanner;

public class datatype {

	public static void main(String[] args) {
		String data[] = {"ȫ�浿"};
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern();//equals���� �����ȣ�� ������ ������ �� �ֵ��� ���
		String d = new String("ȫ�浿");
		String e = data[0];
		if(a==b) {
			System.out.println("���� �����ϴ�"+"a,b");			
		}
		if(d==c) {
			System.out.println("���� �����ϴ�"+"c,d");
		}
		if(a==e) {
			System.out.println("���� �����ϴ�"+"a,e");
		}
		if(c==e) {
			System.out.println("���� �����ϴ�"+"c,e");
		}
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==e);
		System.out.println(c==e);
//		Scanner sc = new Scanner(System.in);
		System.out.println("input");
//		String f = sc.next();
//		if(a==f) {
//			System.out.println("���� �����ϴ�"+"a,f");
//		}
//		System.out.println(a==f);
//		System.out.println(c==f);
//		sc.close();
		
		//new String: �Ҽ��� ���� �����й��� �ڷ��� intern() {����, �迭��} 
	}

}
