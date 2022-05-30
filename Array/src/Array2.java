
public class Array2 {

	public static void main(String[] args) {
		//hong kim park
		String name[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(name[4]);
//		int word = name[4].length();
	//	System.out.println(word);
		/*
		 * 해당 사용자 리스트 배열이 있습니다. 해당 배열값중 사용자 id 4자이상만 출력하시오
		 */
		
		for(int i = 0 ; i < name.length ; i++) {// 배열의 길이 파악
			if(name[i].length()>3) {// 단어의 길이 파악
				System.out.println(name[i]);
			}
		}
		
		/*
		 	15 60 11 14 27
		*/
		int num[] = {15, 60 , 11 , 14, 27};
		int k =0,sum=0;
		while(k<num.length) {
			sum+=num[k];
			k++;
		}
		System.out.println("배열 값의 합 : "+ sum);
	}

}
