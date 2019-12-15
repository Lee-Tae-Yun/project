package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberLookUP_13 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public MemberLookUP_13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("검색할 회원 정보");
		textField.setBounds(12, 10, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("검색하기");
		btnNewButton_1.setBounds(138, 9, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(247, 9, 97, 23);
		contentPane.add(button);
	}

}
