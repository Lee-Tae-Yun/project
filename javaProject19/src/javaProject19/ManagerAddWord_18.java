package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerAddWord_18 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public ManagerAddWord_18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("�ܾ� �߰�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(52, 212, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("���ư���");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
	
		btnNewButton_1.setBounds(236, 212, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("�ܾ� �̹���");
		label.setBounds(65, 49, 116, 109);
		contentPane.add(label);
		
		textField = new JTextField("�ܾ�");
		textField.setBounds(215, 93, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\uB2E8\uC5B4\uCD94\uAC00");
		label_1.setBounds(163, 24, 57, 15);
		contentPane.add(label_1);
	}

}
