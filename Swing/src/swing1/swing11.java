package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("ImageLoad");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(335, 232, 93, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lb.setBounds(10, 10, 399, 203);
		contentPane.add(lb);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\Java5\\Swing\\src\\swing1\\xd2.jpg");
				//imageicon 이미지 로드할때 사용함
				Image reimg = img.getImage();
				//getScaledInstance(가로스키,세로크기,이미지 변환법)
				//scale_smooth : 부드럽게 적용 , scale_fast 깨지지만 빠름
				//scale_default 이미지가 가지고있는 해상도에 맞춰 적용
				//scale_area_averaging 모니터 해상도 평균값으로 적용
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_SMOOTH);
				img.setImage(resize);
				lb.setIcon(img);
		}
		});
	}
}
