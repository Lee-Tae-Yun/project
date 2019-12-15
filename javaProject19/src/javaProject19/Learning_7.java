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

public class Learning_7 extends JFrame {

	private JPanel contentPane;

	public Learning_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("단어배우기");
		label.setBounds(164, 22, 68, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LG\\Desktop\\lion.png"));
		lblNewLabel.setBounds(63, 67, 110, 132);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("사자");
		lblNewLabel_1.setBounds(226, 105, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("크앙!");
		label_1.setBounds(226, 145, 57, 15);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("다음 단어");
		btnNewButton.setBounds(100, 209, 97, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Learning_8 p1 = new Learning_8();
				p1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(209, 209, 97, 23);
		contentPane.add(button);
	}

}
