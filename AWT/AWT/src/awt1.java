import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class awt1 {
	public awt1() {
	}
	public static void main(String[] args) {
		// Frame > Bound > Object
		
		Frame fr = new Frame();//â	
		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setLayout(null);//�г� ��� ����
		fr.setBounds(150,150,500,500);// (ȭ�� x��, ȭ�� y��, ����ũ��, ����ũ��)
		
		
		Button btn = new Button("Ŭ��");
		Button close_btn = new Button("�ݱ�");
		Label msg = new Label("");
		//msg.setBackground(Color.red);
		btn.setBounds(75,40,100,30);
		close_btn.setBounds(325,40,100,30);
		msg.setBounds(40,100,300,20);
		// addActionListener(��ư) : �̺�Ʈ �޼ҵ� ��, this ��� ���� �ȵ�
		close_btn.addActionListener(new ActionListener() {
			// new ActionListener() : Override �޼ҵ� �ڵ�����
            
            @Override
            public void actionPerformed(ActionEvent arg0) { 
                // TODO Auto-generated method stub
                System.exit(0); //���α׷� ����
            }
		});
		btn.addActionListener(new ActionListener() {
            String a = "����";//addActionListener : �̺�Ʈ �޼ҵ� �ʵ忡 String�� ����
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
