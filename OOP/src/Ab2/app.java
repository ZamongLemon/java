package Ab2;

public class app {

	public static void main(String[] args) {
		// �ڽ� = �ڽ� -> ��� ȣ�� ���� 
		//�θ� = �ڽ� -> �������̽� �������� ����� �������̵常 ȣ���� (����ȯ)
		members mb = new members(); // �ڽ� class ����
		app_data2 ap = mb; //interface ���� (Ŭ���� -> �������̽� ����)
		ap.oop();
		ap.oop2();
		
		members mb2 = (members)ap; // �������̽� -> Ŭ���� ��ȯ
		
		mb2.ced();
	
	}
	

}
/*App_data1�� ������ �ڷ��� �����ϴ� ���
class members implements app_data1{
	 
}*/

class members implements app_data2{
	
		@Override
		public void oop() {
			System.out.println("test");
		}
		@Override
		public void oop2() {
			System.out.println("test2");		
		}
		
		public void ced() {
			System.out.println("test3");
		}
		
}
