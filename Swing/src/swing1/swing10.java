package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class swing10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String list[] = {"º±≈√«ÿ¡÷ººø‰.","SKT","KT","LGT","æÀ∂„∆˘"};
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("µ∏øÚ√º", Font.PLAIN, 12));
		cb.setBounds(30, 24, 182, 23);
		contentPane.add(cb);
		
		
		JLabel msg = new JLabel("");
		msg.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		msg.setFont(new Font("µ∏øÚ√º", Font.PLAIN, 12));
		msg.setBounds(30, 103, 201, 38);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//String.valueOf(cb.getSelectedItem();
				//cb.getSelectedItem().toSTring();
				//String.valueOf(e.getItem();
				//\nSystem.out.println(cb.getSelectedIndex());
				msg.setText(cb.getSelectedItem().toString());
				
			}
		});
	}
}
