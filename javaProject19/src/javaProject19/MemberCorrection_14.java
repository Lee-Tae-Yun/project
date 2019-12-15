package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberCorrection_14 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JTextField textField_4;
	private JLabel label_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField textField_8;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	
	public MemberCorrection_14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("수정할 회원정보");
		textField.setBounds(26, 23, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(154, 22, 97, 23);
		contentPane.add(btnNewButton);
		
		label = new JLabel("이름");
		label.setBounds(18, 75, 57, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 72, 116, 21);
		contentPane.add(textField_1);
		
		label_1 = new JLabel("나이");
		label_1.setBounds(18, 103, 57, 15);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 100, 116, 21);
		contentPane.add(textField_2);
		
		label_2 = new JLabel("휴대전화");
		label_2.setBounds(18, 134, 57, 15);
		contentPane.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(87, 131, 116, 21);
		contentPane.add(textField_3);
		
		label_3 = new JLabel("집전화");
		label_3.setBounds(18, 165, 57, 15);
		contentPane.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(87, 162, 116, 21);
		contentPane.add(textField_4);
		
		label_4 = new JLabel("닉네임");
		label_4.setBounds(228, 165, 57, 15);
		contentPane.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(297, 162, 116, 21);
		contentPane.add(textField_5);
		
		label_5 = new JLabel("PW");
		label_5.setBounds(228, 134, 57, 15);
		contentPane.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(297, 131, 116, 21);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(297, 100, 116, 21);
		contentPane.add(textField_7);
		
		label_6 = new JLabel("ID");
		label_6.setBounds(228, 103, 57, 15);
		contentPane.add(label_6);
		
		label_7 = new JLabel("주소");
		label_7.setBounds(228, 75, 57, 15);
		contentPane.add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(297, 72, 116, 21);
		contentPane.add(textField_8);
		
		btnNewButton_1 = new JButton("수정완료");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(65, 214, 97, 23);
		
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("돌아가기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(228, 214, 97, 23);
		contentPane.add(btnNewButton_2);
	}

}
