import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ��� 
		 * �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸� �޴���, Ȱ��ȭ �ϴ� (Y,N)���� ����
		 * Y�� �޴����� �����迭�� �籸�� �� ���ο��� ��µǵ��� �մϴ�.
		 */
		
		menus menu = new menus();
		menu.setMenu();
		menu = null;
		
		

	}

}

class menus{
	
	private String[][] menu_data; // field
	public menus() {// constructor
		String[][] ms = {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};		
		this.menu_data = ms;
	}
	
	public void setMenu() { // method
		int int_countY = this.countY(this.menu_data[1]);
		String[] Arranged = this.arrArrange(this.menu_data, int_countY);
		System.out.println(Arrays.toString(Arranged));		
	}
	
	private int countY(String[] arr) { 
		int count = 0;
		int arr_len = arr.length;
		for(int i = 0 ; i < arr_len ; i++) {
			if(arr[i].equals("Y")) {
				count++;
			}
		}
		return count;
	}
	
	private String[] arrArrange(String[][] arr, int num ) { 
		String[] result = new String[num];
		int j = 0;
		int arr_len = arr[0].length;
		for (int i = 0 ; i < arr_len;i++) {
			if(arr[1][i].equals("Y")) {
				result[j] = arr[0][i];
				j++;
			}
		}		
		return result;
	}
}
