
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체 추상클래스 만들기
		box[] b = {new abox(),new abox2(),new abox3()};
//		for(box a : b) {// 특정 클래스를 중지하기 불편함
//			a.dataload();
//		}
		
		int w = 0,len= b.length;		
		while(w<len) {
			if(w!=1) {
				b[w].dataload();
			}
			w++;
		}
	}	
}
abstract class box {
	public abstract void dataload();
}

class abox extends box{
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}
class abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}
class abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("test3");
	}
}