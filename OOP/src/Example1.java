
public class Example1 {

	public static void main(String[] args) {
		//abstract ���빮��
		/*
		 	1�� �迭���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�. 
		 	��, abstract �⺻ void �̸��� sender
		 	���� ��°��� sender���� ��µǵ��� �մϴ�.
		 	�迭 ������: 6,13,22,9,12,64,32,47,39
		 	
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
