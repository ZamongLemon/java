
public class oop3 {
// multi thread(��Ƽ ������) : start, run, sleep, setStop
// ��Ƽ ������ : CPU�� �ھ���� ��������
	public static void main(String[] args) {
		//������ (Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ���մϴ�.
		// Multi Thread (��Ƽ ������) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���û��
		// ������ -> ����
		// ��Ƽ ������ -> ����, ��Ʃ�� , ���� (��Ƽ �½�ŷ)
		
		Thread my = new mythread(); // �θ� �޼ҵ� = �ڽ� �޼ҵ�
		//���� ������� : �ڽ� �޼ҵ� = �ڽ� �޼ҵ�
		my.start();
		Thread t2 = new test2();
		t2.start(); // Thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� start ��ɾ�
		int ct=1;
		while(ct<=10) {
			System.out.println("���� Ŭ���� :" + ct);
			ct++;
		}

	}

}

class mythread extends Thread{
	//Thread : jvm �⺻���� ž��� �޼ҵ� (Thread �� �ܵ����� ������� ���� , extends�� ����)
	@Override
	public void run() { //run�̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		for (int i =1 ; i <= 10 ; i++) {
			System.out.println("�ܺ� Ŭ���� : " + i);
		}
	}
}
class test2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("�ܺ� Ŭ����2 : " + i);
		}
	}
}
