import java.util.Arrays;

public class Method4 {
	public static void main(String[] args) {
		//return �� �� 2�� ����ϱ� 
		
		per p = new per();
		String info = p.userInfo();
		String[] info2 = info.split(",");
		
		System.out.println(Arrays.toString(info2));
		
		/* return �� �� 2�� ����Ҵ� split�Ǵ� �迭 Ȱ��*/
		
		String[] myinfo = p.userInfo2();
		System.out.println(Arrays.toString(myinfo));
		
	}

}

class per {
	public String userInfo(){
		String user_name ="ȫ�浿";
		String user_id = "hong";
		String user_info = user_name +","+user_id;
		return user_info;
	}
	public String[] userInfo2(){
		String user_name ="ȫ�浿";
		String user_id = "hong";
		return new String[]{user_name,user_id}; // �ش� �Ѱ� �̻��� ���� return���� ���� ��� 
	}
	
}
