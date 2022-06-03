public class Example3 {

	public static void main(String[] args) {
		/*
		   product: 수박,참외,사과,배,딸기,키위,바나나,망고
		   moneys: 35000 8000 4000 5500 3800 4400 11000 18900
		   장바구니에 해당상품을 모두 담았습니다. 사과와 바나나는 제외하고 총 결제금액 출력 
		 */
		
		String arrs[][]= { {"수박","참외","사과","배","딸기","키위","바나나","망고"},
				{"35000","8000","4000","5500","3800","4400","11000","18900"}};
		String dels[] = {"사과","바나나"};
		
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

