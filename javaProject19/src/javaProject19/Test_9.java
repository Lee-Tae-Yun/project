package javaProject19;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Test_9 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String An;

	public Test_9() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("테스트하기");
		label.setBounds(171, 20, 75, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\LG\\Desktop\\lion.png"));
		label_1.setBounds(69, 70, 103, 109);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(234, 83, 135, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\uC815\uB2F5");
		label_2.setBounds(186, 86, 36, 15);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("정답제출");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String An = textField.getText();
				if(An.equals("사자")) {
				AnswerSubmit_11 p1 = new AnswerSubmit_11();
				p1.setVisible(true);
				dispose();
				}
				else {
					Answer_10 p1 = new Answer_10();
					p1.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(184, 125, 88, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("정답확인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer_10 p1 = new Answer_10();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(281, 124, 88, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("테스트 종료");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(158, 189, 108, 23);
		contentPane.add(button_2);
	}

}
