
public class oop6 {

	public static void main(String[] args) {
		// �迭 ������ ������ ��ü �߻�Ŭ���� �����
		box[] b = {new abox(),new abox2(),new abox3()};
//		for(box a : b) {// Ư�� Ŭ������ �����ϱ� ������
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