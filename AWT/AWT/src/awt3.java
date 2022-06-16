import java.awt.Frame;

public class awt3 {
	//abstract로 awt 로드
	public static void main(String[] args) {
		design p = new popup();
		design p2 = new popup2();
		p.designT("awt연습 타이틀");
		p2.designT("awt 연습 프레임 2번째");
	}

}
abstract class design {
	Frame fr = new Frame();
	public void designT(String title){ 
		this.fr.setTitle(title);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(0,0,300,300);
	}
	public abstract void page();	
	
}
class popup extends design{
	@Override
	public void page() {
		
	}
}
class popup2 extends design{
	@Override
	public void page() {
	}
}
