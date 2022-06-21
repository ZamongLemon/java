package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing12 extends JFrame {

	private JPanel contentPane;
	private String[] imgAddress = {"C:\\Java5\\Swing\\src\\swing1\\xdx.jpg",
			"C:\\Java5\\Swing\\src\\swing1\\xd2.jpg",
			"C:\\Java5\\Swing\\src\\swing1\\im.gif"
	};
	public int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.ORANGE, new Color(219, 112, 147), null, null));
		lb.setFont(new Font("돋움체", Font.PLAIN, 12));
		lb.setBounds(28, 80, 609, 545);
		JButton prev = new JButton("이전");
		JButton next = new JButton("다음");
		contentPane.add(lb);
		prev.setBounds(28, 21, 93, 23);
		next.setBounds(544, 21, 93, 23);
		contentPane.add(prev);
		contentPane.add(next);		
		ImageIcon[] v = new ImageIcon[imgAddress.length];
		int k = imgAddress.length;
		for(int i = 0 ; i < k ; i++) {
			v[i] = new ImageIcon(imgAddress[i]);
		}
		
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count--;
				if(swing12.this.count<0) {
					swing12.this.count = 0;
				}
				lb.setIcon(v[count]);
			}
		});

		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count++;
				if(swing12.this.count >2) {
					swing12.this.count=2;
				};
				lb.setIcon(v[count]);
			}
		});
	
		

	}

}
