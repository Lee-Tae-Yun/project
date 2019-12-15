package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start_0 extends JFrame {

	private JPanel contentPane;

	

	public Start_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("관리자 로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogin_1 p1 = new ManagerLogin_1();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(66, 62, 130, 141);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("사용자로그인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_1 p1 = new login_1();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(231, 62, 130, 141);
		contentPane.add(button);
	}
}
