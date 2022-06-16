import java.awt.*;
import java.awt.event.*;

//awt 환경설정

public abstract class awt5_abstract {
	Frame f = new Frame();
	Button[] btn = {new Button("중복체크"),new Button("종료")};;
	Label msg = new Label();
	TextField mid = new TextField();
	public abstract String signok();//getter
	public abstract void idcheck(String id);//setter
	public abstract void dataload();
	public void design() {
		this.f.setBounds(1500, 500, 300, 450);
		this.f.setVisible(true);
		this.f.setLayout(null);
		this.btn[0].setBounds(200,50,80,25);
		this.btn[1].setBounds(200,410,80,25);
		this.btn[0].setBackground(Color.black);
		this.btn[1].setBackground(Color.black);
		this.btn[0].setForeground(Color.white);
		this.btn[1].setForeground(Color.white);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(30,80,250,25);
		this.mid.setBounds(30,50,150,25);
		this.f.add(btn[0]);
		this.f.add(btn[1]);
		this.f.add(msg);
		this.f.add(mid);
		this.click();//awt 디자인 완료 후 해당 핸들링 메소드로 이동
	}
	public void click() {
		this.btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = awt5_abstract.this.mid.getText();
				if(userId.equals("")) {
					msg.setText("ID를 입력하세요.");
				}else {
					idcheck(userId);
				}
			
			}
		});
		this.btn[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
