

public class time3 {

	public static void main(String[] args) {	
		/*try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/

		/* 
		 	���빮��, �ܺ� Class�� �ֽ��ϴ�. �� ���� Ŭ�������� �ش� �ܺ� Class�� �ε��ϸ�
		 	�ش� method���� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�. 
		 	8�����Ŀ� return���� "�Ա��� ��� ó���Ǿ����ϴ�."��� ���ڸ� �޵��� �Ͻʽÿ�.
		 */
		
	//	Timer timer = new Timer();
	//	timer.scheduleAtFixedRate(new schedule(), 0, 8000);
		wait d = new wait();
		System.out.println(d.waitsec());
		
	}

}

class wait {
	
	public String waitsec(){
		System.out.println("ó�����Դϴ�. ��ø� ��ٷ��ּ���");
		try {
		Thread.sleep(8000);
		}catch(InterruptedException e) {}
		return "�Ա��� ��� ó���Ǿ����ϴ�.";
	}
	
}

