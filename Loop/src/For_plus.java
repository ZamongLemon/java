
public class For_plus {

	public static void main(String[] args) {
		//1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ�
		
		int f;
		int total=0;
		for(f = 1 ; f < 11;f++) { // total �������� �ݺ����� ���������� ������Ŵ 
			total += +f;
		}
		System.out.println("���հ� :"+total);
		//+=(���ϱ� �Ҵ��ȣ) -=(���� �Ҵ��ȣ) *=(�����Ҵ��ȣ) /=(�������Ҵ��ȣ)
		// b=b-f == b-=f
		
		/*
		 * ��ü ���� 500 �� 8ȸ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��� �� ���� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�
		 */
		int sum = 500;
		int k = 8;
		while(k >0) {
			sum-=12;
			k--;
		}
		System.out.println("���� ��:"+sum);
	}

}
