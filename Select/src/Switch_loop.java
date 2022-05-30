
public class Switch_loop {

	public static void main(String[] args) {
		
		//case 안에 반복문을 각각 사용가능 또한 동일한 변수명을 사용해도 가능하며, case 각각 다르게 작동하기 때문에 문제가 되는 사항은 없습니다.
		//단, case는 하나의 조건이 맞을경우 나머지 case는 절대 작동하지 않습니다.
		String sign ="*";
		int total;
		switch(sign){
			case "+" ->{ 
				total = 0;
				for (int f = 1 ; f<=5;f++) {
					total +=f;
				}
			}
			case "-" ->{
				total =0;
			}
			case "*" ->{
				total = 1;
				int k =1;
				do {
					total*=k;
					k++;
				}while(k<6);
			}
			case "/" ->{
				total = 0;
			}
			default ->{
				total =1;
			}
		}
		System.out.println("총 계산된 값 : " + total );
		
	}

}
