import java.awt.*;
import java.awt.event.*;

abstract public class awt6_abstract {
	Frame f = new Frame();
	Button[] btn = {new Button("인증번호 발송"),new Button("인증확인"),new Button("종료")};;
	Label msg = new Label();
	TextField mid = new TextField();
	public abstract void makeNumber();
	public abstract void checkNumber();
	public void design() {
		this.f.setBounds(800, 500, 350, 180);
		this.f.setVisible(true);
		this.f.setLayout(null);
		this.btn[0].setBounds(20,40,100,25);
		this.btn[1].setBounds(230,75,100,25);
		this.btn[2].setBounds(300,40,30,25);
		this.btn[0].setBackground(Color.black);
		this.btn[1].setBackground(Color.black);
		this.btn[2].setBackground(Color.black);
		this.btn[0].setForeground(Color.white);
		this.btn[1].setForeground(Color.white);
		this.btn[2].setForeground(Color.white);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(20,120,250,25);
		this.mid.setBounds(20,75,140,25);
		this.f.add(btn[0]);
		this.f.add(btn[1]);
		this.f.add(btn[2]);
		this.f.add(msg);
		this.f.add(mid);
		this.click();//awt 디자인 완료 후 해당 핸들링 메소드로 이동
	}
	public void click() {
		this.btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				makeNumber();
			}
		});
		this.btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				checkNumber();
			}
		});
		this.btn[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
