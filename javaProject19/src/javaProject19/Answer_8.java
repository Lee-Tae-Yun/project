package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Answer_8 extends JFrame {

	private JPanel contentPane;

	public Answer_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC624\uB2F5\uC785\uB2C8\uB2E4");
		label.setBounds(166, 33, 67, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\LG\\Desktop\\monkey.png"));
		label_1.setBounds(93, 58, 103, 109);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC6D0\uC22D\uC774");
		label_2.setBounds(246, 105, 85, 15);
		contentPane.add(label_2);
		
		JButton button = new JButton("\uB3CC\uC544\uAC00\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_7 p1 = new Test_7();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(166, 189, 97, 23);
		contentPane.add(button);
	}
}
