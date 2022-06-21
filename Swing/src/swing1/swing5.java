package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.ComponentOrientation;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	
	Frame�� absolute ���·� layer ����
	
	 */
	public swing5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u3147\u3147\u3147");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(135, 87, 152, 28);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setFont(new Font("����ü", Font.PLAIN, 12));
		mid.setBounds(80, 49, 264, 28);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setFont(new Font("����ü", Font.PLAIN, 12));
		msg.setBorder(new LineBorder(Color.RED, 4));
		msg.setBounds(60, 133, 308, 89);
		contentPane.add(msg);
		
		//�ڵ鸵 Ŭ������ ������Ʈ���� ���ʿ� ������ �ش� ������Ʈ�� �ε����� ����
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}else {
					if(mid.getText().length() < 5) {// �Է� ���� ���� Ȯ��
						msg.setText("���̵�� 5�� �̻��̿��� �մϴ�.");
					}else {
						msg.setText("���̵� ���� ���Դϴ�.");
					}
				}
			}
		});
	}
}
