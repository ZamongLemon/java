import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * 관리자에서 메뉴를 활성화하는 프로세서 
		 * 해당 메뉴 활성화는 2차 배열이며 메뉴명, 활성화 하는 (Y,N)으로 구분
		 * Y인 메뉴명을 일차배열로 재구성 후 메인에서 출력되도록 합니다.
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
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
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
