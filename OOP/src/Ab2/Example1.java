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
	 * 휴대폰에 추가기능 필요 휴대폰 고장시 최소전원 20 - > 정상작동 40이상 80이상 고장 1.휴대폰 고장시 전원은 공급되지만 화면이
	 * 고장날경우 (전원 공급중이지만 작동이 안됨) - 20~ 39 2.전원을 공급시키지만 충전이 안될 경우 (공급이 안되는경우) - 20미만
	 * 
	 */

}

class computer implements home {
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중!!");
	}

	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단");
	}

	@Override
	public void broken(int n) {
		if (bk <= n) {
			System.out.println("컴퓨터 고장");
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
		System.out.println("모니터 전원 공급중!!");
	}

	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단");
	}

	@Override
	public void broken(int n) {
		if (bk <= n) {
			System.out.println("컴퓨터 고장");
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
		System.out.println("핸드폰 전원 공급중!");
	}

	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원 중단");
	}

	@Override
	public void broken(int n) {
		if(bk <= n) {
			System.out.println("핸드폰 고장");
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
		System.out.println("전원공급이 안됩니다.");
	}

	@Override
	public void powerchk2() {
		System.out.println("작동이 안됩니다.");
	}
}