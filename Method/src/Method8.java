
public class Method8 {
	static int odbint[] = {1,3,5};
	public static void main(String[] args) {
		/*
		 	���� ���α׷��Ӱ� �ش� DB(database)�� �� �� Ȧ������ ���� �� ������ �ް��� �մϴ�.
		 	�ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
		 */
		odbc od = new odbc();
		System.out.println("Ȧ���� ���� : "+od.odd_Count());
		od=null;
	}

}
class odbc{
	
	private int[] odbint ; // �迭���� ������� �ʵ��� private
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.odbint = odata;
	}
	
	public int odd_Count() {
		int count = 0,i=0; // cnt Ȧ���ϰ�� ���� ���� i while ���� 
		
		while(i<this.odbint.length){
			if(this.odbint[i] %2==1) {
				count++;
			}
			i++;
		}
		return count;
	}
}