import java.util.Arrays;

/* �迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� �����ϱ� */
public class oop2 {

	public static void main(String[] args) {
		
		array1 ar = new array1();
		System.out.println(ar);

	}

}
class array1 {
	private int ar1[] ;
	private int ea;
	public array1() {
		// �迭�� �ʵ庯�� �������� ó���ϴ� ���
		this.ar1 = new int[]{1,2,3,4,5,6,7,4,10,79,2,64,84};
		ea = this.ar1.length;
		//5�̻� �迭���� ����ϱ�		
		int w = 0;
		String newdata="" ;
		while(w<ea) {
			if(this.ar1[w] >=5) {
				newdata += this.ar1[w] + ","; 
				// �ش� ���ǿ� �´� ���� ���ڿ��� ��ȯ�Ͽ� ����
			}
			w++;
		}
		String ar2[] = newdata.split(",");
		// �ش� ����� ���ڿ��� split ���� �����Ͽ� �迭�� �ӽ���ȯ(split�� ���ڻ�� �Ұ���)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];
		// ���ڿ� ������ŭ �迭 ������ ���� �߰��ϰ� �˴ϴ�.
		w = 0;
		while( w< ar2_ea) {
			oridata[w] = Integer.parseInt(ar2[w]);
			// ���ڸ� ���ڷ� ��ȯ�Ͽ� �ű� �迭�����ڿ� ���� ���� 
			w++;		
		}
		System.out.println(Arrays.toString(oridata));
	}
	
}
