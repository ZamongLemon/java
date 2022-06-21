package swing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JTextField;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(56, 30, 326, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rd1 = new JRadioButton("\uC2E0\uC6A9\uCE74\uB4DC");
		rd1.setSelected(true);
		rd1.setBounds(20, 5, 73, 23);
		rd1.setFont(new Font("돋움체", Font.PLAIN, 12));
		rd1.setName("CARD");
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("\uACC4\uC88C\uC774\uCCB4");
		rd2.setBounds(116, 5, 73, 23);
		rd2.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd2);
		rd2.setName("TRANSFER");
		JRadioButton rd3 = new JRadioButton("\uBB34\uD1B5\uC7A5 \uC785\uAE08");
		rd3.setBounds(216, 5, 91, 23);
		rd3.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(rd3);
		rd3.setName("DEPOSIT");
		
		JButton btn = new JButton("\uACB0\uC81C\uC9C4\uD589");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(116, 34, 93, 23);
		ButtonGroup gp = new ButtonGroup();//라디오 사용시 이용
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		panel.add(btn);
		
		JPanel mu = new JPanel();
		mu.setBounds(10, 141, 418, 114);
		contentPane.add(mu);
		mu.setVisible(false);
		mu.setLayout(null);
		mu.setBorder(new TitledBorder(new LineBorder(Color.black),"무통장입금"));
		
		textField = new JTextField();
		textField.setFont(new Font("돋움체", Font.PLAIN, 12));
		textField.setBounds(10, 26, 191, 21);
		mu.add(textField);
		textField.setColumns(10);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String pay = "";
				if(rd1.isSelected()) {
					pay = rd1.getName();
					System.out.println(pay);
					System.out.println("신용카드 선택");
					mu.setVisible(false);
				}else if(rd2.isSelected()) {
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				}else if(rd3.isSelected()) {
					System.out.println("무통장 입금 선택");
					mu.setVisible(true);
				}
			}
		});
	}
}

