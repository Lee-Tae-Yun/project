package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerDeleteWord_20 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public ManagerDeleteWord_20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("�ܾ� ����");
		label.setBounds(192, 26, 57, 15);
		contentPane.add(label);
		
		JButton button = new JButton("�˻�");
		button.setBounds(167, 61, 97, 23);
		contentPane.add(button);
		
		textField = new JTextField("������ �ܾ� �˻�");
		textField.setColumns(10);
		textField.setBounds(37, 62, 116, 21);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("�ܾ� �̹���");
		label_1.setBounds(37, 97, 116, 109);
		contentPane.add(label_1);
		
		textField_1 = new JTextField("�ܾ�");
		textField_1.setColumns(10);
		textField_1.setBounds(187, 141, 116, 21);
		contentPane.add(textField_1);
		
		JButton button_1 = new JButton("�ܾ� ����");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(37, 211, 97, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("���ư���");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(221, 211, 97, 23);
		contentPane.add(button_2);
	}

}
