package Ab2;

public class Example1 {

	public static void main(String[] args) {
		home[] h = { new computer(), new monitor(), new phone() };
		// h[0].broken(50);
		// h[1].broken(0);
		phone p = (phone)h[2];
		p.broken(46);
	}
	/*
	 * �޴����� �߰���� �ʿ� �޴��� ����� �ּ����� 20 - > �����۵� 40�̻� 80�̻� ���� 1.�޴��� ����� ������ ���޵����� ȭ����
	 * ���峯��� (���� ������������ �۵��� �ȵ�) - 20~ 39 2.������ ���޽�Ű���� ������ �ȵ� ��� (������ �ȵǴ°��) - 20�̸�
	 * 
	 */

}

class computer implements home {
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������!!");
	}

	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�");
	}

	@Override
	public void broken(int n) {
		if (bk <= n) {
			System.out.println("��ǻ�� ����");
		} else if (bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}

class monitor implements home {
	@Override
	public void poweron() {
		System.out.println("����� ���� ������!!");
	}

	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�");
	}

	@Override
	public void broken(int n) {
		if (bk <= n) {
			System.out.println("��ǻ�� ����");
		} else if (bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}

class phone implements home2 {

	@Override
	public void poweron() {
		System.out.println("�ڵ��� ���� ������!");
	}

	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�");
	}

	@Override
	public void broken(int n) {
		if(bk <= n) {
			System.out.println("�ڵ��� ����");
		}else if(bk > n && n > 0){
			if (n<20) {
				powerchk1();}
			else if (n<40){
				powerchk2();}
			else{
				this.poweron();}
		}else {
			this.poweroff();	
		}
	}

	@Override
	public void powerchk1() {
		System.out.println("���������� �ȵ˴ϴ�.");
	}

	@Override
	public void powerchk2() {
		System.out.println("�۵��� �ȵ˴ϴ�.");
	}
}