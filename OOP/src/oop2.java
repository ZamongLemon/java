import java.util.Arrays;

/* 배열 신규 생성값을 정확하게 설정하여 신규배열로 생성하기 */
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
		// 배열을 필드변수 선언으로 처리하는 방식
		this.ar1 = new int[]{1,2,3,4,5,6,7,4,10,79,2,64,84};
		ea = this.ar1.length;
		//5이상 배열값만 사용하기		
		int w = 0;
		String newdata="" ;
		while(w<ea) {
			if(this.ar1[w] >=5) {
				newdata += this.ar1[w] + ","; 
				// 해당 조건에 맞는 값만 문자열로 변환하여 저장
			}
			w++;
		}
		String ar2[] = newdata.split(",");
		// 해당 저장된 문자열을 split 으로 구분하여 배열로 임시전환(split은 숫자사용 불가능)
		int ar2_ea = ar2.length;
		int oridata[] = new int[ar2_ea];
		// 문자열 갯수만큼 배열 생성자 값을 추가하게 됩니다.
		w = 0;
		while( w< ar2_ea) {
			oridata[w] = Integer.parseInt(ar2[w]);
			// 문자를 숫자로 변환하여 신규 배열생성자에 값을 저장 
			w++;		
		}
		System.out.println(Arrays.toString(oridata));
	}
	
}
