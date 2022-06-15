import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class awt1 {
	public awt1() {
	}
	public static void main(String[] args) {
		// Frame > Bound > Object
		
		Frame fr = new Frame();//창	
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null);//패널 사용 안함
		fr.setBounds(150,150,500,500);// (화면 x축, 화면 y축, 가로크기, 세로크기)
		
		
		Button btn = new Button("클릭");
		Button close_btn = new Button("닫기");
		Label msg = new Label("");
		//msg.setBackground(Color.red);
		btn.setBounds(75,40,100,30);
		close_btn.setBounds(325,40,100,30);
		msg.setBounds(40,100,300,20);
		// addActionListener(버튼) : 이벤트 메소드 단, this 사용 절대 안됨
		close_btn.addActionListener(new ActionListener() {
			// new ActionListener() : Override 메소드 자동생성
            
            @Override
            public void actionPerformed(ActionEvent arg0) { 
                // TODO Auto-generated method stub
                System.exit(0); //프로그램 종료
            }
		});
		btn.addActionListener(new ActionListener() {
            String a = "ㅎㅎ";//addActionListener : 이벤트 메소드 필드에 String을 생성
			@Override
            public void actionPerformed(ActionEvent arg0) {
               msg.setText(this.a);
            	
            }
		});

		fr.add(msg);
		fr.add(btn);
		fr.add(close_btn);

	}

}
