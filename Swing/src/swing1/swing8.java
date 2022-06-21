package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//progress바 사용법
public class swing8 extends JFrame {

	public JProgressBar progressBar ; 
	private JPanel contentPane;
	boolean tasking_progressBar=false;
	private JLabel lb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.progressBar= new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.DARK_GRAY);
		progressBar.setForeground(Color.BLUE);
		progressBar.setFont(new Font("돋움체", Font.PLAIN, 12));
		progressBar.setValue(70);
		progressBar.setBounds(54, 27, 301, 24);
		contentPane.add(progressBar);
		
		//swing 프로그램이 작동 후 해당 메소드로 1초후 실행되도록 적용함
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Timer t = new Timer();
				TimerTask tT = new TimerTask() {
					@Override 
					public void run() {
						if(!tasking_progressBar) {
							tasking_progressBar=true;
							pstart();							
						}
					}
				};
				t.schedule(tT, 100);
			}
		});
		btnNewButton.setBounds(54, 114, 93, 23);
		contentPane.add(btnNewButton);
		
		lb = new JLabel("");
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("돋움체", Font.PLAIN, 20));
		lb.setBounds(22, 147, 406, 108);
		contentPane.add(lb);
		
	}
	
	public void pstart() {
		int w=0;
			while(w<=100) {
				try {
					this.progressBar.setValue(w);
					Thread.sleep(100);
				}catch(Exception k){
					System.out.println("오류 발생");
				}
				w++;			
		}
			lb.setFont(new Font("돋움체",Font.BOLD,25));
			lb.setForeground(Color.BLUE);
			lb.setText("다운로드가 완료되었습니다.");
			tasking_progressBar = false;
	}
}
