
public class If_for {

	public static void main(String[] args) {
//		final int a = 1; // final �� ���� ����> ����� ����
//		System.out.println(a);
//		final String name = "ȫ�浿";
//		System.out.println(name);

		final int ct = 15; // ������
		int f; // �ݺ���
		boolean ok = false; // ���ǿ� ���� true, false�� ����
		for (f = 1; f < 11; f++) {
			if (f == ct) {// �ݺ��� ���� �������� ���� ���
				System.out.println("��ϵ� ���� Ȯ�� �˴ϴ�.");
				ok = true; // ���ǿ� ���� ���� �����մϴ�.
			}
		}
		if (!ok) {// �ݺ����� ���������� ������ �������� �ʴ°�� �޽����� ����ϴ� �ڵ�
			System.out.println("Ȯ�ε��� �ʴ� �����Դϴ�.");
		}
		/*
		 * �� 20���� ���� �ݺ� ���� Ȧ������ ���
		 */
		System.out.println("----------------------------------------------");
		String odd = "", even = "";
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 1) {//���࿡ Ȧ�� ���� ��� odd ������ ���������� ���� �߰��ϰ� �˴ϴ�.
				odd += i + " "; // �߰��Ұ�� " " ������� Ȱ���Ͽ� ���� 
			} else { 
				even += i + " ";
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
