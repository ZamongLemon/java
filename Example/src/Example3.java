public class Example3 {

	public static void main(String[] args) {
		/*
		   product: ����,����,���,��,����,Ű��,�ٳ���,����
		   moneys: 35000 8000 4000 5500 3800 4400 11000 18900
		   ��ٱ��Ͽ� �ش��ǰ�� ��� ��ҽ��ϴ�. ����� �ٳ����� �����ϰ� �� �����ݾ� ��� 
		 */
		
		String arrs[][]= { {"����","����","���","��","����","Ű��","�ٳ���","����"},
				{"35000","8000","4000","5500","3800","4400","11000","18900"}};
		String dels[] = {"���","�ٳ���"};
		
		Example3 ex3 = new Example3();
		ex3.arrange(arrs, dels);
		ex3 = null;		
		
		}
	
	void arrange(String[][] datas,String[] del) {
		
		int sum=0;
		for(int i= 0 ; i < datas[0].length ; i++) {
			for(String name : del) {
				if(datas[0][i].equals(name)) {
					datas[1][i]="0";
					break;
				}
			}
			sum+= Integer.parseInt(datas[1][i]);		
		}
		System.out.println(sum);
	}

}

