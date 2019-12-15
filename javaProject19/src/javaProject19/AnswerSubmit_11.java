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

public class AnswerSubmit_11 extends JFrame {

	private JPanel contentPane;

	public AnswerSubmit_11() {
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
		label.setIcon(new ImageIcon("C:\\\\Users\\\\LG\\\\Desktop\\\\lion.png"));
		label.setBounds(91, 62, 103, 109);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("사자");
		label_1.setBounds(244, 109, 85, 15);
		contentPane.add(label_1);
		
		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_9 p1 = new Test_9();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(232, 192, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uB2E4\uC74C \uBB38\uC81C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_10 p1 = new Test_10();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(97, 192, 97, 23);
		contentPane.add(button_1);
	
		
	}

}
