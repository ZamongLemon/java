import java.awt.*;
import java.awt.event.*;

//�ܺ� Ŭ������ awt ����
public class awt2 {
	

	public static void main(String[] args) {
		login lg = new login();
		System.out.println(lg);

	}

}
class signed extends login{
	public signed(){
		this.fr.setTitle("�α��� �� ");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login{ // �߻�class�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ
	Frame fr = new Frame();
	Font ft = new Font("����",Font.PLAIN,20);
	TextField mid = new TextField();
	Button btnsignin = new Button("�α���");
	Button btnexit = new Button("���α׷� ����");
	Button btnsignup = new Button("ȸ������");
	
	Label msg = new Label();
	TextField mpw = new TextField();
	String[] ids = {"1","2","3","4","5"};
	String[] pws = {"1","2","3","4","5"};
	public login() {
		this.fr.setTitle("�α��ηα��ηα���");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.mid.setBounds(100,60,200,40);
		this.mid.setFont(ft);
		this.mpw.setBounds(100,120,200,40);
		this.mpw.setEchoChar('*'); // char�� ''
		this.mpw.setFont(ft);
		
		
		this.btnsignin.setBounds(100,180,200,40);
		this.btnsignin.setBackground(new Color(255,53,184));
		this.btnsignin.setForeground(Color.white);
		
		this.btnsignup.setBounds(100,240,200,40);
		this.btnsignup.setBackground(Color.blue);
		this.btnsignup.setForeground(Color.white);
		
		
		this.btnexit.setBounds(100,300,200,40);
		this.btnexit.setBackground(Color.black);
		this.btnexit.setForeground(Color.white);
		this.clicks();
		
		this.msg.setText("�α��� ����");
		this.msg.setBounds(100,100,200,20);
		
		fr.add(msg);
		fr.add(mid);
		fr.add(mpw);
		fr.add(btnsignin);
		fr.add(btnsignup);
		fr.add(this.btnexit);
		
	}
	
	public void clicks() {//��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ� 
		this.btnsignup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);
				signed sign = new signed(); // ���� ������ ȣ��
				System.out.println(sign);

			}
		});
		
		this.btnsignin.addActionListener(new ActionListener() {
			//JOptionPane alert = new JOptionPane(); //SWING API ����г�
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ��ư ID �� PW ���� 
				String user_id = mid.getText();// ����ڰ� �Է��� ���� �����ö� ��� .getText();
				String user_pw = mpw.getText();
				if(user_id.equals("")) {//null ���� ���� �ִ»���
					msg.setText("���̵� �Է��ϼ���");
				}else if(user_pw.equals("")) {
					msg.setText("�н����带 �Է��ϼ���");
				}				
				else {
					msg.setText("");
					int k = ids.length;
					boolean log = false;
					for(int i = 0 ; i < k ; i++) {
						if(ids[i].equals(user_id) && pws[i].equals(user_pw)) {
							msg.setText("�α��ο� �����Ͽ����ϴ�.");
							log = true;

							break;
						}
					}
					if(!log) {
						msg.setText("ID,PW������ Ȯ���ϼ���");
					}
				}
			}
		});
		
		this.btnexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���α׷� ���� �̺�Ʈ �ڵ鸵
				System.exit(0);
				
			}
		});
		
	}
	

}