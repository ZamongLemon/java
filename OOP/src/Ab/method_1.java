package Ab;

public class method_1 {
	public void recall() {
		System.out.println("test");
	}
	protected static void name() {
		System.out.println("named");
	}

	public static void main(String[] args) {
		// Arrays.sort : �迭 �������� ���� (����,�ѱ�,����) 
		// ������ ��� �빮�ڰ� ���� ���� ����
		/*Integer number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data,Collections.reverseOrder());;
		System.out.println(Arrays.toString(number_data));
				
		String user_data[] = {"ȫ�浿","�̼���","�庸��","������"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));
		*/
		
		// ���� 2�� ����,����
		// ���Ե� ������� ID�� Ȯ�� �� �ش� ����Ʈ ���� ���� + ���� ����Ʈ ������
		// ��� main class 
		// �迭 ������ : 
		/* String member_ship[][] = {
		{"kim","park","seo","oh","lee","jang","jeong","cho","ho","hwang"},
		{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
		���� ����Ʈ, ������ ����Ʈ�� ���� ��� ���
		 */
		
		mth1 mt = new ide_mth1();
		mt.setter("oh",2000);		
		System.out.println(mt.getter("oh"));	
	}



}
class ide_mth1 extends mth1{
	String member_ship[][] = {
			{"kim","park","seo","oh","lee","jang","jeong","cho","ho","hwang"},
			{"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
	@Override
	public void setter(String[] data3) {}
	@Override
	public void setter(String data1, int data2) {
		int j = this.member_ship[0].length;
		for(int i = 0 ; i < j ; i++) {
			if(data1.equals(this.member_ship[0][i])){
				int temp = Integer.parseInt(this.member_ship[1][i]);
				temp += data2;
				this.member_ship[1][i] = Integer.toString(temp);
				break;
			}
		}
	}	
	@Override
	public String getter(String name) {
		String name_point="�������� �ʴ� ������Դϴ�.";
		int j = this.member_ship[0].length;
		for(int i = 0 ; i < j ; i++ ) {
			if(this.member_ship[0][i].equals(name)) {
				name_point = name + "���� ���� ����Ʈ�� " + this.member_ship[1][i]+ "�Դϴ�.";
				break;
			}
		}		
		return name_point;
	}
}
