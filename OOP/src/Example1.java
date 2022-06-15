
public class Example1 {

	public static void main(String[] args) {
		//abstract 응용문제
		/*
		 	1차 배열값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다. 
		 	단, abstract 기본 void 이름은 sender
		 	최종 출력값은 sender에서 출력되도록 합니다.
		 	배열 데이터: 6,13,22,9,12,64,32,47,39
		 	
		 */
		//base c = new calc();
	}

}
abstract class base{
	public int[] arr = {6,13,22,9,12,64,32,47,39};
	public abstract void sender() ;
	base(){
		this.sender();
	}
}
class calc extends base{
	public void sender(){
		int sum = 0;
		for(int a : this.arr) {
			sum+=a;
		}
		System.out.println(sum);
	}
}
