

public class Test2 {
	public static void main(String[] args) {

		int score = 92;
		String msg="";
		if(score>=90) {
			msg = "��� A �Դϴ�.";
		}else if (score >=70) {
			msg = "��� B �Դϴ�.";
		}else if (score >=50) {
			msg = "��� C �Դϴ�.";
		}else {
			msg = "�Ϲ� ��� �Դϴ�.";
		}
		
		System.out.println(msg);
	}
}
