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

public class AnswerSubmit_10 extends JFrame {

	private JPanel contentPane;

	public AnswerSubmit_10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("정답입니다");
		lblNewLabel.setBounds(164, 37, 67, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\\\Users\\\\LG\\\\Desktop\\\\cat.png"));
		label.setBounds(91, 62, 103, 109);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("고양이");
		label_1.setBounds(244, 109, 85, 15);
		contentPane.add(label_1);
		
		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_8 p1 = new Test_8();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(209, 193, 97, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\uB2E4\uC74C\uBB38\uC81C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_9 p1 = new Test_9();
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(85, 193, 97, 23);
		contentPane.add(btnNewButton);
	
		
	}

}
