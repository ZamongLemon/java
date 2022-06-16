import java.awt.*;
import java.awt.event.*;

//외부 클래스로 awt 생성
public class awt2 {
	

	public static void main(String[] args) {
		login lg = new login();
		System.out.println(lg);

	}

}
class signed extends login{
	public signed(){
		this.fr.setTitle("로그인 후 ");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login{ // 추상class를 먼저 로드하여 필드에 적용시킴
	Frame fr = new Frame();
	Font ft = new Font("굴림",Font.PLAIN,20);
	TextField mid = new TextField();
	Button btnsignin = new Button("로그인");
	Button btnexit = new Button("프로그램 종료");
	Button btnsignup = new Button("회원가입");
	
	Label msg = new Label();
	TextField mpw = new TextField();
	String[] ids = {"1","2","3","4","5"};
	String[] pws = {"1","2","3","4","5"};
	public login() {
		this.fr.setTitle("로그인로그인로그인");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.mid.setBounds(100,60,200,40);
		this.mid.setFont(ft);
		this.mpw.setBounds(100,120,200,40);
		this.mpw.setEchoChar('*'); // char형 ''
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
		
		this.msg.setText("로그인 정보");
		this.msg.setBounds(100,100,200,20);
		
		fr.add(msg);
		fr.add(mid);
		fr.add(mpw);
		fr.add(btnsignin);
		fr.add(btnsignup);
		fr.add(this.btnexit);
		
	}
	
	public void clicks() {//버튼에 관한 모든 핸들링 메소드 집합소 
		this.btnsignup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);
				signed sign = new signed(); // 다음 프레임 호출
				System.out.println(sign);

			}
		});
		
		this.btnsignin.addActionListener(new ActionListener() {
			//JOptionPane alert = new JOptionPane(); //SWING API 경고패널
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 ID 및 PW 검토 
				String user_id = mid.getText();// 사용자가 입력한 값을 가져올때 사용 .getText();
				String user_pw = mpw.getText();
				if(user_id.equals("")) {//null 또한 값이 있는상태
					msg.setText("아이디를 입력하세요");
				}else if(user_pw.equals("")) {
					msg.setText("패스워드를 입력하세요");
				}				
				else {
					msg.setText("");
					int k = ids.length;
					boolean log = false;
					for(int i = 0 ; i < k ; i++) {
						if(ids[i].equals(user_id) && pws[i].equals(user_pw)) {
							msg.setText("로그인에 성공하였습니다.");
							log = true;

							break;
						}
					}
					if(!log) {
						msg.setText("ID,PW정보를 확인하세요");
					}
				}
			}
		});
		
		this.btnexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료 이벤트 핸들링
				System.exit(0);
				
			}
		});
		
	}
	

}