import java.awt.*;
import java.awt.event.*;

 public abstract class awt4_class {
	public void view() {
		Frame f = new Frame();
		Button closebtn = new Button("종료");
		TextArea lb = new TextArea();
		Button btn = new Button("계산");
		TextField input = new TextField();
		f.setBounds(200,200,300,300);
		f.setVisible(true);
		f.setLayout(null);;
		lb.setBackground(Color.gray);
		lb.setBounds(50,100,200,100);
		btn.setBounds(180,50,80,25);	
		input.setBounds(50,50,100,25);
		closebtn.setBounds(50,200,80,25);
		clicks(btn,closebtn,input,lb);
		
		f.add(closebtn);
		f.add(input);
		f.add(btn);
		f.add(lb);
	}
	public abstract String btn_push(int t) ;
	public void clicks(Button btn1, Button close_btn, TextField input, TextArea lb) {
		close_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				lb.setText(btn_push(Integer.parseInt(input.getText())));
				}catch(Exception ee) {
					System.out.println("error");
				}
			}
		});
	}
	
		
}

