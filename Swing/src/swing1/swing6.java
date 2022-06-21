package swing1;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text = new JTextField();
		text.setFont(new Font("����ü", Font.PLAIN, 12));
		text.setBounds(10, 10, 354, 21);
		contentPane.add(text);
		text.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1B\uAE30");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(50, 61, 157, 23);
		btnNewButton.setBackground(new Color(60, 179, 113));
		contentPane.add(btnNewButton);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBounds(10, 105, 354, 130);
		contentPane.add(msg);
		
		text.addKeyListener(new KeyAdapter() {
			//keyPressed Ű�� ������
			//keyReleased Ű�� ������
			//keyTyped �Է¹�����
			@Override
			public void keyTyped(KeyEvent k) {//Ű�� ������ ����Ǵ� �̺�Ʈ Ŭ����
				int i = text.getText().length();

				int temp1 = Integer.valueOf(k.getKeyChar());
				
				if((temp1 >=48 && temp1 <=57 || temp1==8)&& i <=11) {
					msg.setText("");
				}else {
					msg.setText("���ڸ� �Է��ϼ���.");
					if(i>11) {
						msg.setText("���� �� �ʰ�");
					}
					
					k.consume();//keytyped �� �̿� �Է��� ���� ���������� ���� 
				
				}
			
		}});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	
	
	}

}
