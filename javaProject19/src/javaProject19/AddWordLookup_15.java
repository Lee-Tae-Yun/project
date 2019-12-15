package javaProject19;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddWordLookup_15 extends JFrame {

	private JPanel contentPane;

	public AddWordLookup_15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(51, 50, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("단어");
		label.setBounds(120, 50, 57, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("번호");
		label_1.setBounds(51, 75, 57, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("단어");
		label_2.setBounds(120, 75, 57, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("번호");
		label_3.setBounds(51, 100, 57, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("단어");
		label_4.setBounds(120, 100, 57, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("번호");
		label_5.setBounds(51, 127, 57, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("단어");
		label_6.setBounds(120, 127, 57, 15);
		contentPane.add(label_6);
		
		JLabel lblNewLabel_1 = new JLabel("단어추가 조회");
		lblNewLabel_1.setBounds(173, 17, 87, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("돌아가기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(211, 205, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("확인 완료");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(82, 205, 97, 23);
		contentPane.add(button);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(249, 46, 28, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(249, 71, 28, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(249, 96, 28, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(249, 123, 28, 23);
		contentPane.add(radioButton_3);
	}
}
