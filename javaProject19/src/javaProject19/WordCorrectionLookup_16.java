package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCorrectionLookup_16 extends JFrame {

	private JPanel contentPane;

	public WordCorrectionLookup_16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\uD655\uC778 \uC644\uB8CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(109, 205, 97, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("단어수정 조회");
		label.setBounds(167, 17, 87, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uBC88\uD638");
		label_1.setBounds(45, 50, 57, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("수정전 단어");
		label_2.setBounds(109, 50, 72, 15);
		contentPane.add(label_2);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(279, 48, 28, 23);
		contentPane.add(radioButton_2);
		
		JButton button_1 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(238, 205, 97, 23);
		contentPane.add(button_1);
		
		JLabel label_9 = new JLabel("수정후 단어");
		label_9.setBounds(200, 50, 68, 15);
		contentPane.add(label_9);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(279, 73, 28, 23);
		contentPane.add(radioButton);
		
		JLabel label_3 = new JLabel("\uC218\uC815\uD6C4 \uB2E8\uC5B4");
		label_3.setBounds(200, 75, 68, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uC218\uC815\uC804 \uB2E8\uC5B4");
		label_4.setBounds(109, 75, 72, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uBC88\uD638");
		label_5.setBounds(45, 75, 57, 15);
		contentPane.add(label_5);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(279, 98, 28, 23);
		contentPane.add(radioButton_1);
		
		JLabel label_6 = new JLabel("\uC218\uC815\uD6C4 \uB2E8\uC5B4");
		label_6.setBounds(200, 100, 68, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\uC218\uC815\uC804 \uB2E8\uC5B4");
		label_7.setBounds(109, 100, 72, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\uBC88\uD638");
		label_8.setBounds(45, 100, 57, 15);
		contentPane.add(label_8);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(279, 123, 28, 23);
		contentPane.add(radioButton_3);
		
		JLabel label_10 = new JLabel("\uC218\uC815\uD6C4 \uB2E8\uC5B4");
		label_10.setBounds(200, 125, 68, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\uC218\uC815\uC804 \uB2E8\uC5B4");
		label_11.setBounds(109, 125, 72, 15);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\uBC88\uD638");
		label_12.setBounds(45, 125, 57, 15);
		contentPane.add(label_12);
	}

}
