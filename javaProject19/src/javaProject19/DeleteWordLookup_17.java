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

public class DeleteWordLookup_17 extends JFrame {

	private JPanel contentPane;

	public DeleteWordLookup_17() {
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
		button.setBounds(103, 210, 97, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("단어삭제 조회");
		label.setBounds(194, 22, 87, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uBC88\uD638");
		label_1.setBounds(34, 55, 57, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uB2E8\uC5B4");
		label_2.setBounds(90, 55, 57, 15);
		contentPane.add(label_2);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(270, 51, 28, 23);
		contentPane.add(radioButton_2);
		
		JButton button_1 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerMain_3 p1 = new ManagerMain_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(232, 210, 97, 23);
		contentPane.add(button_1);
		
		JLabel label_3 = new JLabel("삭제사유");
		label_3.setBounds(159, 55, 57, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\uBC88\uD638");
		label_4.setBounds(34, 80, 57, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\uB2E8\uC5B4");
		label_5.setBounds(90, 80, 57, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uC0AD\uC81C\uC0AC\uC720");
		label_6.setBounds(159, 80, 57, 15);
		contentPane.add(label_6);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(270, 76, 28, 23);
		contentPane.add(radioButton);
		
		JLabel label_7 = new JLabel("\uBC88\uD638");
		label_7.setBounds(34, 105, 57, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\uB2E8\uC5B4");
		label_8.setBounds(90, 105, 57, 15);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\uC0AD\uC81C\uC0AC\uC720");
		label_9.setBounds(159, 105, 57, 15);
		contentPane.add(label_9);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(270, 101, 28, 23);
		contentPane.add(radioButton_1);
		
		JLabel label_10 = new JLabel("\uBC88\uD638");
		label_10.setBounds(34, 130, 57, 15);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\uB2E8\uC5B4");
		label_11.setBounds(90, 130, 57, 15);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\uC0AD\uC81C\uC0AC\uC720");
		label_12.setBounds(159, 130, 57, 15);
		contentPane.add(label_12);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(270, 126, 28, 23);
		contentPane.add(radioButton_3);
	}

}
