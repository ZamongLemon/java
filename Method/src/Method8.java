
public class Method8 {
	static int odbint[] = {1,3,5};
	public static void main(String[] args) {
		/*
		 	협업 프로그래머가 해당 DB(database)에 값 중 홀수값에 대한 총 갯수를 받고자 합니다.
		 	해당 갯수가 출력될 수 있도록 코드를 작성하시오.
		 */
		odbc od = new odbc();
		System.out.println("홀수의 갯수 : "+od.odd_Count());
		od=null;
	}

}
class odbc{
	
	private int[] odbint ; // 배열값이 변경되지 않도록 private
	public odbc() {
		int[] odata = {15,22,17,14,32,35,19,33};
		this.odbint = odata;
	}
	
	public int odd_Count() {
		int count = 0,i=0; // cnt 홀수일경우 증가 변수 i while 변수 
		
		while(i<this.odbint.length){
			if(this.odbint[i] %2==1) {
				count++;
			}
			i++;
		}
		return count;
	}
}