
public class Method3 {
	public static void main(String[] args) {
	
		/*
		 	���빮��. �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 	���� ��갪�� �޾Ƽ� ����� ����Ͻÿ�.
		 	157, 45;
		 	157*45;
		 */
		
		int[] data = {157,45};
		
		calc calc = new calc();
		System.out.println("�迭 ������ �� : " + calc.product(data));
		
		calc.m2();
		calc.product();
		/*
		 	���� ���� �ϳ��� �ش� �޼ҵ�� ���� 
		 	�ش� �޼ҵ忡���� ���������� ó��
		 	���� 3�� �����ϸ� 3*1~3*9������ ������� ���Ͽ� sysout���� ��µǵ��� �Ͻʽ�
		 */
		System.out.println("==============");
		System.out.println("3���� �� : " + calc.multipletable(3));
		calc = null;
	}

}
class calc{
	int product(int[] arr) {
		int prod = 1;
		for(int i = 0 ; i < arr.length;i++) {
			prod *= arr[i];
		}
		return prod;
	}
	public void product () {	
		System.out.println("�����Դϴ�.");
	}
	void m2() {
		int[] a = {100,200};
		System.out.println(product(a));
	}
	int multipletable(int a) {
		int sum = 0;
		for(int i = 1 ; i <10 ; i ++) {
			sum += a*i;
		}
		return sum; // return ���� �ݺ��� �ȿ� ���� x , ���ǹ��̶� ���� return ��� �ȵ� 
	}
	
	public String mb (String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";
		}else {
			msg="cancel";
		}
		return msg;
		
		/*
		 	�������� ���� return ��Ű�°� ����
		 */
	}
}
