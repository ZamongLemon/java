
public class App {

	public static void main(String[] args) {
		short a = 25+31*4+12, b= 15*3+9+14;
		if(a<b) {
			System.out.println("a = "+a);
		}else if (a>b) {
			System.out.println("b = "+b);
		}else {
			System.out.println("a==b");
		}

	
		/* �ش簪�� 2������ ¦�� Ȧ���� Ȯ���ϱ� */
		int c = b%2 ; // %��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ��� �˴ϴ�.
		System.out.println(c);
		if(c==0){
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
	
	}
}
