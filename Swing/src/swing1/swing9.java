package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//jeditor panel
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹 앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webPage = new JEditorPane();
		webPage.setBounds(10, 31, 721, 699);
		contentPane.add(webPage);
		webPage.setContentType("text/html"); // ContentType : 문자도 사용 그리고 HTML 코드도 사용
		webPage.setText("<h1>blackcat</h1>"
				+"<a href=' '><img src=https://img.asiatoday.co.kr/file/2018y/01m/31d/20180131121711051_1.gif>"
				+"<br><font color = 'orange'>검은고양이</font>");
	}
}
