import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� ���ڹ迭 �����Ͱ��� �ֽ��ϴ�. a1 : {"ȫ�浿","�̼���","������","������","������"} a2 :
		 * {"100","80","39","60","55"}
		 * 
		 * �˻��ϰ��� �ϴ� �̸��� �����ּ���. �˻��ϸ� �̼��Ŵ��� 80���Դϴ�.��� ���
		 */

		String[][] datas = { { "ȫ�浿", "�̼���", "������", "������", "������" }, { "100", "80", "39", "60", "55" } };
		Scanner scan_name = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���");
		String name = scan_name.next();
		findName findN = new findName();
		findN.find(datas, name);
		scan_name.close();
		findN=null;
	}
}

class findName {
	public void find(String[][] datas, String name) {
		boolean c = false;
		String msg = "";
		for (int i = 0; i < datas[0].length; i++) {
			if (datas[0][i].equals(name)) {
				msg = datas[0][i] + "���� " + datas[1][i] + "�� �Դϴ�.";
				c = true;
				break;
			}
		}
		if (!c) {
			msg = "�������� �ʴ� �̸��Դϴ�.";
		}
		System.out.println(msg);
	}
}
