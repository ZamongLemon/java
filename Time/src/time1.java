
public class time1 {
	/*
	 	try - catch �� ����ó����� ����
	 */
	public static void main(String[] args) {
		for(int i= 1 ; i <= 10 ; i++) {
			try {//���ܹ߻��� �ڵ带 ����
				Thread.sleep(1000); //1000 = 1��
			}catch(InterruptedException e){
				
				//InterruptedException : �ش� ���ܹ߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			catch(Exception e) {
				
			}
			System.out.println(i);
		}
	}

}
