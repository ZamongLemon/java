import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {

	/*
	 *  GUI mode  : AWT(abstract window 도구틀),SWING(AWT-그래픽)
	 *  CUI mode  : Scanner (X)
	 *  SWING : JFrame -> JPanel -> JObject
	 *  
	 */
	public static void main(String[] args) {
		//AWT 생성방식
		// Frame -> Panel -> Object (생성)
		// Object -> Panel -> Frame(적용)

		Frame fr = new Frame();
		fr.setTitle("사용자 로그인");//창 이름
		fr.setSize(500, 500);//창 크기
		fr.setVisible(true); //사용 유/무
		popclose pc = new popclose();
		fr.addWindowListener(pc);
		Panel pa = new Panel();//패널
		
		
		CheckboxGroup radio = new CheckboxGroup();//그룹설정

		TextField id = new TextField(10);
		TextField pw = new TextField(10);//10자까지
		TextField sa = new TextField("사원번호를 입력하세요");//데이터 미리 적용됨
		Button b1 = new Button("로그인");//오브젝트
		Checkbox c1 = new Checkbox("자동 로그인");
		Checkbox c2 = new Checkbox("동의함",true,radio);
		Checkbox c3 = new Checkbox("동의안함",false,radio);
		
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1);//add 추가

		fr.add(pa);//패널 > 프레임

	}

}


class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent event_) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
	}
}