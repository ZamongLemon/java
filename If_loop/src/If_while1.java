public class If_while1 {

	public static void main(String[] args) {
		// while������ 10~30���� ���� �߿��� Ȧ������ ���
		int n = 10;
		while (n < 31) {
			if (n % 2 == 1 && n >= 20) {
				System.out.printf("%d ", n);
			}
			n++;
		}

		System.out.println("\n-------------------------------------");

		// ī���� ������ ���� �ľ�
		// 1~ 10���� ������ ¦���� ������ ī����
		int count = 0, m = 1;
		while (m <= 10) {// ī���� ������
			if (m % 2 == 0) {// ¦���� ���
				count++; // ������ ������ 1�� ����
			}
			m++;
		}
		// �ݺ��� ����� �� ���
		System.out.println("1~10�� ¦���� ������ : " + count);

		System.out.println("\n-------------------------------------");

	}



}
