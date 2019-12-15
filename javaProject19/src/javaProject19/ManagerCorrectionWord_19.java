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

public class ManagerCorrectionWord_19 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;
	private JLabel label;
	private JButton button;
	private JButton button_1;

	public ManagerCorrectionWord_19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("단어수정");
		
		lblNewLabel.setBounds(179, 24, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField("수정할 단어 검색");
		textField.setBounds(24, 60, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("검색");
		btnNewButton.setBounds(154, 59, 97, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField("단어");
		textField_1.setColumns(10);
		textField_1.setBounds(204, 135, 116, 21);
		contentPane.add(textField_1);
		
		label = new JLabel("단어 이미지");
		label.setBounds(54, 91, 116, 109);
		contentPane.add(label);
		
		button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(238, 205, 97, 23);
		contentPane.add(button);
		
		button_1 = new JButton("단어 수정");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(54, 205, 97, 23);
		contentPane.add(button_1);
	}

}
