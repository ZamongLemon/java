
public class app {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c;
		// ��Ģ���� ��ȣ : + - * /
		// c= a+b;
		// c= a-b;
		// c= a*b;
		c = b / a;
		System.out.println(c);

		String a1 = "ȫ�浿 ", b1 = "ȯ���մϴ�";
		String c1;
		c1 = a1 + b1;
		// ���� �����϶� +�� ����+���ڿ��� ǥ���� �� �ֽ��ϴ�.
		System.out.println(c1);

		/*
		 * ���빮�� ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�. ȫ�浿�� �������� 50000 �Դϴ�. ��, ȫ�浿�� 50000�� ���� ���������� ��ȭ��
		 * �� �ֽ��ϴ�.
		 * 
		 */

		String name = "ȫ�浿", s1 = "�� �������� ", s2 = " �Դϴ�.";
		int cash = 50000;
		String answer = name + s1 + cash + s2;
		System.out.println(answer);

		/*
		 * ���빮�� �Ƹ������� ��ǰ�� �����߽��ϴ�. ��ٱ��Ͽ� ���� ��ǰ�� ������ ��� ���ؼ� �� �����ݾ��� ��µǵ��� �Ͻÿ�. ��, $ ȯ����
		 * ��µǾ�� �մϴ�. 8.25,4.02,3.71
		 */

		float mer1 = 8.25f, mer2 = 4.02f, mer3 = 3.71f;
		float total = mer1 + mer2 + mer3;
		System.out.println("�� �����ݾ� $ " + String.format("%.2f", total) + "�Դϴ�.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // ���������� �ڷ��� ���� �ִ� �ڵ�
		System.out.println(aw);

	}

}
